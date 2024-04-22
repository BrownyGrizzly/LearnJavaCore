package String;

public class LearnString {
    public static void main(String[] args) {
        String str1 = "Hello"; //Sử dụng literal String
        String str2 = "Hello"; //Sử dụng literal String, cùng trỏ đến vị trí string 1
        String str3 = new String("Hello"); //Sử dụng contructor

        System.out.println("So sánh nội dung" + str1.equals(str2)); // true - So sánh nội dung
        System.out.println("So sánh vị trí, cùng trỏ đến 1 vị trí trong string pool" + str1 == str2); // true - So sánh vị trí, cùng trỏ đến 1 vị trí trong string pool
        System.out.println("So sánh nội dung " + str1.equals(str3)); // true - So sánh nội dung
        System.out.println("So sánh vị trí lưu, str3 là object" + str1 == str3); // false - So sánh vị trí lưu, str3 là object

    }
}
