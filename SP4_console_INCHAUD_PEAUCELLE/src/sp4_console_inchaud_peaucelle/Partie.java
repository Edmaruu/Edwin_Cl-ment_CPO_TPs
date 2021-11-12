/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_inchaud_peaucelle;

/**
 *
 * @author cleme
 */
public class Partie {
    Joueur[] ListeJoueur = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    
    void attribuerCouleursAuxJoueurs() {
        int hasard = (int) Math.random();
        if (hasard == 0) {
            ListeJoueur[0].affecterCouleur("jaune");
            ListeJoueur[1].affecterCouleur("rouge"); 
        } else {
            ListeJoueur[0].affecterCouleur("rouge");
            ListeJoueur[1].affecterCouleur("jaune");
        }
        
    }
    void initialiserPartie(){
        
    }
}
