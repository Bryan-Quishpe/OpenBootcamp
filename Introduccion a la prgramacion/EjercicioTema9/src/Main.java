public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setTelefono(987139598);
        cliente.setCredito(100.50);
        cliente.setEdad(23);
        cliente.setNombre("Bryan");
        System.out.println("Nombre del cliente: "+cliente.getNombre());
        System.out.println("Edad del cliente: "+cliente.getEdad());
        System.out.println("Telefono del cliente: "+cliente.getTelefono());
        System.out.println("Credito del cliente: "+cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setTelefono(987139598);
        trabajador.setEdad(23);
        trabajador.setNombre("Bryan");
        trabajador.setSalario(700.50);
        System.out.println("Nombre del trabajador: "+trabajador.getNombre());
        System.out.println("Edad del trabajador: "+trabajador.getEdad());
        System.out.println("Telefono del trabajador: "+trabajador.getTelefono());
        System.out.println("Salario del Trabajador: "+trabajador.getSalario());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return telefono;
    }
}

class Cliente extends Persona{
    private double credito;

    public void setCredito(double credito){
        this.credito =credito;
    }

    public double getCredito(){
        return credito;
    }
}

class Trabajador extends Persona{
    private double salario;

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }
}
