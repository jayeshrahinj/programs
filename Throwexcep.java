class Throwexcep extends Exception
{
String message;
Throwexcep(String temp)
{
message = temp;
}
public String tostring()
{
return ("Throwexcep :"+message);
}
}
class Test
{
public static void main(String args[])
{
int a=10,b=1,c;
try
{
if(b==1)
{
throw new Throwexcep("/ by one");
}
else
{
c=a/b;
System.out.println(c);
}
}
catch(Throwexcep e)
{
System.out.println(e);
}
System.out.println("bye");
}
}