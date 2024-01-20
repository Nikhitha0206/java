import java.io.*;
import java.util.*;
import java.lang.*;
class MultiExceptions{
    public static void main(String[] args){
        int n1,n2;
        int arr[] = new int[20];
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a value:");
            n1=sc.nextInt();
            System.out.println("Enter n2: ");
            n2=sc.nextInt();
            arr[20]=n1/n2;
        }
        catch(Exception e)
        {
            System.out.println("Exception caught: "+e.getMessage());
        }
    }
}