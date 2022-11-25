class Excep
{
public static void main(String args[])
{
int a= 10,b=10,c;
try
{
c=a/b;
System.out.println(c);
}
catch(ArithmeticException e)
{
System.out.println(e);
System.out.println("don't divide by zero");
}
}