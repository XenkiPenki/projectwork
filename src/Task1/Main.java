package Task1;

public class Main {
    public static void main(String[] args) {
        Int result = new Int();
        Int multiplier = new Int();
        multiplier.increment();
        multiplier.increment();
        result.increment();
        result.increment();
        result.multiply(multiplier);
        result.multiply(multiplier);
        result.multiply(multiplier);
        result.decrement();
        result.decrement();
        result.multiply(result);


        System.out.println(result);
    }
}
