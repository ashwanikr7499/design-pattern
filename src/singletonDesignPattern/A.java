package singletonDesignPattern;

public class A {
    private static int cnt;
    private A()
    {
        cnt++;
        System.out.println("New object created "+cnt);
    }
    private static A a=null;
    public static A getA()
    {
        if(a!=null) return a;
        else
        {
            synchronized (A.class){
                if(a!=null) return a; // try to comment this
                a=new A();
                return a;
            }

        }

    }
}
