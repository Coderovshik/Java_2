class OperationAdd implements Strategy {
    @Override
    public void doOperation(int num1, int num2) {
        System.out.println("Сумма чисел: " + (num1 + num2));
    }
}