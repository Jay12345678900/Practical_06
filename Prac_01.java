class thread1 implements Runnable 
    {
        @Override
        public void run()
        {
            System.out.println("1");
        }
    }
    class thread2 implements Runnable
    {
        @Override
        public void run()
        {
            System.out.println("2");
        }
    }
    class thread3 implements Runnable
    {
        @Override
        public void run()
        {
            System.out.println("3");
        }
    }

public class Prac_01 {
    public static void main(String[] args) {
        // System.out.println("hello");
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);
        
        th1.start();
        th2.start();
        th3.start();
      
    }
}