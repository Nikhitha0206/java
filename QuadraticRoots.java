import java.io.*;
import java.util.*;
import java.lang.*;
public class QuadraticRoots{
    public static void main(String[] args){
        double a,b,c,d,root1,root2;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a: ");
        a=sc.nextDouble();
        System.out.print("Enter b: ");
        b=sc.nextDouble();
        System.out.print("Enter c: ");
        c=sc.nextDouble();
        d=(b*b)-(4*a*c);
        if(d>0)
        {
            root1=(-b+Math.sqrt(d))/(2*a);
            root2=(-b-Math.sqrt(d))/(2*a);
            System.out.print("First root is : "+root1+" Second root is : "+root2);
        }
        else if(d==0){
            root1=root2=-b/(2*a);
            System.out.print("roots are imaginary : "+root1);
        }
        else{
            System.out.print("Roots are imaginary");
        }
    }
}

