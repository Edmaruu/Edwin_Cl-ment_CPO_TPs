/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package light_out_inchaud_peaucelle;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Incha
 */
public class Partie {

    grille grillejeu;
    Scanner sc = new Scanner(System.in);
    Random generateurAleat = new Random();

    public void debuterpartie() {
        grillejeu = new grille();
        int nbrcasedebut = generateurAleat.nextInt(14);
        for (int i = 0; i < nbrcasedebut; i++) {
            int randomx = generateurAleat.nextInt(4);
            int randomy = generateurAleat.nextInt(4);
            grillejeu.changementetat(randomx, randomy);
        }
        grillejeu.affichergrillesurconsole();
        jouer();
        grillejeu.affichergrillesurconsole();
    }

    public void jouer() {
        int abscisse;
        int ordonnee;
        System.out.println("entrez l'abcisse du point sur lequel vous voulez cliquer");
        abscisse = sc.nextInt();
        System.out.println("entrez l'ordonnée du point sur lequel vous voulez cliquer");
        ordonnee = sc.nextInt();
        grillejeu.changementetat(abscisse, ordonnee);
        if (ordonnee == 0) {
            grillejeu.changementetat(abscisse, ordonnee + 1);
            if (abscisse == 0) {
                grillejeu.changementetat(abscisse + 1, ordonnee);
            } else if (abscisse == 4) {
                grillejeu.changementetat(abscisse - 1, ordonnee);
            } else {
                grillejeu.changementetat(abscisse - 1, ordonnee);
                grillejeu.changementetat(abscisse + 1, ordonnee);
            }
        } else if (ordonnee == 4) {
            grillejeu.changementetat(abscisse, ordonnee - 1);
            if (abscisse == 0) {
                grillejeu.changementetat(abscisse + 1, ordonnee);
            } else if (abscisse == 4) {
                grillejeu.changementetat(abscisse - 1, ordonnee);
            } else {
                grillejeu.changementetat(abscisse - 1, ordonnee);
                grillejeu.changementetat(abscisse + 1, ordonnee);
            }
        }
    }
}
