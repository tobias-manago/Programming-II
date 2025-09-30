import java.util.UUID;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Factura {
    private final String id;
    private final LocalDateTime fecha;
    private BigDecimal monto; // monto total antes de descuento
    private final cliente cliente;

    // Formateador para mostrar fecha legible
    private static final DateTimeFormatter FORMATO_FECHA =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Factura(BigDecimal monto, cliente cliente) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.fecha = LocalDateTime.now();
        this.monto = monto.setScale(2, RoundingMode.HALF_UP);
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public cliente getCliente() {
        return cliente;
    }

    // Método que calcula el monto final después del descuento del cliente
    public BigDecimal calcularMontoFinal() {
        BigDecimal descuentoPct = cliente.getDescuento()
                .divide(BigDecimal.valueOf(100), 6, RoundingMode.HALF_UP);
        BigDecimal factor = BigDecimal.ONE.subtract(descuentoPct);
        return monto.multiply(factor).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        // Formato pedido:
        // Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?, email=?, descuento=?]]
        BigDecimal montoDesc = calcularMontoFinal();
        return String.format("Factura[id=%s, fecha=%s, monto=%s, montoDesc=%s, %s]",
                id,
                fecha.format(FORMATO_FECHA),
                monto.toPlainString(),
                montoDesc.toPlainString(),
                cliente.toString());
    }

    public void imprimir() {
        System.out.println(this.toString());
    }
}
