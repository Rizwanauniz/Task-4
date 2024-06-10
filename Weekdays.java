import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day position (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        
        try {
            int dayPosition = scanner.nextInt();
           
            System.out.println("The day is: " + weekdays[dayPosition]);
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Invalid day position. Please enter a number between 0 and 6.");
        } catch (Exception e) {
            
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            
            scanner.close();
        }
    }
}