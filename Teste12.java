public class Teste12 {
    public static void main(String[] args) {
        double n1 = Teclado.leDouble("Digite a primeira nota: ");
        double n2 = Teclado.leDouble("Digite a segunda nota: ");
        double n3 = Teclado.leDouble("Digite a terceira nota: ");

        calcularMedia(n1, n2, n3);
    }

    public static void calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.printf("Media: %.2f\n", media);

        // mostra a nota do aluno
        if ((media >= 0) && (media < 4)) {
            System.out.println("Nota E");
        } else if (media < 5) {
            System.out.println("Nota D");
        } else if (media < 7) {
            System.out.println("Nota C");
        } else if (media < 8) {
            System.out.println("Nota B");
        } else if (media <= 10) {
            System.out.println("Nota A");
        } else {
            System.out.println("Media invalida!");
        }
    }
}