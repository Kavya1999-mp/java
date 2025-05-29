import java.util.*;
class fibonacci implements Runnable
{
 public void run()
 {
  int a=0,b=1;
  System.out.println("fibonacci numbers:");
  for(int i=0;i<10;i++)
  {
   System.out.println(a+" ");
   int c=a+b;
   a=b;
   b=c;
  }
 }
}
class even implements Runnable
{
 public void run()
 {
  int j;
  System.out.println("even number upto 20:");
  for(j=0;j<=20;j++)
  {
   if(j%2==0)
   {
    System.out.println(j+" ");
   }
  }
 } 
}
public class run
{
 public static void main(String args[])
 {
  fibonacci f=new fibonacci();
  even e=new even();
  Thread tf=new Thread(f);
  Thread te=new Thread(e);
  tf.start();
  te.start();
 }
}
