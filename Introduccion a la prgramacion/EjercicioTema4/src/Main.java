public class Main {
    public static void main(String[] args) {
        //If
        int nummeroIf = 10;
        if (nummeroIf < 0){
            System.out.println("Negativo");
        } else if (nummeroIf > 0) {
            System.out.println("Positivo");
        }else {
            System.out.println("Igual a 0");
        }

        //While
        int numeroWhile = 1;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        //Do While
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }while (numeroWhile < 3);

        //For
        for (int numeroFor = 0; numeroFor <=3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Switch
        String estacion = "otoño";
        switch (estacion){
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Esta en default");
                break;
        }
    }
}