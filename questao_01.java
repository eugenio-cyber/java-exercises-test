import java.util.Scanner;

public class questao_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = 0;
        String value = "*";

        System.out.println("Digite o valor: ");
        num = scan.nextInt();

        for (int cont = 1; cont <= num; cont++) {

            if (cont == num) {
                System.out.print(value);
            } else {
                System.out.println(value);
            }

            value += "*";
        }
    }
}