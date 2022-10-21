public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Bryan");
        System.out.println("Este es mi nombre: "+persona.getNombre());

        persona.setEdad(22);
        System.out.println("Esta es mi edad: "+persona.getEdad());

        persona.setTelefono(987139598);
        System.out.println("Este es mi telefono: "+persona.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return  telefono;
    }
}