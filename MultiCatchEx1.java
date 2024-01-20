public class MultiCatchEx1 
{
public static void main(String[] args) 
{ 
 try
 { 
// Creating an array of six integer elements.
   int arr[] = new int[6];
   //arr[6]={1,2,3,4,5,6};
   arr[7] = 30/2; // Exception occurred. 
   System.out.println("I am in try block"); 
 } 
 catch(ArithmeticException ae)
 { 
   System.out.println("A number cannot be divided by zero, Illegal operation in java"); 
 } 
 catch(ArrayIndexOutOfBoundsException e)
 { 
   System.out.println("Accessing array element outside of specified limit"); 
 } 
 catch(Exception e)
 { 
    System.out.println(e.getMessage()); 
  } 
  System.out.println("I am out of try-catch block"); 
 } 
}