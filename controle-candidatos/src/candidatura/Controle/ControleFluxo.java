package candidatura.Controle;

import java.util.Scanner;

import candidatura.Controle.excecao.ParametrosInvalidosException;

public class ControleFluxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int n1 = numeroInteiro(sc);
        System.out.println("Digite o segundo parâmetro: ");
        int n2 = numeroInteiro(sc);

        try{contar(n1, n2);
        } catch(ParametrosInvalidosException e){
            System.out.println("Sistema deu erro: " + e.getMessage());
        }

        
    }

    static void contar(int n1, int n2) throws ParametrosInvalidosException{
        if (n1 <= n2) {
            throw new ParametrosInvalidosException();
        } else{
            int contagem = n1 - n2;
            for(int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo a contagem " + i + " vez");
            }
        }
    }

    public static int numeroInteiro(Scanner sc){
        while (true) {
            try{
                return sc.nextInt();
            } catch(NumberFormatException e){
                System.out.println("Entrada com número invalida! Digite um número que seja inteiro: ");
            }
        }
    }

}
