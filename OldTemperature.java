// Name : Joel Sare
// Class : CIST1400-004
// Colleagues : none
// Resources : none

// The purpose of this program is to convert Celcius to Fahrenheit

public class OldTemperature
{
   public static void main(String[] args)
   {
      //declare variables
      double inputCelsius;
      double outputDegreesF;
      final double conversion = 9.0/5.0;
      final int base = 32;

      //set up input value
      inputCelsius = 17;
      outputDegreesF = inputCelsius * conversion + base;
      System.out.println(inputCelsius + " degrees Celsius is " + outputDegreesF + " degrees Fahrenheit.");
   }
}