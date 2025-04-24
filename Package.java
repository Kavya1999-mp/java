import Graphics.*;
import java.util.*;
class Package
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("menu\n 1.Rectangle \n 2.Triangle \n 3.Square \n 4.Circle");
  System.out.println("enter your choice");
  int choice=sc.nextInt();
  sc.nextLine();
  switch(choice)
  {
  case 1:
    Rectangle rect=new Rectangle(2,3);
    System.out.println("area of rectangle:"+rect.area());
    break;
   case 2:
     Triangle tri=new Triangle(4,5);
     System.out.println("area of triangle:"+tri.area()); 
     break;
  case 3:
     Square sq=new Square(4);
     System.out.println("area of square:"+sq.area());
     break;
  case 4:
     Circle c=new Circle(9);
     System.out.println("area of circle:"+c.area());
     break;
  default:
     System.out.println("invalid choice");             
  }
 }
 
}
