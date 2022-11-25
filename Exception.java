class Exception
{
public static void main(String args[])
{
int a= 10,b=10,c,d[]={1,2,3};
try
{
c=a/b;
System.out.println(c);
System.out.println(d[3]);
}
catch(ArithmeticException e)
{
System.out.println("don't divide by zero");
}

catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Index of array is invalid");
}


}
}