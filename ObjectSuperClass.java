import java.io.*;
import java.util.*;
public class SumOfIntegers extends Object{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 integers for Addition : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=x+y;
		System.out.println("Sum of " +x+ " and " +y+ " is " +z);
	}
} 