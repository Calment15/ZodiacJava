import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Put in your birth year so we can find your zodiac animal");
        int userInput = sc.nextInt();
        String[] zodiacAnimals = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
        int zodiacYear = userInput % 12;
        System.out.println("Since you were born in " + userInput + ", you are a " + zodiacAnimals[zodiacYear] + "!");
        System.out.println("Would you like to try again? Y for yes, N for no");

        String answer = sc.next();

        while (!answer.equalsIgnoreCase("N")){
            System.out.println("Put in your birth year so we can find your zodiac animal");
            int userInput2  = sc.nextInt();
            String[] zodiacAnimals2 = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};
            int zodiacYear2 = userInput2 % 12;
            System.out.println("Since you were born in " + userInput2 + ", you are a " + zodiacAnimals2[zodiacYear2] + "!");
            System.out.println("Would you like to try again? Y for yes, N for no");
            String answer2 = sc.next();
            if (answer2.equalsIgnoreCase("N")){
                break;
            }
        }
    }
}
