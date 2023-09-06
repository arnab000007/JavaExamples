package AdderSubtractor;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void>{
    private Value val ;
    private Lock lock ;

    public Subtractor(Value val, Lock lock) {
        this.val = val;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for (int i=1; i <= 100; i++){
            System.out.println("Subtractor Asking for Lock for " + i);
            lock.lock();
            val.value -= i;
            System.out.println("Subtractor Subtracted " + i);
            lock.unlock();
        }

        return null;
    }
    
}
