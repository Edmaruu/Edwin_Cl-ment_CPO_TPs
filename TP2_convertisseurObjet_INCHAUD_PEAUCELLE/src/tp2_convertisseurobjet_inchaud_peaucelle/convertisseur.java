/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_inchaud_peaucelle;

/**
 *
 * @author Incha
 */
public class convertisseur {
    int nbConversions;
    
    public convertisseur () {
 nbConversions = 0 ;

}
    public double CelsiusVersKelvin (double tCelsius){
        double tKelvin=tCelsius+273.15;
        nbConversions++;
        return tKelvin;
    }
    public double KelvinVersCelsius (double tKelvin){
         nbConversions++;
        double tCelsius=tKelvin-273.15;
        return tCelsius;
    }
    public double FahrenheitVersCelsius (double tFahrenheit){
         nbConversions++;
        double tCelsius=(tFahrenheit-32)*1.8;
        return tCelsius;
    }
    public double CelsiusVersFahrenheit (double tCelsius){
        double tFahrenheit=(tCelsius*1.8)+32;
         nbConversions++;
        return tFahrenheit;
    }
    public double KelvinVersFahrenheit (double tKelvin){
         nbConversions++;
        double tCelsius=KelvinVersCelsius(tKelvin);
        double tFahreneiht=CelsiusVersFahrenheit(tCelsius);
        nbConversions=nbConversions-1;
        return tFahreneiht;
    }
    public double FahrenheitVersKelvin (double tFahrenheit){
        nbConversions++;
        double tCelsius=FahrenheitVersCelsius(tFahrenheit);
        double tKelvin=CelsiusVersKelvin(tCelsius);
        nbConversions=nbConversions-1;
        return tKelvin;
    }
@Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}

}
