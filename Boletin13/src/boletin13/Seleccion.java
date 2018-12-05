/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13;

/**
 *
 * @author aparcerozas
 */
public class Seleccion {
    int id;
    String nome;
    String apelido;
    int idade;

    public Seleccion() {
    }

    public Seleccion(int id, String nome, String apelido, int idade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void concentrarse(){
        System.out.println("concentrase a selección");
    }
    
    public void viaxar(){
        System.out.println("viaxa a selección");
    }

    @Override
    public String toString() {
        return "Seleccion{" + "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", idade=" + idade + '}';
    }
    
}
