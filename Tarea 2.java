public class Main {
    public static void main(String[] args) {
        int numerolf = 10;
        if (numerolf > 0){
            System.out.println("Es positivo");

        } else if (numerolf < 0){
            System.out.println("Es negativo");
        } else {
            System.out.println("Es 0");
        }
        var numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        do {
            System.out.println("Este es el resultado del bucle do While:");
            System.out.println(numeroWhile);
            numeroWhile++;
        } while(numeroWhile < 3);
        System.out.println("Este es el bucle For");
        for (int numeroFor = 0;numeroFor <= 3;numeroFor++){
            System.out.println((numeroFor));
        }
        System.out.println("Este es del switch case:");
        String estacion = "Verano";
        switch (estacion){
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("El valor no es una estación");
            }

        }

}
