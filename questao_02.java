import java.util.Scanner;

public class questao_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String senha = "";
        int quant = 0;
        int sobra = 0;

        System.out.println("Digite a senha: ");
        senha = scan.next();

        quant = senha.length();

        if (quant < 6) {
            sobra = 6 - quant;

            System.out.println(sobra);
        }
    }
}
