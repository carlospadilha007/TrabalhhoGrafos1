package com.company;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int idade;
    private int numeroSeguidores;
    private ArrayList<String> listaSeguidores;
    private ArrayList<String> listaSeguindo;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Usuario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroSeguidores() {
        return numeroSeguidores;
    }

    public void setNumeroSeguidores(int numeroSeguidores) {
        this.numeroSeguidores = numeroSeguidores;
    }

    public ArrayList<String> getListaSeguidores() {
        return listaSeguidores;
    }

    public void setListaSeguidores(ArrayList<String> listaSeguidores) {
        this.listaSeguidores = listaSeguidores;
    }

    public ArrayList<String> getListaSeguindo() {
        return listaSeguindo;
    }

    public void setListaSeguindo(ArrayList<String> listaSeguindo) {
        this.listaSeguindo = listaSeguindo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome = '" + nome + '\'' +
                ", idade = " + idade +
                ", Numero Seguidores=" + numeroSeguidores + "\n"+
                ", Lista de Seguidores=" + listaSeguidores + "\n"+
                "Seguindo = " + listaSeguindo +
                '}';
    }
}