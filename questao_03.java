
// importação
import javax.swing.JOptionPane;

public class questao_03 {
    public static void main(String[] args) {

        // declaração das variáveis
        String copiaPalavraAnagrama = "";
        String substringsAnagrama = "";
        int resultadoAnagrama = 0;

        // chamada para inserção do dado do usuário
        String palavraAnagrama = JOptionPane.showInputDialog("Digite a palavra que você deseja realizar o anagrama: ");

        // copia da palavraAnagrama para realização da comparação da string consigo
        // mesma
        copiaPalavraAnagrama = palavraAnagrama;

        // looping onde é realizada a lógica para saber caso haja um anagrama na palavra
        for (int contadorPrimario = 0; contadorPrimario < palavraAnagrama.length(); contadorPrimario++) {

            // declaração das variáveis internas
            char caractereAnagrama = palavraAnagrama.charAt(contadorPrimario);
            int contadorAnagrama = 0;

            for (int contadorSecundario = 0; contadorSecundario < copiaPalavraAnagrama.length(); contadorSecundario++) {
                if (caractereAnagrama == copiaPalavraAnagrama.charAt(contadorSecundario)) {
                    contadorAnagrama += 1;
                    if (contadorAnagrama == 2) {
                        resultadoAnagrama += 1;
                    }
                }
            }
        }

        // etapa responsável por descobrir caso há um anagrama ou não na palavra
        if (resultadoAnagrama >= 2) {
            System.out.println("Há um anagrama nessa palavra");
        } else {
            System.out.println("Não há uma anagrama nessa palavra");
        }

        /*
         * Infelizmente essa etapa não foi concluida, mas seria responsável por montar
         * não consegui. O objetivo inicial era realizar e descobrir todas as substrings
         * com
         * esse looping, como também realizar a reversão dela para conseguir fazer a
         * comparação
         * e assim, dizer quantos anagramas há nas substrings
         */

        for (int i = 0; i < palavraAnagrama.length(); i++) {

            // declaração das variáveis internas
            String subStringsInvertidas = "";
            char caractereAnagrama = palavraAnagrama.charAt(i);

            substringsAnagrama += Character.toString(caractereAnagrama);
            subStringsInvertidas = new StringBuilder(substringsAnagrama).reverse().toString();
            substringsAnagrama.substring(i, substringsAnagrama.length());
        }

    }
}
