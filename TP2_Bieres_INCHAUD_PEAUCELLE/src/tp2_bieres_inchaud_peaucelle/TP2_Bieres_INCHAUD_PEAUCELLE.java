/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_inchaud_peaucelle;

/**
 *
 * @author Incha
 */
public class TP2_Bieres_INCHAUD_PEAUCELLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson") ;
    uneBiere.ouverte=false;
    uneBiere.lireEtiquette();
    BouteilleBiere unesecondeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe") ;
    unesecondeBiere.ouverte=false;       
    unesecondeBiere.lireEtiquette();    
    BouteilleBiere unequatreBiere = new BouteilleBiere("uvée d", 7.0, "isson") ;
    unequatreBiere.ouverte=false;
    unequatreBiere.lireEtiquette();
    BouteilleBiere unetroisBiere = new BouteilleBiere("Cuvée", 7.0, "Dubui") ;
    unetroisBiere.ouverte=false;
    unetroisBiere.lireEtiquette();
    BouteilleBiere unecinqBiere = new BouteilleBiere("trolls", 7.0, "trollesque") ;
    unecinqBiere.ouverte=true;
    unecinqBiere.lireEtiquette();
    unecinqBiere.Décapsuler();
    System.out.println(unecinqBiere);
    System.out.println(unequatreBiere);
}}
