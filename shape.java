import java.util.*;
interface shape
{
 double area();
 double perimeter();
}
class circle implements shape
{
 private double radius;
 public cricle()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the radius of circle:");
  this.radius=sc.nextDouble();
 }
 public double area()
 {
  return 3.14*radius*radius;
 }
 public double perimeter()
 {
  return 2*3.14*radius;
 }
}
class reactangle implements shape
{
 int length;
 int weidth;
 public rectangle()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the length and breadth:");
  this.length=sc.nextInt();
  this.width=sc.nextInt();
  public double area()
  {
   public length*width;
  }
  public double parimeter()
  {
   return 2*(length+width);
  }
 }
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int choice;
  do
  {
  System.out.println("manu");
  System.out.println("\n 1.circle"."\n" +"2.rectanle"+"\n"+"3.exit");
  System.out.println("enter your choice:");
  choice=sc.nextInt();
  shape shape=null;
  if(choice==1)
  {
   shape=new circle();
  }
  else if(choice==2)
  {
   shape=new rectangle();
  }
  else if(choice==3)
  {
   System.out.println("exit");
   break;
  }
   System.out.println("area:"+shape.area());
   System.out.println("perimeter:"+shape.perimeter());
  }
  while(choice!=3);
 }
}
