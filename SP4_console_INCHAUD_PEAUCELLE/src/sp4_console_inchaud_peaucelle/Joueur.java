/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_inchaud_peaucelle;

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

    Joueur(String a) {
        nom = a;
    }

    void affecterCouleur(String b) {
        couleur = b;
    }

    void ajouterJeton(Jeton jeton){
        for (int i = 0; i<21; i++) {
            if(ListeJetons[i] == null){
                ListeJetons[i] = jeton;
                nombreJetonsRestants = i+1;
                break;
            }
        }
    }

}
