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
                Cellulejeu[i][a].affecterJeton(jetonc);
                return true;        
            }
        }
        return false;
    }
    public boolean etreremplie(){
        for (int i=0;i<7;i++){
            for (int a=0;a<8;i++){
                if (Cellulejeu[i][a]==null){
                    return false;
                }
            }
        }
        return true;
    }
    public void vidergrille(){
         for (int i=0;i<7;i++){
            for (int a=0;a<8;i++){
              Cellulejeu[i][a]=null;
            }
        }
    
    }
    public void affichergrillesurconsole(){
        for (int i=0;i<7;i++){
            for (int a=0;a<8;i++){
              if (Cellulejeu[i][a].lireCouleurDuJeton()=="vide"){
                  System.out.println("  ");
              }else if(Cellulejeu[i][a].lireCouleurDuJeton()=="jaune"){
                  System.out.println("\033[0;33m"+Cellulejeu[i][a]);
              }else if(Cellulejeu[i][a].lireCouleurDuJeton()=="rouge"){
                  System.out.println("\033[0;31m"+Cellulejeu[i][a]);
              }
            }
        }
    }
}
