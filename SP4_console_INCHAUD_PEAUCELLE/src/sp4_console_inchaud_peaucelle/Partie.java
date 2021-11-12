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
            Joueur1.affecterCouleur("jaune");
            Joueur2.affecterCouleur("rouge"); 
        } else {
            Joueur1.affecterCouleur("rouge");
            Joueur2.affecterCouleur("jaune");
        }
        
    }
    void initialiserPartie(){
        
    }
}
