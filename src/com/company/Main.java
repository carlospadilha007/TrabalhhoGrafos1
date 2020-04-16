package com.company;

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
        System.out.println("0- Sair");
    }



    public static void main(String[] args) {
	// write your code here
        Grafo redeSocial = new Grafo();
        redeSocial.inicializarGrafos();
        Scanner teclado = new Scanner(System.in);
        while (true){

        }
    }
}
