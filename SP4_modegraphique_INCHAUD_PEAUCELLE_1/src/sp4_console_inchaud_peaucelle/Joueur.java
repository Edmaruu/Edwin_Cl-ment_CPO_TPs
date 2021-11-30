/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_inchaud_peaucelle;

import javax.swing.JTextField;

/**
 *
 * @author cleme
 */
public class Joueur {

    String nom;
    String couleur;
    Jeton[] ListeJetons = new Jeton[21];
    int nombreJetonsRestants;
    int nombreDesintegrateurs;
// les paramètres de la classe Joueur
    Joueur(String a) {
        nom = a;
    }

    Joueur(JTextField Nom_joueur_1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
// asssocie un Joueur à un nom
    void affecterCouleur(String b) {
        couleur = b;
    }
//donne la couleur au Joueur
    void ajouterJeton(Jeton jeton){
        for (int i = 0; i<21; i++) {
            if(ListeJetons[i] == null){
                ListeJetons[i] = jeton;
                nombreJetonsRestants = i+1;
                break;// méthode qui ajoute un jeton au joueur
            }
        }
    }

}
