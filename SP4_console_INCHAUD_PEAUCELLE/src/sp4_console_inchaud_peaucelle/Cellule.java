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
        trouNoir = false;
        desintegrateur = false;
    }
    public boolean affecterJeton(Jeton jetonc){
        if (jetonCourant != null){
            return false;
        }
        jetonCourant=jetonc;
        return true;       
    }
    
}
