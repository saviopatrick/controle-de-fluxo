import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo numero");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm,parametroDois);

        } catch (ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }


    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int difrenca = parametroDois - parametroUm;

        for (int i = 0; i <= difrenca; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }


}