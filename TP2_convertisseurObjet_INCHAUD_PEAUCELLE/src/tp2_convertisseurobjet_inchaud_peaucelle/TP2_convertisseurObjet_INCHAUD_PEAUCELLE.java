/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_inchaud_peaucelle;

import java.util.Scanner;

/**
 *
 * @author Incha
 */
public class TP2_convertisseurObjet_INCHAUD_PEAUCELLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        convertisseur tokelvin= new convertisseur();
        convertisseur tocelsius= new convertisseur();
        double tem=tokelvin.CelsiusVersKelvin(50.0);
        double tem1=tokelvin.FahrenheitVersKelvin(49.0);
        double tap=tocelsius.KelvinVersCelsius(50);
        System.out.println(tem);
        System.out.println(tem1);
        System.out.println(tokelvin);
        System.out.println(tap);
        System.out.println(tocelsius);
        
        Scanner sc = new Scanner(System.in);
      convertisseur conversion=new convertisseur();
        double temp1;
        double temp2;
        int choix;
        System.out.println(" Choisissez une valeur");
        temp1=sc.nextDouble();
        System.out.println(temp1);
        System.out.println("Saisissez la conversion que vous souhaitez effectuer \n 1. Celsius vers Kelvin \n 2. Kelvin vers celsius \n 3. Celsius vers fahreneiht \n 4. Fahreneiht vers Celsius \n 5. Kelvin vers Fahreneiht \n 6. Fahreneiht vers Kelvin");
        choix=sc.nextInt();
        if (choix==1){
            temp2=conversion.CelsiusVersKelvin(temp1);
            System.out.println(temp2);
        }
        if (choix==2){
            temp2=conversion.KelvinVersCelsius(temp1);
            System.out.println(temp2);
        }
        if (choix==3){
            temp2=conversion.CelsiusVersFahrenheit(temp1);
            System.out.println(temp2);
        }
        if (choix==4){
            temp2=conversion.FahrenheitVersCelsius(temp1);
            System.out.println(temp2);
        }
        if (choix==5){
            temp2=conversion.KelvinVersFahrenheit(temp1);
            System.out.println(temp2);
        }
        if (choix==6){
            temp2=conversion.FahrenheitVersKelvin(temp1);
            System.out.println(temp2);
        }
        System.out.println(conversion);
        
    }
    
}
