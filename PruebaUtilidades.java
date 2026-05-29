public class PruebaUtilidades {
    public static void main(String[] args) {
        Utilidades ut = new Utilidades();

        System.out.println("Suma: " + ut.sumar(10, 5));
        System.out.println("Resta: " + ut.restar(10, 5));
        System.out.println("Multiplicación: " + ut.multiplicar(10, 5));
        System.out.println("División: " + ut.dividir(10, 5));
    }
}