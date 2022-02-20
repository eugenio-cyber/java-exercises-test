
// importação
import javax.swing.JOptionPane;

public class questao_02 {
    public static void main(String[] args) {

        // declaração das variáveis
        String senha = "";
        int quantidade = 0;
        int sobra = 0;

        // chamada para inserção do dado do usuário
        senha = JOptionPane.showInputDialog("Digite a senha:");

        quantidade = senha.length();

        // verificação do quantidade de caracteres digitados pelo usuário
        if (quantidade < 6) {
            sobra = 6 - quantidade;
            System.out.println(sobra);
        }
    }
}
