public class Teste10 {
    public static void main(String[] args) {
        System.out.println("-----Retorna pessoa mais velha-----");
        System.out.println("-----Digite os dados da Pessoas-----");

        Pessoa p1 = new Pessoa(
            Teclado.leString("Digite o nome da 1 Pessoa: "),
            Teclado.leInt("Digite a idade da 1 Pessoa: ")
        );

        Pessoa p2 = new Pessoa(
            Teclado.leString("Digite o nome da 2 Pessoa: "),
            Teclado.leInt("Digite a idade da 2 Pessoa: ")
        );

        // Recebe o resultado retornado do método e imprime na tela
        String resultado = compararIdades(p1, p2);
        System.out.println("Resultado: " + resultado);
    }

    // Método que retorna o nome da pessoa mais velha ou "Mesma idade"
    public static String compararIdades(Pessoa pessoa1, Pessoa pessoa2) {
        if (pessoa1.getIdade() > pessoa2.getIdade()) {
            return pessoa1.getNome();
        } else if (pessoa2.getIdade() > pessoa1.getIdade()) {
            return pessoa2.getNome();
        } else {
            return "Mesma idade";
        }
    }
}