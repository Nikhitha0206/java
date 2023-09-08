import java.io.*;
import java.utli.*;
public class StdAvg{
public static void main(string[],args){
int m1,m2,m3;
system.out.println("Enter marks of three subjects:");
Scanner sc=new Scanner(System.in);
int m1=new.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int total=m1+m2+m3;
float avg=total/3.0;
if(avg>=75)
{
	system.out.println("Student passed in first class");
}
else if(avg>=50&&avg<60)
{
	system.out.printlin("Student passed in second class");
}
else if(avg>=40&&avg<50)
{	
	system.out.println("Student passed in third class");
}
else
{
	system.out.println("Student failed");
}
}
}