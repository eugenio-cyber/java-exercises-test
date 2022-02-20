
// importação
import java.util.Scanner;

public class questao_02 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // declaração das variáveis
        String senha = "";
        int quantidade = 0;
        int sobra = 0;

        // chamada para inserção do dado do usuário
        System.out.println("Digite a senha:");
        senha = leitor.next();

        quantidade = senha.length();

        // verificação do quantidade de caracteres digitados pelo usuário
        if (quantidade < 6) {
            sobra = 6 - quantidade;
            System.out.println(sobra);
        }
    }
}
