import java.util.Scanner;
class Typeconversion
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println( "enter first value");
int a = sc.nextInt();
System.out.println("enter second value");
int b = sc.nextInt();
int c = a+b;
System.out.println("sum of"+"  "+ a +"  "+ "and"+"  " + b +"  "+"="+c);
}
}