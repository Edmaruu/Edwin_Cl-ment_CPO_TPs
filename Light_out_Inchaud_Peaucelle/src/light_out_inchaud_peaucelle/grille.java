/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package light_out_inchaud_peaucelle;

/**
 *
 * @author Incha
 */
public class grille {

    Case[][] casejeu;

    public grille() {
        casejeu = new Case[5][5];
        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 5; a++) {
                casejeu[i][a] = new Case();
            }
        }

    }

    public void affichergrillesurconsole() {
        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 5; a++) {
                if (casejeu[i][a].etatcase == true) {
                    System.out.print(" O ");
                } else if (casejeu[i][a].etatcase == false) {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    public void changementetat(int a, int b) {
        if (casejeu[a][b].etatcase == true) {
            casejeu[a][b].etatcase = false;
        } else {
            casejeu[a][b].etatcase = true;
        }
    }

    public boolean victoire() {
        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 5; a++) {
                if (casejeu[i][a].etatcase == true) {
                    return false;
                }
            }
        }
        return true;
    }
}
