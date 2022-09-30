import java.util.*;

class Mythread extends Thread
{
    int a;
    Mythread(int a)
    {
        this.a = a;
    }
    public void increment()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(++a);
            try
        {
            sleep(1000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
    }
    public void run()
    {
        increment(); 
    }
}
public class Prac_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :-");
        int a = sc.nextInt();
        Mythread m = new Mythread(a);
        m.start();
    }
}