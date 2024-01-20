import java.lang.Math;
abstract class Shape
{
 abstract void area();
 double area;
}
class Rectangle extends Shape
{
 double w=50,h=25;
 void area()
 {
  area = w*h;
  System.out.println("Area of Rectangle : "+area);
 }
}
class Square extends Shape
{ 
 double a=40;
 void area()
 {
  area = (a*a);
  System.out.println("Area of Square : "+area);
 }
}
class Circle extends Shape
{
 double r=7;
 void area()
 {
  area = Math.PI * r * r;
  System.out.println("Area of Circle : "+area);
 }
}
class calculate_area
{
 public static void main(String [] args)
 {
  Square sq= new Square();
  Rectangle rc =new Rectangle();
  Circle cr =new Circle();
  sq.area();
  rc.area();
  cr.area();
 }
}