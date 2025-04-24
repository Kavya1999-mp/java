package Graphics;
import java.util.*;
interface Package
 {
  double area();
 } 
public class Triangle implements Package
{
 int length,heigth;
 public Triangle(int length,int heigth)
 {
  this.length=length;
  this.heigth=heigth;
 }
 public double area()
 {
  return 0.5*length*heigth;
 }
} 
