import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("**************");
        System.out.println("Conta bancária");
        System.out.println("**************");

        System.out.println("Por favor, informe seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Inforome sua agência: ");
        String agencia = sc.nextLine();
        System.out.println("Seu número: ");
        int numero = sc.nextInt();
        System.out.println("Informe seu saldo atual: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é de " + saldo + 
        " já está disponível para saque!");
        


    }
}
