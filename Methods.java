package java_methods;

import java.util.Scanner;

public class  Methods {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter three numbers:");
double num1 = input.nextDouble();
double num2 = input.nextDouble();
double num3 = input.nextDouble();

double smallest = Math.min(Math.min(num1, num2), num3);
double largest = Math.max(Math.max(num1, num2), num3);

System.out.println("The smallest number: " + smallest);
System.out.println("The largest number: " + largest);
System.out.println(smallest + " is your smallest and " + largest + " is your largest number.");
 }
}
