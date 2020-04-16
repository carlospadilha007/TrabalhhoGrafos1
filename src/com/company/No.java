package com.company;

public class No implements Comparable<No> {

    private int id;
    private int peso;

    public No(int id, int peso) {
        this.id = id;
        this.peso = peso;
    }

    public No() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "No{" +
                "id=" + id +
                ", peso=" + peso +
                '}';
    }

    @Override
    public int compareTo(No o) {
        return o.id;
    }

}
