class Student {
    int rollno;
    String name;
    double marks;

    // Constructor
    Student(int r, String n, double m) {
        rollno = r;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class Demo {
    public static void main(String args[]) {
        Student s1 = new Student(101, "Annu", 89.5);
        s1.display();
    }
}