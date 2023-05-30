import java.util.Scanner;

public class SalarioProf {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Qual seu regime de pagamento? (CLT, Horista ou PJ) ");
        String regime = teclado.nextLine();

        if (regime.equalsIgnoreCase("clt")) {
            System.out.print("Qual seu salário mensal? ");
            double salario = teclado.nextDouble();
            System.out.println("Nome: " + nome);
            System.out.printf("Você irá receber R$%.2f", salario);

        } else if (regime.equalsIgnoreCase("horista")) {
            System.out.print("Qual a quantidade de horas trabalhadas por dia? ");
            double horasHorista = teclado.nextDouble();
            System.out.print("Qual o valor da hora trabalhada? ");
            double valorHora = teclado.nextDouble();
            double valorAReceber = valorHora * horasHorista;
            System.out.println("Nome: " + nome);
            System.out.printf("Você irá receber R$%.2f por dia e R$%.2f por mês.", valorAReceber, valorAReceber*22);

        } else if (regime.equalsIgnoreCase("PJ")) {
            System.out.print("Qual o valor do seu contrato? ");
            double valorContrato = teclado.nextDouble();
            System.out.println("Nome: " + nome);
            System.out.printf("Você irá receber R$%.2f", valorContrato);
        } else {
            System.out.println("Regime de pagamento inválido.");
        }
        teclado.close();
    }
}