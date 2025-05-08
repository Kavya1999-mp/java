import java.io.*;
import java.util.*;
public class NumberFileProcessor {
public static void main(String[] args) {
String allNumbersFile = "all_numbers.txt";
String evenNumbersFile = "even_numbers.txt";
String oddNumbersFile = "odd_numbers.txt";
try (PrintWriter writer = new PrintWriter(new FileWriter(allNumbersFile))) {
for (int i = 1; i <= 20; i++) {
writer.println(i); 
}
System.out.println("Numbers written to " + allNumbersFile);
} catch (IOException e) {
e.printStackTrace();
}
try (BufferedReader reader = new BufferedReader(new FileReader(allNumbersFile));
PrintWriter evenWriter = new PrintWriter(new FileWriter(evenNumbersFile));
PrintWriter oddWriter = new PrintWriter(new FileWriter(oddNumbersFile))) {
String line;
while ((line = reader.readLine()) != null) {
int num = Integer.parseInt(line);
if (num % 2 == 0) {
evenWriter.println(num);
} else {
oddWriter.println(num);
}
}
System.out.println("Even and odd numbers separated.");
} catch (IOException e) {
e.printStackTrace();
}
displayFileContent(allNumbersFile);
displayFileContent(evenNumbersFile);
displayFileContent(oddNumbersFile);
}
public static void displayFileContent(String fileName) {
System.out.println("\nContents of " + fileName + ":");
try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
String line;
while ((line = reader.readLine()) != null) {
System.out.println(line);
}
} catch (IOException e) {
e.printStackTrace();
}
}
}
