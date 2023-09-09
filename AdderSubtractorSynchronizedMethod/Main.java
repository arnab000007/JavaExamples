package AdderSubtractorSynchronizedMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
         Value v = new Value();
         Adder adder = new Adder(v);
         Subtractor subscriber = new Subtractor(v);

         ExecutorService es = Executors.newCachedThreadPool();

         Future<Void> aFuture = es.submit(adder);
         Future<Void> bFuture = es.submit(subscriber);

        aFuture.get();
        bFuture.get();
        
        System.out.println(v.value);
    }
}
