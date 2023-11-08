public class HelloApplication {
    private final int descriptiveVariable;

    public static void main(String[] args) {
        HelloApplication mainObject = new HelloApplication(42);
        int sum = mainObject.calculateSum(10, 20);
        System.out.println("Sum: " + sum);
        mainObject.complexLogic();
        int factorialResult = mainObject.factorial(3);
        System.out.println("Factorial: " + factorialResult);
        mainObject.printNumbersAndCompleteLoop();
        mainObject.calculateSumOfVariables(1, 2, 3, 5);
    }
    
    public HelloApplication(int initialValue) {
        descriptiveVariable = initialValue;
    }

    public int calculateSum(int a, int b) {
        return a + b;
    }

    public int factorial(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public void complexLogic() {
        if (descriptiveVariable == 0) {
            throw new IllegalArgumentException("Descriptive variable is uninitialized");
        }
    }

    public void printNumbersAndCompleteLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Loop complete.");
    }

    public void calculateSumOfVariables(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        System.out.println("Result: " + result);
    }
}
