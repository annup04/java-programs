import java.util.Scanner;

class GradeSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        double avg = (m1 + m2 + m3) / 3.0;

        System.out.println("Average = " + avg);

        if (avg > 80)
            System.out.println("Grade: Excellent");
        else if (avg > 60)
            System.out.println("Grade: Good");
        else if (avg >= 35)
            System.out.println("Grade: Pass");
        else
            System.out.println("Grade: Fail");

        sc.close();
    }
}