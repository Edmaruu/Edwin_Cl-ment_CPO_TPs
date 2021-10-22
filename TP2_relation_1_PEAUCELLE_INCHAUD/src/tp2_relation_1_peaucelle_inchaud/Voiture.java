package tp2_relation_1_peaucelle_inchaud;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author cleme
 */
public class Voiture {

    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;

    Voiture(String a, String b, int x) {
        Modele = a;
        Marque = b;
        PuissanceCV = x;
        Proprietaire = null;
    }

    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Marque + Modele + PuissanceCV;
        return chaine_a_retourner;
    }
}
