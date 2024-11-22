package com.gsv.javaFramework;
//class A
//{
//    int i=10;
//
//    @Override
//    public String toString() {
//        return " "+i;
//    }
//}
//
//class B
//{
//    int j=11;
//
//    @Override
//    public String toString() {
//        return " "+j;
//    }
//}
//
//class Generic<T,X>
//{
//    T t1;
//    X x1;
//
//    public Generic(T t1, X x1)
//    {
//        this.t1=t1;
//        this.x1=x1;
//    }
//
//    void print()
//    {
//        System.out.println("Value of A: "+t1);
//        System.out.println("Value of B: "+x1);
//
//    }
//}
//
//class Test1<X>
//{
//    X x1;
//    Test1(X x1){
//        this.x1=x1;
//    }
//    X get()
//    {
//        return x1;
//    }
//}
//
//public class genericTemplate1 {
//    public static void main(String[] args) {
//        Test1<Object>t=new Test1<Object>("ABC");
//        String s1=(String)t.get();
//        System.out.println(s1);
//
//        Test1<Integer>t1=new Test1<Integer>(1);
//        Integer i1=(Integer)t1.get();
//        System.out.println(i1);
//    }
//}
