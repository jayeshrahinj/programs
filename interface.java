
interface first
{
void show();
}
class A implements first
{
public void show()
{
System.out.println("hello from show");
}

}
class Interface
{
public static void main(String args[])
{
A a1=new A();
a1.show();
}

}