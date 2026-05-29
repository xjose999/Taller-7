public class PruebaCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456", 500.0, "Ahorros");

        // ERROR DE COMPILACIÓN: numeroCuenta tiene acceso privado en CuentaBancaria
        // cuenta.numeroCuenta = "654321";

        cuenta.setSaldo(600.0);
        cuenta.mostrarDetalles();
    }
}
