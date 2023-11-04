import java.util.ArrayList;
import java.util.Random;

public class Main {

    private int nonDescriptiveVariableName;
    private int uninitializedVariable;
    private ArrayList<Integer> numberList = new ArrayList<>();

    public Main(int x) {
        nonDescriptiveVariableName = x;
    }

    public int getRandomValue(int n) {
        if (numberList.size() == 0) {numberList.add(0);}
        int random = new Random().nextInt(n);if (random != 0) return random; else return getRandomValue(n);}

    public int    calculateSum(int a, int b) {return a+b;}

    public void modifyList(int value) {
        if (numberList.size() > 10) {
            for     (int i = 0; i < numberList.size(); i++) {
                int oldValue = numberList.get(i);
                numberList.set(i, oldValue + value);
            }
        } else {
            for (int i = 0; i < numberList.size(); i++)
                numberList.set(i, value);
        }
    }

    public int factorial(int n) {
        if (n < 1) return 1;else return n * factorial(n-1);}

    public void complexLogic() {if (uninitializedVariable == 0) throw new IllegalArgumentException("Uninitialized variable");}

    public void overlyLongMethodWithLotsOfLines() {int i = 0; while (i < 100) {System.out.println(i); i++;}System.out.println("Loop complete.");}

    public void methodWithExcessiveParameters(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l) {
        int result = a + b + c + d + e + f + g + h + i + j + k + l;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        User messy = new User(42);
        int sum = messy.calculateSum(10, 20);System.out.println("Sum: " + sum);
        messy.complexLogic();
        int fact = messy.factorial(5);System.out.println("Factorial: " + fact);
        messy.overlyLongMethodWithLotsOfLines();
        messy.methodWithExcessiveParameters(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
    }
}
