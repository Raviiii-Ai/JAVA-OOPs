//package com.gsv.javaFramework;
//
//import static java.lang.Character.getName;
//
//class Testb extends Thread
//{
//    public void run()
//    {
//        for(int i=0;i<1000;i+=2)
//        {
//            if(i==400)
//            {
//                stop();
//            }
//            try{
//                Thread.sleep(100);
//            }
//            catch (InterruptedException ex)
//            {
//                ex.printStackTrace();
//            }
//            System.out.println(getName()+":"+i);
//        }
//    }
//}
//
//class Sample extends Thread
//{
//    public void run ()
//    {
//        for(int i=1;i<1000;i++)
//        {
//            try{
//                Thread.sleep(100);
//            }
//            catch (InterruptedException ex)
//            {
//                ex.printStackTrace();
//            }
//            System.out.println(getName()+":"+i);
//
//        }
//
//    }
//}
//
//public class multiThread1  {
//    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//        Test t1=new Test();
//        t1.start();
//        Sample s1=new Sample();
//        s1.start();
//    }
//}
