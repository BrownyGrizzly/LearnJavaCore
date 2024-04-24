package MemoryAndException;

public class ThrowDemo {
    public static void main(String[] args) {
        int age = -1;
        try {
            if (age < 0) {
                throw new IllegalArgumentException("Tuổi không âm");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Bắt ngoại lệ: " + e.getMessage());
        }
    }
}
