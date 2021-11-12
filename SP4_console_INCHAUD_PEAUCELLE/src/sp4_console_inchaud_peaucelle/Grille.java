/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_inchaud_peaucelle;

/**
 *
 * @author cleme
 */
public class Grille {
    Cellule [][] Cellulejeu;
    public Grille(){
        Cellulejeu= new Cellule [6][7];
    }
    public boolean ajouterJetonDansColonne(Jeton jetonc, int a){
        if(Cellulejeu[0][a]!=null){
            return false;
        }
        for(int i=5;i!=-1;i--){
            if(Cellulejeu[i][a]==null){
                Cellulejeu[i][a]==
                return true;        
            }
        }
    }
}
