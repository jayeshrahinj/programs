class Throwexcep extends Exception
{
String m;
Throwexcep(String temp)
{
m = temp;
}
Public String toString()
{
return ("Throwexcep :"+m);
}
}
class testexception
{
public static void main(String args[])
{
int a=10,b=1,c;
try
{
if(b==1)
{
throw new ArithmeticException("/ by one");
}
else
{
c=a/b;
System.out.println(c);
}
}
catch(ArithmeticException e)
{
System.out.println(e);
}
System.out.println("bye");
}
}