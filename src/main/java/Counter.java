public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int value) {
        this.value = value;
    }

    public int getCounterValue() {
        return value;
    }

    public void incrementCounter() {
        value++;
    }
}
