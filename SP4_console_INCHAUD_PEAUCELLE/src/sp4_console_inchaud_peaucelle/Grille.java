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
    public boolean celluleOccupe(int a,int b){
        if (Cellulejeu[a][b].jetonCourant==null){
            return false;
        }else{
            return true;
        }
    }
    public String CouleurDuJeton(int a, int b){
        if (Cellulejeu[a][b].jetonCourant==null){
            return "vide";
        }else{
        return Cellulejeu[a][b].lireCouleurDuJeton();
        }
    }
    public boolean etreGagnantePourJoueur(Joueur Edwin){
        for (int i=0;i<7;i++){
            for (int a=0;a<4;i++){
                if (CouleurDuJeton(i,a)==Edwin.couleur && CouleurDuJeton(i,a+1)==Edwin.couleur && CouleurDuJeton(i,a+2)==Edwin.couleur && CouleurDuJeton(i,a+3)==Edwin.couleur){
                return true;
                }
            }
         }
        for (int i=0;i<8;i++){
            for (int a=0;a<3;i++){
               if (CouleurDuJeton(a,i)==Edwin.couleur && CouleurDuJeton(a+1,i)==Edwin.couleur && CouleurDuJeton(a+2,i)==Edwin.couleur && CouleurDuJeton(a+3,i)==Edwin.couleur){
                return true;
                } 
            }
        }
         for (int i=0;i<3;i++){
            for (int a=0;a<4;i++){
                if (CouleurDuJeton(i,a)==Edwin.couleur && CouleurDuJeton(i+1,a+1)==Edwin.couleur && CouleurDuJeton(i+2,a+2)==Edwin.couleur && CouleurDuJeton(i+3,a+3)==Edwin.couleur){
                return true;
                }
            }
         }
          for (int i=3;i<6;i++){
            for (int a=0;a<4;i++){
                if (CouleurDuJeton(i,a)==Edwin.couleur && CouleurDuJeton(i-1,a+1)==Edwin.couleur && CouleurDuJeton(i-2,a+2)==Edwin.couleur && CouleurDuJeton(i-3,a+3)==Edwin.couleur){
                return true;
                }
            }
         }
          return false;
    }
    public boolean colonneRemplie(int a){
        if (Cellulejeu[0][a]!=null){
            return false;
        }
        return true;
    }
    public void tasserGrille(int a){
        for(int i=5;i!=-1;i--){
            if (Cellulejeu[i][a].jetonCourant==null){
                for(int b=i;b>0;b--){
                    Cellulejeu[b][a].jetonCourant=Cellulejeu[b-1][a].jetonCourant;
                    Cellulejeu[b-1][a].jetonCourant=null;
                }
            }
            break;
        }
    }
}
