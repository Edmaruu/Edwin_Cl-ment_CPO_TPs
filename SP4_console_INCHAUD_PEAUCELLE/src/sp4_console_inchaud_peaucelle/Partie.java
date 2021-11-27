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

    public void attribuerCouleursAuxJoueurs() {
        int hasard = generateurAleat.nextInt(1);
        if (hasard == 0) {
            ListeJoueur[0].affecterCouleur("jaune");
            ListeJoueur[1].affecterCouleur("rouge");
        } else {
            ListeJoueur[0].affecterCouleur("rouge");
            ListeJoueur[1].affecterCouleur("jaune");
        }
// distribue les couleurs aléatoirement aux joueurs
    }

    public void initialiserPartie() {
        grilleJeu = new Grille();
        Jeton jrouge = new Jeton("rouge");
        Jeton jjaune = new Jeton("jaune");
        if (ListeJoueur[0].couleur == "rouge") {
            for (int i = 0; i < 21; i++) {
                ListeJoueur[0].ajouterJeton(jrouge);
            }
            for (int i = 0; i < 21; i++) {
                ListeJoueur[1].ajouterJeton(jjaune);
            }
        } else {
            for (int i = 0; i < 21; i++) {
                ListeJoueur[0].ajouterJeton(jjaune);
            }
            for (int i = 0; i < 21; i++) {
                ListeJoueur[1].ajouterJeton(jrouge);
            }
        }// donne les jeton aux joueurs selon leur couleur
        for (int i = 0; i < 5; i++) {
            int x = generateurAleat.nextInt(6);
            int y = generateurAleat.nextInt(7);
            int w = generateurAleat.nextInt(6);
            int z = generateurAleat.nextInt(7);
            grilleJeu.placerTrouNoir(x, y);
            if (i > 2) {
                grilleJeu.placerDesintegrateur(x, y);
            } else {
                grilleJeu.placerDesintegrateur(w, z);
                if (x == w && y == z) {
                    while (x != w && y != z) {
                        w = generateurAleat.nextInt(6);
                        z = generateurAleat.nextInt(7);
                    }
                }
            }
        }
    }

    public void debuterPartie() {
        while (grilleJeu.etreGagnantePourJoueur(ListeJoueur[0]) != true && grilleJeu.etreGagnantePourJoueur(ListeJoueur[1]) != true) {
            grilleJeu.affichergrillesurconsole();
            System.out.println("souhaitez-vous récupérez un jeton :");
            String reponse = sc.nextLine();
            if (("oui".equals(reponse)) || ("OUI".equals(reponse))) {
                System.out.println("donnez la ligne du Jeton que vous souhaitez enlever : ");
                int Lenleve0 = sc.nextInt();
                System.out.println("donnez la colonne du Jeton que vous souhaitez enlever : ");
                int Cenleve0 = sc.nextInt();
                grilleJeu.recupererJeton(Lenleve0, Cenleve0);
            } else {
                int x = -1;
                while (!(x < 7 && x >= 0)) {
                    System.out.println("Entrez le numéro de la colonne : ");
                    x = sc.nextInt();
                }
                int i = 0;
                while ((grilleJeu.ajouterJetonDansColonne(ListeJoueur[0].ListeJetons[i], x) != true) && (!(x < 7 && x >= 0))) {
                    System.out.println("Entrez le numéro de la colonne : ");
                    x = sc.nextInt();
                    i = i + 1;
                }
                int ligne;
                for (ligne = 0; ligne < 6; ligne++) {
                    if (grilleJeu.celluleOccupe(ligne, x) == true) {
                        grilleJeu.Cellulejeu[ligne][x].activerTrounoir();
                        if (grilleJeu.Cellulejeu[ligne][x].recupererDesintegrateur() == true) {
                            ListeJoueur[0].nombreDesintegrateurs += 1;
                        }
                        break;
                    }
                }
            }
            grilleJeu.affichergrillesurconsole();
            System.out.println("souhaitez-vous récupérez un jeton :");
            String reponse2 = sc.nextLine();
            System.out.println(reponse2);
            if (("oui".equals(reponse2)) || ("OUI".equals(reponse2))) {
                System.out.println("donnez la ligne du Jeton que vous souhaitez enlever : ");
                int x2 = sc.nextInt();
                System.out.println("donnez la colonne du Jeton que vous souhaitez enlever : ");
                int y2 = sc.nextInt();
                grilleJeu.recupererJeton(x2, y2);
            } else {
                int y = -1;
                while (!(y <= 6 && y >= 0)) {
                    System.out.println("Entrez le numéro de la colonne : ");
                    y = sc.nextInt();
                }
                int j = 0;
                while ((grilleJeu.ajouterJetonDansColonne(ListeJoueur[1].ListeJetons[j], y) != true) && (!(y < 7 && y >= 0))) {
                    System.out.println("Entrez le numéro de la colonne : ");
                    y = sc.nextInt();
                    j = j + 1;
                }
                int lignee;
                for (lignee = 0; lignee < 6; lignee++) {
                    if (grilleJeu.celluleOccupe(lignee, y) == true) {
                        grilleJeu.Cellulejeu[lignee][y].activerTrounoir();
                        if (grilleJeu.Cellulejeu[lignee][y].recupererDesintegrateur() == true) {
                            ListeJoueur[1].nombreDesintegrateurs += 1;
                        }
                        break;
                    }
                }
            }
        }
    }

}
