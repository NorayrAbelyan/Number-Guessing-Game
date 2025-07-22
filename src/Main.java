import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        Random random = new Random();
        int chances=0;
        int randomNumber= random.nextInt(100)+1;
        int attempts=0;

        System.out.println("******************");
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("******************");

        System.out.println("""
                Please select the difficulty level:
                1.Easy(10 chances)
                2.Medium(5 chances)
                3.Hard(3 chances)
                """);

        System.out.print("Enter your choice: ");
        int choice= scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 1-> {chances=10;
                      System.out.println("You have selected the Easy level.");
                      System.out.println("Let's start");}
            case 2-> {chances=5;
                      System.out.println("You have selected the Medium level.");
                      System.out.println("Let's start");}
            case 3-> {chances=3;
                      System.out.println("You have selected the Hard level.");
                      System.out.println("Let's start");}
            default -> {
                System.out.println("Select 1,2 or 3");
                System.exit(0);
            }

        }

        while (attempts<chances){
            System.out.print("Enter your guess: ");
            int guess=scanner.nextInt();
            scanner.nextLine();
            attempts++;

            if(guess>randomNumber){
                System.out.println("Incorrect! The number is less than "+guess);
            } else if (guess<randomNumber) {
                System.out.println("Incorrect! The number is greater than "+guess);
            }else {
                System.out.println("******************");
                System.out.println("You Win!🎉🎉🎉   You used "+ attempts + " attempts.");
                System.out.println("******************");
                break;
            }
        }

        if(attempts>=chances){
            System.out.println("Sorry! You have used all your attempts");
            System.out.println("The number was: "+randomNumber);
        }

        scanner.close();

    }

}
