/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_inchaud_peaucelle;

/**
 *
 * @author cleme
 */
public class Jeton {

    String Couleur;

    public Jeton(String a) {
        Couleur = a;
    }// donne la couleur à un jeton
public String lireCouleur(){
    return Couleur;
}// donne la couleur du jeton
}
