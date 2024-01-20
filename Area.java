import java.io.*;
import java.util.*;
import java.lang.*;
public class Area{
    public static void main(String[] args)
    {
        FindArea area = new FindArea();
        area.triangleArea(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
        area.rectangleArea(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
        area.squareArea(Double.parseDouble(args[0]));
        area.circleArea(Double.parseDouble(args[1]));
    }
}
abstract class CalcArea
{
    abstract void traingleArea(double b,double h);
    abstract void rectangleArea(double l,double b1);
    abstract void squareArea(double s);
    abstract void circleArea(double r);
}
class FindArea extends CalcArea{
    void traingleArea(double b,double h)
    {
        System.out.println("Area of traingle : "+(0.5*b*h));
    }
    void rectangleArea(double l,double b1)
    {
        System.out.println("Area of rectangle : "+(l*b1));
    }
    void squareArea(double s)
    {
        System.out.println("Area of square : "+s*s);
    }
    void circleArea(double r)
    {
        System.out.println("Area of circle : "+(3.14*r*r));
    }
}