public class ArrayExamples3 {

    public static void main(String[] args) {
        // Check if exactly two arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers as command line arguments.");
            return;
        }

        try {
            // Parse command line arguments as integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Add the two numbers
            int sum = num1 + num2;

            // Print the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Please make sure both arguments are valid integers.");
        }
    }
}


