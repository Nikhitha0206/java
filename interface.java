interface area    
      {    
          double pi = 3.14;    
          double calc(double x,double y);    
       }    
    
class rect implements area    
   {    
      public double calc(double x,double y)    
        {    
            return(x*y);    
         }    
   }    
    
class cir implements area    
   {    
      public double calc(double x,double y)    
        {    
            return(pi*x*x);    
         }    
   } 
   class Tringle implements area{
      public double calc(double b,double h)
      {
         return((b*h)/2);
      }
   }   
    
class test7    
  {    
     public static void main(String arg[])    
       {    
          rect r = new rect();    
          cir c = new cir(); 
          Tringle t = new Tringle();   
          area a;    
    
          a = r;    
          System.out.println("\nArea of Rectangle is : " +a.calc(10,20));    
    
          a = c;    
          System.out.println("\nArea of Circle is : " +a.calc(15,15));    

          a = t;    
          System.out.println("\nArea of triangle is : " +a.calc(15,15));    
        }    
  }  