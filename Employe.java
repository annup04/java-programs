import java.util.Scanner;

class Employee {
    int id;
    String name;
    float salary;

    void input(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextFloat();
    }

    void display() {
        System.out.println("ID: " + id + "  Name: " + name + "  Salary: " + salary);
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[5];

        for (int i = 0; i < 5; i++) {
            emp[i] = new Employee();
            System.out.println("\nEnter details of Employee " + (i + 1));
            emp[i].input(sc);
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < 5; i++) {
            emp[i].display();
        }

        sc.close();
    }
}