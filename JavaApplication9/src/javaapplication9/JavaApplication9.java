package javaapplication9;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author cleme
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        assiette2 = assiette1;
        assiette1 = assiette3;
        System.out.println("nb de calories de Assiette 1 : "
                + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : "
                + assiette2.nbCalories);
        /*question 6: les lignes suivantes:
        *Moussaka assiette666 = assiette1; n'est pas correcte car assiette1 est de classe Tartiflette
        *Moussaka assiette667 = new Tartiflette(); car la classe d'affectation et de définition sont différentes*/
        Moussaka [] tabref;
        tabref = new Moussaka [10];
        for(int i=0; i<10; i++){
            Moussaka assiette1i = new Moussaka(i);
            tabref[i]=assiette1i;
        }
    }

                                   }
