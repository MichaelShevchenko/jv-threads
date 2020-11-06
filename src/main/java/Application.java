import org.apache.log4j.Logger;

public class Application {
    private static final int MAX_COUNTER_VALUE = 100;
    private static final Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("Program was started!");
        Counter newCounter = new Counter();
        Thread newThread = new ThreadImpl(MAX_COUNTER_VALUE, newCounter);
        Thread newRunnable = new Thread(new RunnableImpl(MAX_COUNTER_VALUE, newCounter));
        newThread.start();
        newRunnable.start();
    }
}
