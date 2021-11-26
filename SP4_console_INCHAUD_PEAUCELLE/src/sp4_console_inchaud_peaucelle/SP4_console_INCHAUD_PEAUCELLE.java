/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_inchaud_peaucelle;

import java.util.Scanner;

/**
 *
 * @author Incha
 */
public class SP4_console_INCHAUD_PEAUCELLE {

    /**
     * @param args the command line arguments
     */Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    Partie partie1 = new Partie();
    Joueur Joueur1 = new Joueur("clement");
    Joueur Joueur2 = new Joueur("edwin");
    partie1.ListeJoueur[0] = Joueur1;
    partie1.ListeJoueur[1] = Joueur2;
    partie1.attribuerCouleursAuxJoueurs();
    partie1.initialiserPartie();
    partie1.debuterPartie();
    }
    
}
