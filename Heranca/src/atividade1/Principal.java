package atividade1;

import atividade1Classes.Aluno;
import atividade1Classes.Professor;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Professor professor = new Professor("Ramon");
        String turma, opcao;
        Boolean continuaInserindo = true;

        System.out.println("Informe o nome da turma:");
        turma = teclado.nextLine();

        professor.setTurma(turma);

        while (continuaInserindo) {
            System.out.println("Welcome!!");
            System.out.println("1 - Inserir Aluno");
            System.out.println("2 - Ver alunos");
            System.out.println("0 - Sair");
            opcao = teclado.nextLine();

            switch (opcao) {
                case "1":
                    Aluno novoALuno = new Aluno();
                    System.out.println("Digite o nome do aluno");
                    novoALuno.setNome(teclado.nextLine());
                    
                    break;

                case "2":

                    break;

                case "0":

                    break;

                default:

                    break;

            }
        }
    }
    
    public static void inserirAluno (Professor professor, String turma){
        
    }
}
