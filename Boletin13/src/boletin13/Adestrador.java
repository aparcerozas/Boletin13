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
public class Adestrador extends Seleccion{
    private String idFederacion;

    public Adestrador() {
    }

    public Adestrador(int id, String nome, String apelido, int idade, String idFederacion) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    @Override
    public void viaxar(){
        System.out.println("viaxan os adestradores");
    }
    
    public void dirixirPartido(){
       System.out.println("o adestrador " + super.getNome() + " dirixe o partido");
    }
    
    public void dirixirAdestramento(){
       System.out.println("o adestrador " + super.getNome() + " dirixe o entrenamento");
    }

    @Override
    public String toString() {
        return super.toString() + ", Adestrador{" + "idFederacion=" + idFederacion + '}';
    }
    
}
