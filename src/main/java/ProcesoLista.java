public class ProcesoLista {
    public static void main(String[] args) {
        System.out.println("Adiosgg");
        if(args.length == 0){
            System.out.println("Faltan argumentos");
            System.exit(1);
        }

        int suma = 0, media = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int i = 0;
        while (i < args.length) {
            String arg = args[i];
            int x = 0;
            try {



                x = Integer.parseInt(arg);
            } catch (NumberFormatException ex) {
                System.out.println("Error en formato de numeros.");
                System.exit(2);
            }


            min = Math.min(min, x);
            max = Math.max(max, x);
            suma = suma + x;
            i++;
        }

        System.out.println("Suma: " + suma);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Media: " + (suma / args.length));


    }
}
