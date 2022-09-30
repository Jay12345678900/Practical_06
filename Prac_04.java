class Mythread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<50;i++)
        System.out.println("Priority of Thread ia :- "+this.getPriority());    

    }
}

public class Prac_04 {
    public static void main(String[] args) {
        Mythread1 m1 = new Mythread1();
        Mythread1 m2 = new Mythread1();
        Mythread1 m3 = new Mythread1();
        m1.setPriority(3);
        m2.setPriority(5);
        m3.setPriority(7);
        m1.start();
        m2.start();
        m3.start();
    }
}
