import java.util.Scanner;

class FoodMenu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. North Indian");
        System.out.println("2. South Indian");
        System.out.println("3. Chinese");
        System.out.println("4. Japanese");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected North Indian Food");
                break;
            case 2:
                System.out.println("You selected South Indian Food");
                break;
            case 3:
                System.out.println("You selected Chinese Food");
                break;
            case 4:
                System.out.println("You selected Japanese Food");
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}