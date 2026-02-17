class CommandLineDemo {
    public static void main(String args[]) {
        if (args.length > 0) {
            System.out.println("Entered value is: " + args[0]);
        } else {
            System.out.println("No command line argument provided.");
        }
    }
}