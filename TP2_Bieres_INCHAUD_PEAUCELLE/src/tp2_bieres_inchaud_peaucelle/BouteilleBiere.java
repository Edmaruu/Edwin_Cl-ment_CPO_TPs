/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_inchaud_peaucelle;

/**
 *
 * @author Incha
 */
public class BouteilleBiere {
    String Nom;
    String brasserie;
    double degreAlcool;
    boolean ouverte=true;
    public Boolean Décapsuler(){
        if (ouverte==true){
            System.out.println("Bouteille déja ouverte");
            return false;
        }else {
            ouverte=true;
        }
        return null;
    }
    public void lireEtiquette() {
System.out.println("Bouteille de " + Nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;

}
public BouteilleBiere(String UnNom, double UnDegre, String UneBrasserie){
    Nom=UnNom;
    degreAlcool=UnDegre;
    brasserie=UneBrasserie;
}
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = Nom + " (" + degreAlcool + " degrés)+ ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;

}}
