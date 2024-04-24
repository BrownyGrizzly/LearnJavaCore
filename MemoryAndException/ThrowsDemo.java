package MemoryAndException;

public class ThrowsDemo {
    // Method that throws custom exception
    public static void validateAge(int age) throws CustomException {
        if (age < 0) {
            throw new CustomException("Tuổi không âm.");
        }
    }

    public static void main(String[] args) {
        int age = -1;
        try {
            validateAge(age);
        } catch (CustomException e) {
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}

