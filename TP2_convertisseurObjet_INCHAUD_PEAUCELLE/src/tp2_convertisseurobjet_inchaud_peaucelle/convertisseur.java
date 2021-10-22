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
        return tKelvin;
    }
    public double KelvinVersCelsius (double tKelvin){
        double tCelsius=tKelvin-273.15;
        return tCelsius;
    }
    public double FahrenheitVersCelsius (double tFahrenheit){
        double tCelsius=(tFahrenheit-32)*1.8;
        return tCelsius;
    }
    public double CelsiusVersFahrenheit (double tCelsius){
        double tFahrenheit=(tCelsius*1.8)+32;
        return tFahrenheit;
    }
    public double KelvinVersFahrenheit (double tKelvin){
        double tCelsius=KelvinVersCelsius(tKelvin);
        double tFahreneiht=CelsiusVersFahrenheit(tCelsius);
        return tFahreneiht;
    }
    public double FahrenheitVersKelvin (double tFahrenheit){
        double tCelsius=FahrenheitVersCelsius(tFahrenheit);
        double tKelvin=CelsiusVersKelvin(tCelsius);
        return tKelvin;
    }
@Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}

}
