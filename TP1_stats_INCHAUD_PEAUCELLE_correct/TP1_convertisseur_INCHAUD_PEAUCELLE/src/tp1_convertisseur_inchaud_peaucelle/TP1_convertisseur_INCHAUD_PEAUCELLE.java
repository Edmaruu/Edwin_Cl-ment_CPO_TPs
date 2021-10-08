/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_inchaud_peaucelle;

import java.util.Scanner;

/**
 *
 * @author Incha
 */
public class TP1_convertisseur_INCHAUD_PEAUCELLE {

    public static double CelsiusVersKelvin (double tCelsius){
        double tKelvin=tCelsius+273.15;
        return tKelvin;
    }
    public static double KelvinVersCelsius (double tKelvin){
        double tCelsius=tKelvin-273.15;
        return tCelsius;
    }
    public static double FahrenheitVersCelsius (double tFahrenheit){
        double tCelsius=(tFahrenheit-32)*1.8;
        return tCelsius;
    }
    public static double CelsiusVersFahrenheit (double tCelsius){
        double tFahrenheit=(tCelsius*1.8)+32;
        return tFahrenheit;
    }
    public static double KelvinVersFahrenheit (double tKelvin){
        double tCelsius=KelvinVersCelsius(tKelvin);
        double tFahreneiht=CelsiusVersFahrenheit(tCelsius);
        return tFahreneiht;
    }
    public static double FahrenheitVersKelvin (double tFahrenheit){
        double tCelsius=FahrenheitVersCelsius(tFahrenheit);
        double tKelvin=CelsiusVersKelvin(tCelsius);
        return tKelvin;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double temp1;
        double temp2;
        int choix;
        System.out.println(" Choisissez une valeur");
        temp1=sc.nextDouble();
        System.out.println(temp1);
        System.out.println("Saisissez la conversion que vous souhaitez effectuer \n 1. Celsius vers Kelvin \n 2. Kelvin vers celsius \n 3. Celsius vers fahreneiht \n 4. Fahreneiht vers Celsius \n 5. Kelvin vers Fahreneiht \n 6. Fahreneiht vers Kelvin");
        choix=sc.nextInt();
        if (choix==1){
            temp2=CelsiusVersKelvin(temp1);
            System.out.println(temp2);
        }
        if (choix==2){
            temp2=KelvinVersCelsius(temp1);
            System.out.println(temp2);
        }
        if (choix==3){
            temp2=CelsiusVersFahrenheit(temp1);
            System.out.println(temp2);
        }
        if (choix==4){
            temp2=FahrenheitVersCelsius(temp1);
            System.out.println(temp2);
        }
        if (choix==5){
            temp2=KelvinVersFahrenheit(temp1);
            System.out.println(temp2);
        }
        if (choix==6){
            temp2=FahrenheitVersKelvin(temp1);
            System.out.println(temp2);
        }
    }
    
}
