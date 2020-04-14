package com.company;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Grafo {
    private int NUMERO_USUARIOS = 51;
    // Arvore de Usuarios
    private Usuario[][] matrizUsuarios = new Usuario[this.getNUMERO_USUARIOS()][this.getNUMERO_USUARIOS()];
    private int[][] matrizU = new int[this.getNUMERO_USUARIOS()][this.getNUMERO_USUARIOS()];
    private int[][] matrizPesos = new int[this.getNUMERO_USUARIOS()][this.getNUMERO_USUARIOS()];
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private Set<Usuario> arvoreUsuarios = new TreeSet<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>(); // lista de dados de todos os usuarios
    public Grafo() {

    }

    public int getNUMERO_USUARIOS() {
        return NUMERO_USUARIOS;
    }

    public Usuario[][] getMatrizUsuarios() {
        return matrizUsuarios;
    }

    public void setNUMERO_USUARIOS(int NUMERO_USUARIOS) {
        this.NUMERO_USUARIOS = NUMERO_USUARIOS;
    }

    public void setMatrizUsuarios(Usuario[][] matrizUsuarios) {
        this.matrizUsuarios = matrizUsuarios;
    }

    public void inicializarGrafos(){
        int i, j;
        // zerar a matriz de pesos
        for(i = 0; i < getNUMERO_USUARIOS(); i++){
            for(j = 0; j < getNUMERO_USUARIOS(); j++){
                this.matrizPesos[i][j] = 0;
                this.matrizUsuarios[i][j] = null;
                this.matrizU[i][j] = 0;
            }
        }

        getUsuario();
        povoaMatrizU();
        povoaMatrizPesos();
        // inserir relações primarias
        /*
        for(i = 1; i < getNUMERO_USUARIOS(); i++){
            for(j = 1; j < getNUMERO_USUARIOS(); j++){
                if (i != j){
                    if (this.matrizU[i][j] != 0){
                        this.matrizPesos[i][j] = new Random().nextInt(100);
                    }
                }
            }
        }
        */


    }

    public void inserirUsuario(){

    }

    public void inserirRelacao(){

    }

    public void listarSeguidores(){

    }

    public void listarSeguidoresVelhos(){

    }

    public void atualizarRelacao(){

    }

    public void removerUsuario(){

    }

    public void removerRelacao(){

    }

    public void getUsuario(){
        try {
            FileReader ler = new FileReader("entrada.dat");
            BufferedReader lerB = new BufferedReader(ler);
            String linha = lerB.readLine();
            //campitura dos dados para um altomato 1
            linha = lerB.readLine();
            while(linha != null) {
                String[] estados = linha.split(",");
                String nome;
                int idade;
                int id;
                nome = estados[0];
                idade = Integer.parseInt(estados[1]);
                id = Integer.parseInt(estados[2]);
                usuarios.add(new Usuario(nome, idade, id));
                linha = lerB.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void povoaMatrizU(){
        try {
            FileReader ler = new FileReader("relacoes.dat");
            BufferedReader lerB = new BufferedReader(ler);
            String linha = lerB.readLine();
            //campitura dos dados para um altomato 1
            linha = lerB.readLine();
            int i = 0;
            while(linha != null) {
                i ++;
                String[] estados = linha.split(" ");
                for(int j = 1; j < estados.length; j++){
                    this.matrizU[i][j] = Integer.parseInt(estados[j]);
                }
                linha = lerB.readLine();
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void povoaMatrizPesos(){
        try {
            FileReader ler = new FileReader("pesos.dat");
            BufferedReader lerB = new BufferedReader(ler);
            String linha = lerB.readLine();
            //campitura dos dados para um altomato 1
            linha = lerB.readLine();
            int i = 0;
            while(linha != null) {
                i ++;
                String[] estados = linha.split(" ");
                for(int j = 1; j < estados.length; j++){
                    this.matrizPesos[i][j] = Integer.parseInt(estados[j]);
                }
                linha = lerB.readLine();
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

