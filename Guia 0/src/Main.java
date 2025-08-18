public class Main {
    public static void main(String[] args) {
        int numN = 2;
        double numA = 231.45;
        char NumC = 'A';

        System.out.println("el numero N es: " + numN);
        System.out.println("el numero A es: " + numA);
        System.out.println("el caracter C es: " + NumC);
        System.out.println("la suma de N + A es: " + (numN + numA));
        System.out.println("la diferencia de A - N es: " + (numA - numN));
        System.out.println("el valor numerico correspondiente al caracter C es: " + (int) NumC);
        //punto 1
        int numX = 5;
        int numY = 10;
        double numM = 15.5;
        double numN1 = 20.0;
        System.out.println("el resultado de la division de Y / X es: " + (numY / numX));
        System.out.println("el resultado de la multiplicacion de N * M es: " + (numN1 * numM));
        //punto 2



        //punto 3
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;

        int aux = B; // Guardar el valor original de B

        B = C; // B toma el valor de C
        C = A; // C toma el valor de A
        A = D; // A toma el valor de D
        D = aux; // D toma el valor original de B

        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        //punto 4
        int se = 7; // Puedes cambiar el valor de A

        if (se % 2 == 0) {
            System.out.println("se es par");
        } else {
            System.out.println("se es impar");
        }
        //punto 5
    }
}