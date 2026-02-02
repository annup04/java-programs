public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20, temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Without 3rd variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Without 3rd Variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}