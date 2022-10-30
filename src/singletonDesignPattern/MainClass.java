package singletonDesignPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

  public static void main(String[] args) {
        A a=null;
        ExecutorService executorService= Executors.newFixedThreadPool(100);
        for(int i=0;i<1000;i++)
        {
            executorService.execute(A::getA);
        }
        executorService.shutdown();

  }

}
