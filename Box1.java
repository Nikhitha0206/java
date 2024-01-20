import java.io.*;
import java.util.*;
import java.lang.*;
public class Box{
    double width,height,depth,volume;
    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }
    Box(double a){
        width=a;
        height=a;
        depth=a;
    }
    Box(double l,double b,double h){
        width=3;
        height=5;
        depth=6;
    }
    public double volume(){
        return (width*height*depth);
    }
    public static void main(String[] args)
    {
        if(args.length==0)
        {
            Box c = new Box();
            System.out.println("Volume of Box() is : "+c.volume());
        }
        if(args.length==1){
            double a = Double.parseDouble(args[0]);
            Box b = new Box(a);
            System.out.println("Volume of Box("+a+") is : "+b.volume());
        }
        if(args.length==3){
            double l=Double.parseDouble(args[0]);
            double b=Double.parseDouble(args[1]);
            double h=Double.parseDouble(args[2]);
            Box a = new Box(l,b,h);
            System.out.println("Volunme of Box("+l+","+b+","+h+") is : "+a.volume());
        }
    }
}