package Calculator;

import java.text.DecimalFormat;

import static java.lang.Math.*;

/**
 * Created by Saoirse Stewart on 29/01/2016.
 */
public class Calculator {


    public double Getadd(double num, double num2)
    {
        return num + num2;
    }
    public double Getsubtract(double num ,double num2)
    {
        return num- num2;
    }
    public double Getmultiply(double num ,double num2)
    {
        return num*num2;
    }
    public double GetsquartRoot(double num)
    {
      return sqrt(num);
    }
    public double GetPowerOf(double num, int val)
    {
        return pow(num,val);
    }
    public double Getcos(double num)
    {
        return cos(num);
    }
    public double Getsin(double num)
    {
        return sin(num);
    }

    public double Gettan(double num)
    {
        return tan(num);
    }
    public String toString(double num)
    {
        DecimalFormat df = new DecimalFormat("#.###");

        return df.format(num).toString();
    }

}
