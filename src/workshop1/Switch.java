package workshop1;
import java.util.Random;
import java.io.Console;

public class Switch{
    public static void main(String[] args){

        //Create console object
        Console cons = System.console();

        //Create an instance of random 
        Random random = new Random();
        
    
            int toGuess = random.nextInt(20) + 1;
            String input = cons.readLine("What is you guess? (5 tries)?");
            int myGuess = Integer.parseInt(input);

            int counter = 5;

            // switch(isMyGuess){
            //     case True : 
            //         System.out.printf("Your guess is correct!\n");
            //         break;

            //     default:
            //         System.out.printf("Incorrect. Try again\n");
            // }


    }
}