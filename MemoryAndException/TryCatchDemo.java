package MemoryAndException;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException: chia cho 0
        } catch (ArithmeticException e) {
            System.out.println("Bắt ngoại lệ: " + e.getMessage());
        }
    }
}
