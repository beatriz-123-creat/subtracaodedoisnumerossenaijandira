import java.util.Scanner;

public class SubtracaoDoisNumeros {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        //para o usuário
        System.out.print("Digite um valor inteiro: ");
        int primeiroValor = leitor.nextInt();
        System.out.print("Digite outro valor inteiro: ");
        int segundoValor = leitor.nextInt();

        int resultadoValor = 0;

        //estrutura de repetição/calculo para o programa;
        if (primeiroValor > segundoValor) {
            resultadoValor = primeiroValor - segundoValor;
        } else {
            resultadoValor = segundoValor - primeiroValor;
        }
        System.out.println("A diferença entre os dois valor é: " + resultadoValor);
    }
}
