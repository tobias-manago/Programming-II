import java.util.UUID;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class cliente {
    private final String id;
    private String nombre;
    private String email;
    private BigDecimal descuento; // porcentaje (0 - 100)

    public cliente(String nombre, String email, double descuentoPercent) {
        this.id = UUID.randomUUID().toString().replace("-", ""); // id alfanumérico
        this.nombre = nombre;
        this.email = email;
        this.descuento = BigDecimal.valueOf(descuentoPercent)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        // Formato pedido: Cliente[id=?, nombre=?, email=?, descuento=?]
        return String.format("Cliente[id=%s, nombre=%s, email=%s, descuento=%s]",
                id, nombre, email, descuento.toPlainString());
    }

    public void imprimir() {
        System.out.println(this.toString());
    }
}
