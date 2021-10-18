/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.exercice3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cleme
 */
public class TP1Exercice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        System.out.println(n);
        int compt = 0;
        int nd = sc.nextInt();
        if (n == nd) {
            System.out.println("gagné");
        } else {
            if (n < nd) {
                System.out.println("trop grand");
            } else {
                System.out.println("trop petit");
            }
            while (n != nd) {
                nd = sc.nextInt();
                if (n < nd) {
                    System.out.println("trop grand");
                } 
                if (n > nd){
                    System.out.println("trop petit");
                    compt = compt + 1;
                }

            } System.out.println("gagné");
        }
    }
}
