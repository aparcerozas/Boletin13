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
public class Masaxista extends Seleccion{
    private String titulacion;
    private int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(int id, String nome, String apelido, int idade, String titulacion, int anosExperiencia) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    @Override
    public void viaxar(){
        System.out.println("viaxan os masaxistas");
    }
    
    public void darMasaxes(){
       System.out.println("o masaxista " + super.getNome() + " da masaxes");
    }

    @Override
    public String toString() {
        return super.toString() + ", Masaxista{" + "titulacion=" + titulacion 
                + ", anosExperiencia=" + anosExperiencia + '}';
    }
    
}
