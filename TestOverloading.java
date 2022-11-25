
class TestOverloading 
{
public static void main(String args[])
{
Adder A = new Adder();
System.out.println(A.add(11,11));
System.out.println(A.add(11,11,11));
}
}
class Adder
{
int add(int a,int b)
{
return a+b;
}

int add(int a,int b,int c)
{
return a+b+c;
}
}
