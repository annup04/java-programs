public class Palindrome353 {
    public static void main(String[] args) {
        int num = 353, rev = 0, temp = num;

        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if(temp == rev)
            System.out.println("353 is a Palindrome");
        else
            System.out.println("353 is not a Palindrome");
    }
}