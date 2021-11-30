/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_inchaud_peaucelle;

/**
 *
 * @author cleme
 */
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    
    public Cellule(){
        jetonCourant = null;
        trouNoir =false;
        desintegrateur =false;
    }
    public boolean affecterJeton(Jeton jetonc){
        if (jetonCourant != null){
            return false;
        }
        jetonCourant=jetonc;
        return true;       
    }
    public String lireCouleurDuJeton(){
        if (jetonCourant==null){
            return "vide";
        }else{
            return jetonCourant.lireCouleur();
        }
    }
    public Jeton recupererJeton(){
        return jetonCourant;
    }
    public boolean supprimerJeton(){
        if(jetonCourant==null){
            return false;
        }
        jetonCourant=null;
        return true;
    }
    public boolean placerTrouNoir(){
        if (trouNoir==true){
            return false;
        }
        trouNoir=true;
        return true;
    }
    public boolean presenceTrouNoir(){
        if(trouNoir==true){
            return true;
        }
        return false;
    }
    public boolean placerDesintegrateur(){
        if (desintegrateur==true){
            return false;
        }
        desintegrateur=true;
        return true;
    }
    public boolean presenceDesintegrateur(){
        if(desintegrateur==true){
            return true;
        }
        return false;
    }
    public boolean recupererDesintegrateur(){
         if(desintegrateur==false){
            return false;
        }
        desintegrateur=false;
        return true;
    }
    public boolean activerTrounoir(){
        if(presenceTrouNoir()==false){
            return false;
        }
        supprimerJeton();
        trouNoir=false;
        return true;
    }
}
