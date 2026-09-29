public class Teste06 {
    public static void main(String[] args) {
        System.out.println("--- EXERCÍCIO 6 ---");

        // Lê a String do teclado e pega o primeiro caractere digitado
        String entrada = Teclado.leString("Digite o turno [M-manha ou T-tarde ou N-Noite]: ");
        char turno = ' ';
        
        if (entrada.length() > 0) {
            turno = entrada.charAt(0);
        }

        // Estrutura condicional completa
        if (turno == 'M' || turno == 'm') {
            System.out.println("bom dia");
        } else if (turno == 'T' || turno == 't') {
            System.out.println("boa tarde");
        } else if (turno == 'N' || turno == 'n') {
            System.out.println("boa noite");
        } else {
            System.out.println("turno invalido");
        }
    }
}