
    import java.util.Random;
import java.util.Scanner;

public class Guessnumber {
     private static final int MIN_RANGE = 1;
     private static final int MAX_RANGE = 100;
     private static final int MAX_ATTEMPTS = 10;
     private static final int MAX_ROUNDS = 3;
    
public static void main(String[] args) {
     Random random = new Random();
     Scanner scanner = new Scanner(System.in);
     int totalscore = 0;

     System.out.println("GUESS THE NUMBER");
     System.out.println("Total Number of Rounds : 3 ");
     System.out.println("Attempt to Guess Number in Each Round : 10");

     for(int i =1 ; i <= MAX_ROUNDS; i++){
         int number = random.nextInt(MAX_RANGE) + MIN_RANGE;
         int attempts = 0;

         System.out.printf("Round %d \n",i);
         System.out.printf("Guess the number between %d and %d in %d attempt.\n",MIN_RANGE,MAX_RANGE,MAX_ATTEMPTS);

         while (attempts < MAX_ATTEMPTS) {
            System.out.println("Enter your guess : ");
            int guess_number = scanner.nextInt();
            attempts = attempts + 1;

           if (guess_number == number) {
            int score = MAX_ATTEMPTS - attempts;
            totalscore = totalscore + score;
            System.out.printf("YOUR NUMBER GUESSED SUCCESSFULLY . ATTEMPS = %d  . ROUND SCOUR = %d\n",attempts, score);
             break;
           }

           else if (guess_number < number) {
            System.out.printf("The number is greater than %d. Attempt Left = %d.\n",guess_number,MAX_ATTEMPTS - attempts);
           }

           else if (guess_number > number) {
            System.out.printf("The number is less than %d. Attempt Left = %d.\n",guess_number,MAX_ATTEMPTS - attempts);
           }
         }

           if (attempts == MAX_ATTEMPTS) {
            System.out.printf("Round : = %d\n",i);
            System.out.println("Attempt = 0");
            System.out.printf("The Random number is : %d\n\n",number);
           }

      }
           System.out.printf("GAME OVER . Total score = %d\n", totalscore);
           scanner.close();
   }
}
    

