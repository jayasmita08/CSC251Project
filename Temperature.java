public class Temperature
{
  //instance field for holding temp in F
  private double ftemp;
  
  //no-arg constructor
  public Temperature()
  {
    ftemp = 68.0; //room temp
  }
  
  //arg constructor @param temp The temp in F
  public Temperature(double temp)
  {
    ftemp = temp;
  }
  
  //mutator method
  public void setFahrenheit(double f)
  {
     ftemp = f;
  }
  
  //accessor method
  public double getFahrenheit()
  {
    return ftemp;
  }
  //method for getting temp in C
  public double getCelsius()
  {
    double c = (5.0/9.0)*(ftemp-32);
    return c;
  }
  //method for getting temp in K
  public double getKelvin()
  {
    double k = ((5.0/9.0)*(ftemp-32))+273;
    return k;
  }

}
