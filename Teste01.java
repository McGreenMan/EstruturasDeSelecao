public class Teste01 {
    public static void main(String[] args) {
        System.out.println("--- EXERCÍCIO 1 ---");

        // a) Raiz quadrada
        System.out.println("\n-- Item A --");
        double n = Teclado.leDouble("Digite um numero (n): ");
        if (n > 0) {
            double raiz = Math.sqrt(n);
            System.out.println("Raiz: " + raiz);
        }

        // b) Média Aprovado / Grau C
        System.out.println("\n-- Item B --");
        double media = Teclado.leDouble("Digite a media: ");
        if (media >= 6.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Precisa grau C");
        }

        // c) Condição em cadeia
        System.out.println("\n-- Item C --");
        int x = Teclado.leInt("Digite x: ");
        int y = Teclado.leInt("Digite y: ");
        int z = Teclado.leInt("Digite z: ");
        int r = 0;
        if (x > y) {
            if (x > z) {
                if (y != z) {
                    r = 1;
                }
            }
        }
        System.out.println("Resultado r: " + r);

        // d) Condição com senão r = 2
        System.out.println("\n-- Item D --");
        x = Teclado.leInt("Digite x: ");
        y = Teclado.leInt("Digite y: ");
        z = Teclado.leInt("Digite z: ");
        r = 0;
        if (x > y) {
            if (x > z) {
                if (y != z) {
                    r = 1;
                } else {
                    r = 2;
                }
            }
        }
        System.out.println("Resultado r: " + r);

        // e) Simulando alu.getMedia()
        System.out.println("\n-- Item E --");
        double aluMedia = Teclado.leDouble("Digite a media do aluno: ");
        String mensagem;
        if (aluMedia >= 6.0) {
            mensagem = "Aprovado";
        } else {
            mensagem = "Precisa grau C";
        }
        System.out.println("Mensagem: " + mensagem);

        // f) Menção por notas
        System.out.println("\n-- Item F --");
        double mediaFinal = Teclado.leDouble("Digite a media final: ");
        String resultado;
        if (mediaFinal >= 9.3) {
            resultado = "Otimo";
        } else if (mediaFinal >= 8.5) {
            resultado = "Bom";
        } else if (mediaFinal >= 6.0) {
            resultado = "Aprovado";
        } else {
            resultado = "Em recuperacao";
        }
        System.out.println("Resultado: " + resultado);
    }
}