/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_inchaud_peaucelle;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cleme
 */
public class Partie {

    Scanner sc = new Scanner(System.in);

    Joueur[] ListeJoueur = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    Random generateurAleat = new Random();

    void attribuerCouleursAuxJoueurs() {
        int hasard = generateurAleat.nextInt(1);
        if (hasard == 0) {
            ListeJoueur[0].affecterCouleur("jaune");
            ListeJoueur[1].affecterCouleur("rouge");
        } else {
            ListeJoueur[0].affecterCouleur("rouge");
            ListeJoueur[1].affecterCouleur("jaune");
        }

    }

    void initialiserPartie() {
        grilleJeu = new Grille();
        Jeton jrouge = new Jeton("rouge");
        Jeton jjaune = new Jeton("jaune");
        for (int i = 0; i < 21; i++) {
            ListeJoueur[0].ajouterJeton(jrouge);
        }
        for (int i = 0; i < 21; i++) {
            ListeJoueur[1].ajouterJeton(jjaune);
        }
    }

    void debuterPartie() {
        while (grilleJeu.etreGagnantePourJoueur(ListeJoueur[0]) != true && grilleJeu.etreGagnantePourJoueur(ListeJoueur[1]) != true) {
            System.out.println("souhaitez-vous récupérez un jeton :");
            String reponse = sc.nextLine();
            if (reponse == "oui" || reponse == "OUI") {
                System.out.println("donnez la ligne du Jeton que vous souhaitez enlever : ");
                int x = sc.nextInt();
                System.out.println("donnez la ligne du Jeton que vous souhaitez enlever : ");
                int y = sc.nextInt();
                grilleJeu.recupererJeton(x,y);
            } else {
            int x = -1;
            while (!(x <= 7 && x >= 0)) {
                System.out.println("Entrez le numéro de la colonne : ");
                x = sc.nextInt();
            }
            int i = 0;
            while (grilleJeu.ajouterJetonDansColonne(ListeJoueur[0].ListeJetons[i], x) != true) {
                System.out.println("Entrez le numéro de la colonne : ");
                x = sc.nextInt();
                i = i + 1;
            }
            int y = -1;
            while (!(y <= 7 && y >= 0)) {
                System.out.println("Entrez le numéro de la colonne : ");
                y = sc.nextInt();
            }
            int j = 0;
            while (grilleJeu.ajouterJetonDansColonne(ListeJoueur[1].ListeJetons[j], x) != true) {
                System.out.println("Entrez le numéro de la colonne : ");
                x = sc.nextInt();
                j = j + 1;
            }
        }
    }
}
  


}