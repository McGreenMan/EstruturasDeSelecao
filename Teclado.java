import java.util.Scanner;

public class Teclado {

    private static Scanner scanner = new Scanner(System.in);



    public static String leString(String mensagem) {

        System.out.print(mensagem);

        return scanner.nextLine();

    }



    public static int leInt(String mensagem) {

        System.out.print(mensagem);

        int valor = scanner.nextInt();

        scanner.nextLine();

        return valor;

    }



    public static double leDouble(String mensagem) {

        System.out.print(mensagem);

        double valor = scanner.nextDouble();

        scanner.nextLine();

        return valor;

    }

}