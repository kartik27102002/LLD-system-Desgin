public class sortContext {
    sortStrategy strategy;

    sortContext(sortStrategy strategy) {
        this.strategy = strategy;
    }

    public void getStrategy(int[] arr) {
        strategy.sort(arr);
    }
}
