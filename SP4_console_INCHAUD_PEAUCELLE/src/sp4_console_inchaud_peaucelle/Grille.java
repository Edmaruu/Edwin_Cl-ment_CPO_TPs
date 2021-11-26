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
         for (int i=0;i<6;i++){
            for (int a=0;a<7;a++){
              Cellulejeu[i][a]= new Cellule();
            }
        }
        
    }
    public boolean ajouterJetonDansColonne(Jeton jetonc, int a){
        if(Cellulejeu[0][a].jetonCourant!=null){
            return false; 
        }
        for(int i=5;i!=-1;i--){
            if(Cellulejeu[i][a].jetonCourant==null){
                Cellulejeu[i][a].affecterJeton(jetonc);
                return true;        
            }
        }
        return false;
    }
    public boolean etreremplie(){
        for (int i=0;i<6;i++){
            for (int a=0;a<7;a++){
                if (Cellulejeu[i][a].jetonCourant==null){
                    return false;
                }
            }
        }
        return true;
    }
    public void vidergrille(){
         for (int i=0;i<6;i++){
            for (int a=0;a<7;a++){
              Cellulejeu[i][a].jetonCourant=null;
            }
        }
    
    }
    public void affichergrillesurconsole(){
        for (int i=0;i<6;i++){
            for (int a=0;a<7;a++){
              if (Cellulejeu[i][a].lireCouleurDuJeton()=="vide"){
                  System.out.print(" - ");
              }else if(Cellulejeu[i][a].lireCouleurDuJeton()=="jaune"){
                  System.out.print("\033[0;33m"+" jet ");
              }else if(Cellulejeu[i][a].lireCouleurDuJeton()=="rouge"){
                  System.out.print("\033[0;31m"+" cle ");
              }
            }
            System.out.println();
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
        for (int i=0;i<6;i++){
            for (int a=0;a<4;a++){
                if (CouleurDuJeton(i,a)==Edwin.couleur && CouleurDuJeton(i,a+1)==Edwin.couleur && CouleurDuJeton(i,a+2)==Edwin.couleur && CouleurDuJeton(i,a+3)==Edwin.couleur){
                return true;
                }
            }
         }
        for (int i=0;i<7;i++){
            for (int a=0;a<3;a++){
               if (CouleurDuJeton(a,i)==Edwin.couleur && CouleurDuJeton(a+1,i)==Edwin.couleur && CouleurDuJeton(a+2,i)==Edwin.couleur && CouleurDuJeton(a+3,i)==Edwin.couleur){
                return true;
                } 
            }
        }
         for (int i=0;i<3;i++){
            for (int a=0;a<4;a++){
                if (CouleurDuJeton(i,a)==Edwin.couleur && CouleurDuJeton(i+1,a+1)==Edwin.couleur && CouleurDuJeton(i+2,a+2)==Edwin.couleur && CouleurDuJeton(i+3,a+3)==Edwin.couleur){
                return true;
                }
            }
         }
          for (int i=3;i<6;i++){
            for (int a=0;a<4;a++){
                if (CouleurDuJeton(i,a)==Edwin.couleur && CouleurDuJeton(i-1,a+1)==Edwin.couleur && CouleurDuJeton(i-2,a+2)==Edwin.couleur && CouleurDuJeton(i-3,a+3)==Edwin.couleur){
                return true;
                }
            }
         }
          return false;
    }
    public boolean colonneRemplie(int a){
        if (Cellulejeu[0][a].jetonCourant!=null){
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
    public boolean placerTrouNoir(int a, int b){
        if(Cellulejeu[a][b].presenceTrouNoir()==true){
            return false;
        }
        Cellulejeu[a][b].placerTrouNoir();
        return true;
    }
    public boolean placerDesintegrateur(int a, int b){
           if(Cellulejeu[a][b].presenceDesintegrateur()==true){
            return false;
        }
        Cellulejeu[a][b].placerDesintegrateur();
        return true;
    }
    public boolean supprimerJeton(int a, int b){
       return Cellulejeu[a][b].supprimerJeton();
    }
    public void recupererJeton(int a, int b){
        Cellulejeu[a][b].recupererJeton();
    }
}
