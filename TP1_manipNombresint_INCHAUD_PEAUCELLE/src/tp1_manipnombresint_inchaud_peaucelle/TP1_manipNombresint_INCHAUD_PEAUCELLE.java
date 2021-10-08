/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_inchaud_peaucelle;

import java.util.Scanner;

/**
 *
 * @author Incha
 */
public class TP1_manipNombresint_INCHAUD_PEAUCELLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int entier1;
        int entier2;
        entier1=sc.nextInt();
        entier2=sc.nextInt();
        System.out.println(entier1);
        System.out.println(entier2);
        System.out.println("Somme :"+(entier1+entier2)+" différence :"+(entier1-entier2)+" produit :"+(entier1*entier2));
        System.out.println("Quotient entier :"+(entier1/entier2)+" reste :"+(entier1%entier2));
    }
    
}
