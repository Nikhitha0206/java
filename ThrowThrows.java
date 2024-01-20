import java.io.*;
import java.util.*;
import java.lang.*;
class InvalidAgeException extends Exception{
    InvalidAgeException(String str){
        super(str);
    }
}
class ThrowThrowsExample{
    static void validate(int age)throws InvalidAgeException{
        if(age>=18){
            System.out.println("Valid age : "+age);
        }
        else{
            System.out.println("Custom exception caught: Age must be atleast 18 years");
        }
    }
    public static void main(String args[]){
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age : ");
        age=sc.nextInt();
        try{
            validate(age);
        }
        catch(InvalidAgeException e){
            System.out.println("custom exception caught: "+e);
        }
    }
}