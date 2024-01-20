//import java.io.*;
import java.util.*;
class Employee{
    String name;
    int age;
    String designation;
    double salary;
    void setData(String[] args){
        name=String.valueOf("Nikhitha");
        age=Integer.valueOf(19);
        designation=String.valueOf("Student");
        salary=Double.valueOf(50000);
    }
    void displayData()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Designation : "+designation);
        System.out.println("Salary : "+salary);
    }
    public static void main(String[] args){
        Employee e=new Employee();
        e.setData(args);
        e.displayData();
    }
}