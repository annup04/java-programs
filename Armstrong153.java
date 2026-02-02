public class Armstrong153 {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num;

        while(num != 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if(temp == sum)
            System.out.println("153 is an Armstrong Number");
        else
            System.out.println("153 is not an Armstrong Number");
    }
}