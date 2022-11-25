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
                t.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("Mythread exit");
    }
    
}

public class Main 
{
	public static void main(String args[]) {
		Mythread m1 = new Mythread();
	 try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Main"+i);
            Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("main exit");
    }
    
}