class testthread
{
public static void main(String args[])
{
Thread t = Thread.currentThread();
System.out.println(t);
t.setName("mythread");
System.out.println(t);
System.out.println(t.getName());
t.setPriority(Thread.MAX_PRIORITY);
System.out.println(t);
System.out.println(t.getPriority());
System.out.println(t.isAlive());
try
{
for(int i=1;i<=5;i++)
{
System.out.println(i);
t.sleep(5000);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}