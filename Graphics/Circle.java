package Graphics;
import java.util.*;
interface Package
{
 double area();
}
public class Circle implements Package
{
 int r;
 public Circle(int r)
 {
  this.r=r;
 }
 public double area()
 {
 	double a=Math.PI*r*r;
  	return a;
 }
}
