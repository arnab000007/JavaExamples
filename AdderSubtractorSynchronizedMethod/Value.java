package AdderSubtractorSynchronizedMethod;

public class Value {
    public int value = 0;

    public int getValue() {
        return value;
    }

    public synchronized void intValue(int value) {
        this.value += value;
    }
    
}
