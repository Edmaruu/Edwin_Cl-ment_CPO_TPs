package tp2_relation_1_peaucelle_inchaud;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author cleme
 */
public class Personne {

    String prenom;
    String nom;
    int nbVoitures = 0;
    Voiture[] liste_voitures;

    Personne(String a, String b) {
        prenom = a;
        nom = b;
        liste_voitures = new Voiture[3];
        }
    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = prenom + nom;
        return chaine_a_retourner;
    }
    
    }