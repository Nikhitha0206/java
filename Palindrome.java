import java.io.*;
import java.util.*;
publiuc class Palindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n : ");
		int n=sc.nextInt();
		int sum=0;
		int n1=n;
		int rev=0;
		while(n>0){
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("After reversing the number is" +rev);
		if(rev==n1){
			System.out.println(n1+ "is a palindrome");
	`	}
		else{
		System.out.println(n1+ "is not a palindrome");
		}
	}
}