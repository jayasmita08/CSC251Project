import java.util.*;
public class TempDemo
{
   public static void main (String[] args)
    {
    Scanner sc = new Scanner (System.in);
    double fahren;
    
    System.out.println("Enter a fahrenheit temp");
    fahren = sc.nextDouble();
    
    //instantiate an object
    Temperature t = new Temperature(fahren);
    
    System.out.println("Celsius: " + t.getCelsius());
    System.out.println("Kelvin: " + t.getKelvin());
    }
}

    
    