package com.company;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Grafo {
    private int NUMERO_USUARIOS = 51;
    // Arvore de Usuarios
    private int[][] matrizAdjacencia = new int[this.getNUMERO_USUARIOS()][this.getNUMERO_USUARIOS()];
    private ArrayList<ArrayList<Integer>> matrizPesos = new ArrayList<ArrayList<Integer>>();
    private ArrayList<TreeSet<No>> arvoreAdjacencia = new ArrayList<>();
    private ArrayList<ArrayList<No>> listaAdjacencia = new ArrayList<>();
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>(); // lista de dados de todos os usuarios
    public Grafo() {

    }

    public int getNUMERO_USUARIOS() {
        return NUMERO_USUARIOS;
    }


    public void setNUMERO_USUARIOS(int NUMERO_USUARIOS) {
        this.NUMERO_USUARIOS = NUMERO_USUARIOS;
    }

    public void inicializarGrafos() {
        int i, j;
        // zerar a matriz de pesos
        for (i = 0; i < getNUMERO_USUARIOS(); i++) {
            matrizPesos.add(new ArrayList<Integer>());
            for (j = 0; j < getNUMERO_USUARIOS(); j++) {
                this.matrizPesos.get(i).add(0);
                this.matrizAdjacencia[i][j] = 0;
            }
        }
        povoaMatrizRelacoes();
        povoaMatrizPesos();
        povoaListaAdjacencia();
        povoaArvoreAdacecia();
        getUsuarios();
        // inserir relações primarias
        /*
        for(i = 1; i < getNUMERO_USUARIOS(); i++){
            for(j = 1; j < getNUMERO_USUARIOS(); j++){
                if (i != j){
                    if (this.matrizU[i][j] != 0){
                        this.matrizPesos[i][j] = new Random().nextInt(100);
                    }0
                }
            }
        }*/

        /*System.out.println("mat adj");
        for(i = 1; i < getNUMERO_USUARIOS(); i++){
            for(j = 1; j < getNUMERO_USUARIOS(); j++){
                System.out.print(matrizAdjacencia[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("mat pesos");
        for (i = 1; i < getNUMERO_USUARIOS(); i++) {
            for (j = 1; j < getNUMERO_USUARIOS(); j++) {
                System.out.print(matrizPesos.get(i).get(j) + " ");
            }
            System.out.println();
        }
         System.out.println("lista ajacencia " + this.listaAdjacencia.size());
        for(i = 0; i < getNUMERO_USUARIOS(); i++){
            for(j = 0; j < this.listaAdjacencia.get(i).size(); j++){
                System.out.print(listaAdjacencia.get(i).get(j).toString() + " ");
            }
            System.out.println();
        }
        System.out.println("Arvore Adj");
        for (i = 0; i < getNUMERO_USUARIOS(); i++) {
            //System.out.println(arvoreAdjacencia.get(i));
           Iterator<No> iterator = this.arvoreAdjacencia.get(i).iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
        }
        */
    }

    public void inserirUsuario(){
        return;
    }

    public void inserirRelacao(){

    }

    public void listarSeguidores(int exibicao){

    }

    public void listarSeguidoresVelhos(int exibicao){

    }

    public void atualizarRelacao(){

    }

    public void removerUsuario(){

    }

    public void removerRelacao(){

    }

    public void getUsuarios(){
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
                listaUsuarios.add(new Usuario(nome, idade, id));
                linha = lerB.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void povoaMatrizRelacoes(){
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
                    this.matrizAdjacencia[i][j] = Integer.parseInt(estados[j]);
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
                    this.matrizPesos.get(i).set(j, new Integer(Integer.parseInt(estados[j])));
                }
                linha = lerB.readLine();
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void povoaListaAdjacencia() {
        int i, j;
        for(i = 0; i < this.getNUMERO_USUARIOS(); i++){
            listaAdjacencia.add(new ArrayList<No>());
            for(j = 0; j < this.getNUMERO_USUARIOS(); j++){
                if (this.matrizPesos.get(j).get(i) != 0){
                    listaAdjacencia.get(i).add(new No(j, this.matrizPesos.get(j).get(i)));
                }
            }
        }
    }

    private void povoaArvoreAdacecia(){
        int i, j;
        for(i = 0; i < this.getNUMERO_USUARIOS(); i++){
            arvoreAdjacencia.add(new TreeSet<No>());
            for(j = 0; j < this.getNUMERO_USUARIOS(); j++){
                if (this.matrizPesos.get(j).get(i) != 0){
                    arvoreAdjacencia.get(i).add(new No(j, this.matrizPesos.get(j).get(i)));
                }
            }
        }
    }

}

