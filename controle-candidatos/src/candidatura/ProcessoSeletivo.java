package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MATHEUS"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativas++;
            } else{
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativas<3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " NA " + tentativas);
        }
        else{
            System.out.println("Não conseguimos contato com " + candidato + ", número maximo de tentativas " + tentativas + " realizadas");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }


    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "MATHEUS"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for(int i = 0; i < candidatos.length; i++){
            System.out.println("O candidato de n " + (i + 1) + " é o " + candidatos[i]);
        }

        System.out.println("Forma abreviada de interação for each");

        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }



    static void selecaoCandidato(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "AUGUSTO", "PAULO", "MATHEUS", "JEFFERSON", "AMANADA", "DANIEL", "GABRIEL"};
        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;
        while (candidatoSelecionado < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato+ " Solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato  " + candidato + " foi selecionado para a vaga!");
                candidatoSelecionado++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else{
            System.out.println("Agurdadndo o resultado dos demais candidatos");
        }
    }
    
}
