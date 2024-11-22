//package com.gsv.javaFramework;
//class Test extends Thread
//{
//    public void run ()
//    {
//        for(int i=0;i<1000;i+=2)
//        {
//            System.out.println(getName()+":"+i);
//        }
//    }
//}
//
//public class multithreading {
//    public static void main(String[] args) {
//        Test t1=new Test();
//        t1.start();
//        for(int i=1;i<1000;i+=2)
//        {
//            System.out.println(Thread.currentThread().getName()+": "+i);
//        }
//    }
//}

//package com.gsv.javaFramework;
//class Computer extends Thread
//{
//    public Computer (String name)
//    {
//        super(name);
//    }
//    public void run ()
//    {
//        for(int i=0;i<1000;i++)
//        {
//            System.out.println(getName()+":"+i);
//        }
//    }
//}
//
//public class multithreading {
//    public static void main(String[] args) {
//Computer c=new Computer("AIDS");
//c.start();
//    }
//}



package com.gsv.javaFramework;
class one{
    public void set(int value)
    {
        int i=value/0;
        System.out.println("Value of"+Thread.currentThread()+":"+i);
    }
}

class two{
    int i;
    two(int i)
    {
        this.i=i;
    }
    void callSet()
    {
        new one().set(i);
    }
}

class OneTwo extends Thread{
    public void run()
    {
        two t=new two(10);
        t.callSet();
    }
}

class first
{
    public void set(int value)
    {
        int i=value/10;
        System.out.println("Value of "+Thread.currentThread()+":"+i);
    }
}

class second{
    int i;
    second(int i)
    {
        this.i=i;
    }
    void callSet()
    {
        new first().set(i);
    }
}

class firstSecond extends Thread
{
    public void run()
    {
        second t=new second(10);
        t.callSet();
    }
}
public class multithreading {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        OneTwo ot=new OneTwo();
        ot.start();
        firstSecond fs=new firstSecond();
        fs.start();
    }
}
