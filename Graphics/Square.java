package Graphics;
import java.util.*;
interface Package
{
 double area();
}
public class Square implements Package
{
 int side;
 public Square(int side)
 {
  this.side=side;
 }
 public double area()
 {
  return side*side;
 }
}
