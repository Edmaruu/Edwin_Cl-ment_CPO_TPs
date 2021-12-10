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
        grillejeu.affichergrillesurconsole();
        jouer();
        grillejeu.affichergrillesurconsole();
    }

    public void jouer() {
        int ligne;
        int colonne;
        System.out.println("entrez ligne du point sur lequel vous voulez cliquer");
        ligne = sc.nextInt();
        System.out.println("entrez colonne du point sur lequel vous voulez cliquer");
        colonne = sc.nextInt();
        grillejeu.changementetat(ligne, colonne);
        if (colonne == 0) {
            grillejeu.changementetat(ligne, colonne + 1);
            if (ligne == 0) {
                grillejeu.changementetat(ligne + 1, colonne);
            } else if (ligne == 4) {
                grillejeu.changementetat(ligne - 1, colonne);
            } else {
                grillejeu.changementetat(ligne - 1, colonne);
                grillejeu.changementetat(ligne + 1, colonne);
            }
        } else if (colonne == 4) {
            grillejeu.changementetat(ligne, colonne - 1);
            if (ligne == 0) {
                grillejeu.changementetat(ligne + 1, colonne);
            } else if (ligne == 4) {
                grillejeu.changementetat(ligne - 1, colonne);
            } else {
                grillejeu.changementetat(ligne - 1, colonne);
                grillejeu.changementetat(ligne + 1, colonne);
            }
        }else if(ligne==0){
            grillejeu.changementetat(ligne+1, colonne);
            grillejeu.changementetat(ligne, colonne+1);
            grillejeu.changementetat(ligne, colonne-1);       
        }else if(ligne==4){
            grillejeu.changementetat(ligne-1, colonne);
            grillejeu.changementetat(ligne, colonne+1);
            grillejeu.changementetat(ligne, colonne-1);
        }else {
            grillejeu.changementetat(ligne-1, colonne);
            grillejeu.changementetat(ligne, colonne+1);
            grillejeu.changementetat(ligne, colonne-1);
            grillejeu.changementetat(ligne+1, colonne);
        }
    }
}
