import java.util.Locale;
import java.util.Scanner;

public class  ContaTerminal{

    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta-corrente");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome completo");
        String nomeCliente = "";
        nomeCliente+=scanner.next();
        nomeCliente+=scanner.nextLine();
        System.out.println("Digite o seu Saldo");
        double saldo = scanner.nextDouble();

         //imprimindo os dados obtidos pelo usuário

         System.out.println("Olá "+ nomeCliente.toUpperCase() + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}