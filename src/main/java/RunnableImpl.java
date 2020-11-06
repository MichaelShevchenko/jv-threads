import org.apache.log4j.Logger;

public class RunnableImpl implements Runnable {
    private static final Logger logger = Logger.getLogger(RunnableImpl.class);
    private int maxCounterValue;
    private Counter counter;

    public RunnableImpl(int maxCounterValue, Counter counter) {
        this.maxCounterValue = maxCounterValue;
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getCounterValue() < maxCounterValue) {
            counter.incrementCounter();
            logger.info("RunnableImpl " + Thread.currentThread().getName()
                    + " : counter value = " + counter.getCounterValue());
        }
    }
}
