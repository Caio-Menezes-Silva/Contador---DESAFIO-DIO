import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();
        System.out.println();

        try {

            contar(parametroUm, parametroDois);

            System.out.println();

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm < parametroDois) {
            int contagem = parametroDois - parametroUm;

            for (int i = 1; i <= contagem; i++) {

                System.out.println(i);
            }

        } else {
            throw new ParametrosInvalidosException();
        }

    }
}
