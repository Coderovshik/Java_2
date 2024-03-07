public class StrategyPattern {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        context.executeStrategy(5, 3);

        context = new Context(new OperationSubtract());
        context.executeStrategy(5, 3);
    }
}