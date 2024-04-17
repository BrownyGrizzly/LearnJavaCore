public class PrimitiveAndObject {
    public static void main(String[] args) {
        //Giá trị khởi tạo của primitive data type là 0
        //Giá trị khởi tạo của object data type là null
        //Primitive data type có tính tham trị
        int a = 10;
        int b = a;
        System.out.println("Giá trị ban đầu của a = " + a + ", giá trị ban đầu của b = " + b);
        b = b + 10;
        System.out.println("Giá trị sau của a = " + a + ", giá trị sau của b = " + b);
        //Object data type có tính tham chiếu
        TestObject testObject1 = new TestObject("Đây là 1");
        TestObject testObject2 = testObject1;
        System.out.println("testObject1 là: " + testObject1.getDescription() +", testObject2 là: " + testObject2.getDescription());
        testObject2.setDescription("Đây là 2");
        System.out.println("Sau đó testObject1 là: " + testObject1.getDescription() +", testObject2 là: " + testObject2.getDescription());
        // Primitive data types
        int primitiveInt = 10;
        double primitiveDouble = 3.14;
        boolean primitiveBoolean = true;
        char primitiveChar = 'A';

        // Chuyển đổi kiểu dữ liệu primitive sang object sử dụng wrapped
        Integer wrappedInt = Integer.valueOf(primitiveInt);
        Double wrappedDouble = Double.valueOf(primitiveDouble);
        Boolean wrappedBoolean = Boolean.valueOf(primitiveBoolean);
        Character wrappedChar = Character.valueOf(primitiveChar);

        // In ra giá trị mới
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Wrapped Boolean: " + wrappedBoolean);
        System.out.println("Wrapped Character: " + wrappedChar);

        // Chuyển đổi giá trị object về primitive data type
        int backToInt = wrappedInt.intValue();
        double backToDouble = wrappedDouble.doubleValue();
        boolean backToBoolean = wrappedBoolean.booleanValue();
        char backToChar = wrappedChar.charValue();

        // In ra giá trị sau khi chuyển về
        System.out.println("Trở về int: " + backToInt);
        System.out.println("Trở về double: " + backToDouble);
        System.out.println("Trở về boolean: " + backToBoolean);
        System.out.println("Trở về char: " + backToChar);
        // Primitive data types
        int primitiveInt1 = 10;
        int primitiveInt2 = 10;

        // Wrapper classes
        Integer objectInt1 = Integer.valueOf(10);
        Integer objectInt2 = Integer.valueOf(10);

        // Sử dụng toán tử == cho kiểu dữ liệu primitive
        System.out.println("Sử dụng toán tử == cho kiểu dữ liệu primitive:");
        System.out.println("primitiveInt1 == primitiveInt2: " + (primitiveInt1 == primitiveInt2));

        // Sử dụng toán tử == cho tham chiếu object
        System.out.println("\nSử dụng toán tử == cho tham chiếu object:");
        System.out.println("objectInt1 == objectInt2: " + (objectInt1 == objectInt2)); // So sánh tham chiếu

        // Sử dụng method equals() cho giá trị object
        System.out.println("\nSử dụng method equals() cho giá trị object:");
        System.out.println("objectInt1.equals(objectInt2): " + objectInt1.equals(objectInt2)); // So sánh giá trị
    }
}
class TestObject {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TestObject(String description) {
        this.description = description;
    }
}
