package com.company;


import java.util.ArrayList;

public class Grafo {
    private final int NUMERO_USUARIOS = 51;
    // Arvore de Usuarios
    private Usuario[][] matrizUsuarios = new Usuario[this.getNUMERO_USUARIOS()][this.getNUMERO_USUARIOS()];
    private int[][] matrizPesos = new int[this.getNUMERO_USUARIOS()][this.getNUMERO_USUARIOS()];

    public Grafo() {

    }

    public int getNUMERO_USUARIOS() {
        return NUMERO_USUARIOS;
    }

    public Usuario[][] getMatrizUsuarios() {
        return matrizUsuarios;
    }

    public void setMatrizUsuarios(Usuario[][] matrizUsuarios) {
        this.matrizUsuarios = matrizUsuarios;
    }

    public void inicializarGrafos(){

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

}