package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("Digite uma opção: ");
        System.out.println("1- Inserir usuario");
        System.out.println("2- Inserir relação");
        System.out.println("3- Listar seguidores");
        System.out.println("4- Listar seguidores velhos");
        System.out.println("5- Atualizar relação");
        System.out.println("6- Remover usuario");
        System.out.println("7- Remover relação");
        System.out.println("8- Auterar mode de exibicao");
        System.out.println("0- Sair");
    }

    public static void menuExibicao(){
        System.out.println("Digite uma qual estrura deseja ver: ");
        System.out.println("1- Matriz Pesos");
        System.out.println("2- Lista ajdcencia");
        // System.out.println("3- Arvore Robro-Negra");
    }



    public static void main(String[] args) throws IOException, InterruptedException {
	// write your code here
        int metodoExibicao;
        Grafo redeSocial = new Grafo();
        redeSocial.inicializarGrafos();
        Scanner scanner = new Scanner(System.in);
        while (true){
            menuExibicao();
            metodoExibicao = scanner.nextInt();
            if (metodoExibicao == 1 || metodoExibicao == 2|| metodoExibicao == 3)
                break;
            else System.out.println("Valor invalido!\nTente novamente!");
        }
        while (true){
            menu();
            int op = scanner.nextInt();
            switch (op){
                case 1:{
                    redeSocial.inserirUsuario();
                }break;
                case 2:{
                    redeSocial.inserirRelacao();
                }break;
                case 3:{
                    redeSocial.listarSeguidores(metodoExibicao);
                }break;
                case 4:{
                    redeSocial.listarSeguidoresVelhos(metodoExibicao);
                }break;
                case 5:{
                    redeSocial.atualizarRelacao();
                }break;
                case 6:{
                    redeSocial.removerUsuario();
                }break;
                case 7:{
                    redeSocial.removerRelacao();
                }break;
                case 0:{
                    System.exit(00);
                }break;
                case 8:{
                    while (true){
                        menuExibicao();
                        metodoExibicao = scanner.nextInt();
                        if (metodoExibicao == 1 || metodoExibicao == 2|| metodoExibicao == 3)
                            break;
                        else System.out.println("Valor invalido!\nTente novamente!");
                    }
                }break;
                default:
                    throw new IllegalStateException("Unexpected value: " + op);
            }

        }
    }
}
