import java.util.*;
class Arrary
{
 public static void main(String args[])
 {
  ArrayList<String>st=new ArrayList<>();
  Scanner sc=new Scanner(System.in);
  st.add("apple");
  st.add("orange");
  st.add("papaya");
  System.out.println("list of strings are"+st);
  System.out.println("enter the string to be added:");
  String input=sc.nextLine();
  st.add(input);
  System.out.println("After adding the string:"+st);
  st.remove("papaya");
  System.out.println("After removeing the string:"+st);
  Collections.sort(st);
  System.out.println("sorted strings are:"+st);
  System.out.println("enter the string to search:");
  String s=sc.nextLine();
   if(st.contains(s))
    {
     System.out.println(s+"is found");   
    }
   else
    {
     System.out.println(s+"is not found");
    }
 System.out.println("total numbers of elements in string are"+st.size());   
 }
}
