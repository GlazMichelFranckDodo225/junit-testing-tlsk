import com.dgmf.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.divide(10, 5);

        if(result == 2) System.out.println("Test Case Passed ...");
        else System.out.println("Test Case Failed ...");

        int result2 = calculator.divide(10, 0);

        if(result2 == 2) System.out.println("Test Case Passed ...");
        else System.out.println("Test Case Failed ...");
    }
}