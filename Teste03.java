public class Teste03 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        boolean b1 = false;
        boolean b2 = false;

        x++; // x passa a ser 3
        b1 = y != x; // 5 != 3 -> true
        b2 = (y >= x) && b1; // (5 >= 3) && true -> true && true -> true

        System.out.println(b1 + " - " + x + " - " + b2 + " - " + y);

        y = y / x; // 5 / 3 em divisão inteira resulta em 1
        b1 = !b1; // negação de true vira false
        b2 = (x == y) || b1 && b2; // (3 == 1) || (false && true) -> false || false -> false

        System.out.println(b1 + " - " + x + " - " + b2 + " - " + y);
    }
}