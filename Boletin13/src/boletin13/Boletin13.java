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
public class Boletin13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Xogador xog1 = new Xogador(1, "Pedro", "Sánchez", 26, 7, "delantero");
        Seleccion xog2 = new Xogador(2, "Juan", "Martínez", 28, 2, "defensa");
        System.out.println(xog1.toString());
        System.out.println(xog2.toString());
        xog1.entrenar();
        xog1.viaxar();
        
    }
    
}
