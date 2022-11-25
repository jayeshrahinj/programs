class Mythread implements Runnable
{
Thread t;
Mythread()
{
t = new Thread(this,"Mythread");
System.out.println(t);
t.start();
}
public void run()
{
try
{
 for(int i=1;i<=5;i++)
{
System.out.println("Mythread"+i);
t.sleep(3000);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println("Mythread exit");
}
}
class Testthread1
{
public static void main(String args[])
{
Mythread ob1 = new Mythread();
try
{
for(int i=1;i<=5;i++)
{
System.out.println("main"+i);
Thread.sleep(3000);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println("main exit");
}
}
