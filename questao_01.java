
// importação
import javax.swing.JOptionPane;

public class questao_01 {
    public static void main(String[] args) {

        // declaração das variáveis
        int tamanho = 0;
        int tamanho2 = 0;
        int contador;
        int contador2;
        String espacos = "";
        String asteriscos = "*";
        String resposta = "";

        // chamada para inserção do dado do usuário
        tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da escada:"));
        tamanho2 = tamanho;

        // looping realizado para criação do tamanho da esacada
        for (contador = 1; contador <= tamanho; contador++) {

            // looping realizado para adição dos espaços nas linhas
            for (contador2 = 1; contador2 <= tamanho2 - 1; contador2++) {
                espacos += " ";
            }

            resposta = espacos + asteriscos;

            System.out.println(resposta);
            espacos = "";
            tamanho2 -= 1;
            asteriscos += "*";
        }
    }
}