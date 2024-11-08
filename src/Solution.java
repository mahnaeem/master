import java.util.Scanner;  // Importing the Scanner class

class Solution {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            
            // Reading an integer input from the user
            int n = in.nextInt();
            in.close();
            
            // Convert the integer 'n' to its string representation using Integer.toString(n)
            String s = Integer.toString(n);
            
            // Check if the string representation matches the original integer when parsed back to an integer
            if (n == Integer.parseInt(s)) {
                
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
            
        } catch (Exception e) {
            // Handle any exceptions here
            System.out.println("An error occurred.");
        }
    }
}
