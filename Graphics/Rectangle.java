package Graphics;
import java.util.*;
interface Package
 {
  double area();
 }
public class Rectangle implements Package 
{
  int length,breadth;
  public Rectangle(int length,int breadth)
  {
   this.length=length;
   this.breadth=breadth;
  }
  public double area()
  {
   return length*breadth;
  }
}

