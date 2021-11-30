/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_inchaud_peaucelle;

import java.util.Scanner;

/**
 *
 * @author Incha
 */
public class SP4_console_INCHAUD_PEAUCELLE {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("tape : ");
        int rep = sc.nextInt();
    
        if(rep != 0){
            System.out.println("retape");
            rep = sc.nextInt();
            if (rep == 0) {
                System.out.println("nique ta mère");
            }
        } else {
            System.out.println("j'abandonne");
        }
}
    
}