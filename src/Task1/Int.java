package Task1;

public class Int {
   private int value = 0;

   public Int() {
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public void increment() {
        this.value++;
    }

    public void decrement() {
        this.value--;
    }
    public void multiply(Int value) {
       this.value *= value.getValue();
    }

    public void add(Int n) {
        this.value += n.getValue();

    }

    public int getValue() {
        return this.value;
    }

}

