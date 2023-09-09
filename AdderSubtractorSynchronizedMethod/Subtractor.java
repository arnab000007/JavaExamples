package AdderSubtractorSynchronizedMethod;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void>{
    private Value val ;

    public Subtractor(Value val) {
        this.val = val;
    }

    @Override
    public Void call() throws Exception {
        for (int i=1; i <= 100; i++){
            System.out.println("Subtractor Asking for Lock for " + i);
            //lock.lock();
            
            val.intValue(-1 * i);
            System.out.println("Subtractor Subtracted " + i);
            
            
            //lock.unlock();
        }

        return null;
    }
    
}
