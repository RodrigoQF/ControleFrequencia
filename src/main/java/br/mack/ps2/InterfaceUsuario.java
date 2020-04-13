package br.mack.ps2;

import br.mack.ps2.entidades.Controle;
import br.mack.ps2.persistencia.ControleDAO;

import java.util.List;
import java.util.Scanner;
import java.sql.*;
public class InterfaceUsuario {
    ControleDAO dao;
    Scanner in;

    public InterfaceUsuario(ControleDAO dao) {
        this.dao = dao;
        this.in = new Scanner(System.in);
    }

    public void iniciar() {
        imprimirMenu();
    }

    private void imprimirMenu() {
        int opc = 0;
        do {
            System.out.println("= Menu =");
            System.out.println("\t1. Inserir");
            System.out.println("\t2. Ler");
            System.out.println("\t3. Sair");
            System.out.print("Escolha uma opção: ");
            opc = in.nextInt();

            in.nextLine();

            switch (opc) {
                case 1:
                    this.create();
                    break;
                case 2:
                    this.read();
                    break;
                case 3:
                    System.out.println("tchau :)");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        } while (opc != 3);
    }

    private void create() {
        Controle controle = new Controle();

        System.out.println("*** Novo aluno ***");
        System.out.print("\nInforme o TIA do aluno: ");
        controle.setTia(in.nextInt());

        in.nextLine();

        System.out.print("Informe o NOME do aluno: ");
        controle.setNome(in.nextLine());

        System.out.print("Informe a Hora de entrada do aluno: ");
        controle.setHorario_Entrada(in.nextLine());

        System.out.print("Informe a Hora de Saida do aluno: ");
        controle.setHorario_Saida(in.nextLine());

        if (dao.create(controle)) {
            System.out.println("Frequencia adicionada ao banco de Dados");
        } else {
            System.out.println("Ops: problema ao adicionar a frequencia do aluno");
        }
    }

    private void read() {
        List<Controle> controles = dao.read();

        System.out.println("\n***********************************");
        System.out.println("*** Lista de Alunos e Frequencia Cadastrados ***");
        System.out.println("***********************************");
        for (Controle controle : controles) {
            System.out.println(controle);
        }
    }
}

