import org.apache.log4j.Logger;

public class ThreadImpl extends Thread {
    private static final Logger logger = Logger.getLogger(ThreadImpl.class);
    private int maxCounterValue;
    private Counter counter;

    public ThreadImpl(int maxCounterValue, Counter counter) {
        this.maxCounterValue = maxCounterValue;
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCounterValue() < maxCounterValue) {
            counter.incrementCounter();
            logger.info("ThreadImpl " + Thread.currentThread().getName()
                    + " : counter value = " + counter.getCounterValue());
        }
    }
}
