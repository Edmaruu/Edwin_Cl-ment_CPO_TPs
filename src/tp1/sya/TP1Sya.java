/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.sya;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cleme
 */
public class TP1Sya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] Tab = new int[5]; 
       for (int i=0; i<5;i++){
Tab[i]=0;
       }
       int m;
Scanner sc;
sc = new Scanner(System.in);
System.out.println("Saisissez un nombre entier : ");
m = sc.nextInt();
Random generateurAleat = new Random();
for (int i=0; i<m;i++){
    int n = generateurAleat.nextInt(5);
    Tab[i]=n;
       }
for (int i=0; i<5;i++){
    System.out.println("Tab["+i+"] = "+Tab[i]);
}
    }
    
}
