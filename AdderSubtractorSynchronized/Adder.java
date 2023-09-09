package AdderSubtractorSynchronized;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void>{
    private Value val ;

    public Adder(Value val) {
        this.val = val;
    }

    @Override
    public Void call() throws Exception {
        for (int i=1; i <= 100; i++){
            System.out.println("Adder Asking for Lock for " + i);
            //lock.lock();
            synchronized(val){
                val.value += i;
                System.out.println("Adder Added " + i);
            }
            
            //lock.unlock();
        }

        return null;
    }

    
}
