import java.io.*;
import java.util.*;
import java.lang.Thread;
public class ThreadDemo{
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(new Printer("Good morning ",1,2));
        Thread t2 = new Thread(new Printer("Hello ",1,2));
        Thread t3 = new Thread(new Printer("Welcome ",3,1));
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("All threads are started excecution ");
    }
}
class Printer implements Runnable{
    String message;
    int delay;
    int count;
    Printer(String message,int delay,int count){
        this.message=message;
        this.delay=delay;
        this.count=count;
    }
    public void run(){
        int i=0;
        try{
            while(i<count){
                System.out.print(message);
                i++;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}