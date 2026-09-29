public class Teste02 {
    public static void main(String[] args) {
        System.out.println("--- EXERCÍCIO 2 ---");

        int a = Teclado.leInt("Digite o valor de a: ");
        int b = Teclado.leInt("Digite o valor de b: ");
        int c = Teclado.leInt("Digite o valor de c: ");
        int guarda;

        // IF 1
        boolean cond1 = (a < b);
        System.out.println("if 1 (a < b): " + cond1);
        if (cond1) {
            guarda = a;
            a = b;
            b = guarda;
        }

        // IF 2
        boolean cond2 = (b < c);
        System.out.println("if 2 (b < c): " + cond2);
        if (cond2) {
            guarda = b;
            b = c;
            c = guarda;

            // IF 3 (Só é testado se o IF 2 for true)
            boolean cond3 = (a < b);
            System.out.println("if 3 (a < b): " + cond3);
            if (cond3) {
                guarda = a;
                a = b;
                b = guarda;
            }
        } else {
            System.out.println("if 3 (a < b): Não foi executado (IF 2 deu false)");
        }

        System.out.println("\nValores finais -> a: " + a + ", b: " + b + ", c: " + c);
    }
}