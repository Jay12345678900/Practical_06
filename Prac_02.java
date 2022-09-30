import java.util.*;

class Odd extends Thread{
    int arr[] = new int[30];
    Odd(int []arr)
    {
        for(int i=0;i<30;i++)
        {
            this.arr[i] = arr[i];
        }
    }

    @Override
    public void run()
    {
        for(int i=0;i<30;i++)
        {
            if(arr[i]%2 != 0)
            {
                System.out.println("Odd number is:-  "+arr[i]);
            }
        }
    }
}

class Even extends Thread
{
    int arr[] = new int[30];
    Even(int [] arr)
    {
        for(int i=0;i<30;i++)
        {
            this.arr[i] = arr[i];
        }
    }

    @Override
    public void run()
    {
        for(int i=0;i<30;i++)
        {
            if(arr[i]%2 == 0)
            {
                System.out.println("Even number is:-  "+arr[i]);
            }
        }
    }
}

public class Prac_02 {
    public static void main(String[] args) {
        int arr[] = new int[30];
        Random r = new Random();
        for(int i=0;i<30;i++)
        {
            arr[i] = r.nextInt(100);
        }
        Odd o = new Odd(arr);
        Even e = new Even(arr);

        o.start();
        e.start();
    }
}