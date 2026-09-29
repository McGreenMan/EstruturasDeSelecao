public class Teste07 {
    public static void main(String[] args) {
        int num = Teclado.leInt("Digite um numero: ");
        exibirMensagem(num);
    }

    public static void exibirMensagem(int num) {
        if (num > 0) {
            System.out.println(num + " eh Positivo");
        } else if (num < 0) {
            System.out.println(num + " eh Negativo");
        } else {
            System.out.println(num + " eh Zero");
        }
    }
}