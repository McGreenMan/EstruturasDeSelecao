public class Teste05 {
    public static void main(String[] args) {
        System.out.println("--- EXERCÍCIO 5 ---");

        int tempa1 = Teclado.leInt("Digite a1 = ");
        int tempa2 = Teclado.leInt("Digite a2 = ");
        int tempb1 = Teclado.leInt("Digite b1 = ");
        int tempb2 = Teclado.leInt("Digite b2 = ");
        int tempc1 = Teclado.leInt("Digite c1 = ");
        int tempc2 = Teclado.leInt("Digite c2 = ");
        int tempd1 = Teclado.leInt("Digite d1 = ");
        int tempd2 = Teclado.leInt("Digite d2 = ");

        boolean a = tempa1 == tempa2;
        boolean b = tempb1 == tempb2;
        boolean c = tempc1 == tempc2;
        boolean d = tempd1 == tempd2;

        System.out.println("A: " + a + " | B: " + b + " | C: " + c + " | D: " + d);

        if (a) {
            System.out.println("C1");
            if (b) {
                System.out.println("C2");
            } else if (c) {
                System.out.println("C3");
            } else if (d) {
                System.out.println("C4");
                System.out.println("C5");
            } else {
                System.out.println("C6");
            }
        }
    }
}