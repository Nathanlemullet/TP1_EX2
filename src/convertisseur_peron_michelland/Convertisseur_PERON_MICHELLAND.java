/*
 EX2
MICHELLAND / PERON
TP1_Syntaxe de base
07/10
TP1A2
 */
package convertisseur_peron_michelland;

import java.util.Scanner;

     

/**
 *
 * @author miche
 */

public class Convertisseur_PERON_MICHELLAND {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Entrer votre valeur :");
        float temp = sc.nextFloat();
        System.out.println(" Saisissez la conversion que vous souhaiter effectuer : \n 1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius \n 3)De Farenheit vers Celcius \n 4)De Celcius vers Farenheit \n 5)De Kelvin vers Farenheit \n 6)De Farenheit vers Kelvin");
        int Choix = sc.nextInt();
        if (Choix==1){
            float temperatureKelvin= CelciusVersKelvin(temp);
            System.out.println(" Votre température en kelvin vaut : "+temperatureKelvin);
        }
        if (Choix == 2){
            float temperatureCelcius = KelvinVersCelcius(temp);
            System.out.println("Votre température en celcius vaut : "+temperatureCelcius);
        }        
                
        if (Choix == 3){
            float temperatureFarenheit = CelciusVersFarenheit(temp);
            System.out.println("Votre température en farenheit vaut : "+temperatureFarenheit);
        }
        if (Choix == 4){
            float temperatureCelcius = FarenheitVersCelcius(temp);
            System.out.println("Votre température en celcius vaut : "+temperatureCelcius);
        }
        if (Choix == 5){
            float temperatureFarenheit = KelvinVersFarenheit(temp);
            System.out.println("Votre température en farenheit vaut : "+temperatureFarenheit);
        }
        if (Choix == 6){
            float temperatureKelvin = FarenheitVersKelvin(temp);
            System.out.println("Votre température en kelvin vaut : "+temperatureKelvin);
        }
    }
    
    
        
    
    
    
    public static float CelciusVersKelvin (float tempCelcius){
        float tempKelvin= (float) (tempCelcius + 273.15);
        return tempKelvin;
        
}
    
    public static float KelvinVersCelcius (float tempKelvin){
        float tempCelcius= (float) (tempKelvin - 273.15);
        return tempCelcius;
    }

     public static float FarenheitVersCelcius (float tempFarenheit){
        float tempCelcius= (float) (tempFarenheit - 32)*5/9;
        return tempCelcius;
    }
     
    public static float CelciusVersFarenheit (float tempCelcius){
        float tempFarenheit= (float) (tempCelcius *9/5)+32;
        return tempFarenheit;    
    }
    
    public static float KelvinVersFarenheit (float tempKelvin){
        float tempFarenheit= (float) ((float)(tempKelvin-273.15)*9/5)+32;
        return tempFarenheit;
    }
    
    public static float FarenheitVersKelvin (float tempFarenheit){
        float tempKelvin= (float) ((float) ((tempFarenheit - 32)*5/9)+273.15);
        return tempKelvin;
    }
    
}
    

    

        