import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo! Digite o número da agência:");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite a agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o seu saldo:");
        float saldo = scanner.nextFloat();
        scanner.nextLine(); 

        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco! Sua agên2255cia é %s, seu número é %d e o seu saldo de R$ %.2f já está disponível para saque.%n",
            nomeCliente, agencia, numero, saldo);

        scanner.close();
    }
}
