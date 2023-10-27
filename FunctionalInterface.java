public class Main {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;

        int result1 = addition.calculate(5, 3);
        int result2 = subtraction.calculate(10, 4);

        addition.printResult(result1);
        subtraction.printResult(result2);
    }
}

@FunctionalInterface
interface Calculator {
    abstract int calculate(int a, int b);
    
    // default and static methods are allowed in functional interfaces
    // if we want to call static function Calculator.printResultAgain needs 
    // to be called, if we make another abstract function in this class it 
    // would give error.
    default void printResult(int result) {
        System.out.println("Result: " + result);
    }
    
    static void printResultAgain(int result) {
        System.out.println("Result: " + result);
    }
}
