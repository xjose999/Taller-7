public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Manuel", 2500.0);

        emp.nombre = "Jose";
        emp.setSalario(3000.0);

        System.out.println("Nombre: " + emp.nombre);
        System.out.println("Salario: " + emp.getSalario());
    }
}