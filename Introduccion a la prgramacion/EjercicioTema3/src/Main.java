public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(10,20,40);
        System.out.println("El resultado de la suma es: "+resultado);

        coche miCoche = new coche();
        miCoche.SumarPuertas();

        System.out.println("El numero total de puertas es: "+miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}

class coche{
    public int puertas = 4;

    public void SumarPuertas(){
        this.puertas++;
    }
}