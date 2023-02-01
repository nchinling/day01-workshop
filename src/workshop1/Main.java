package workshop1;
import java.util.Random;
import java.io.Console;

public class Main{
    public static void main(String[] args){

        //Create console object
        Console cons = System.console();

        //Create an instance of random 
        Random random = new Random();
        
        
        // for (int i=0; i<25; i++){

            int toGuess = random.nextInt(20) + 1;
            // String input = cons.readLine("What is you guess? (5 tries)?");
            // int myGuess = Integer.parseInt(input);
            
            int counter = 3;
            boolean win = false;

            System.out.printf("Number is %d\n", toGuess);
        
            while(counter > 0 && !win){

                String input = cons.readLine("What is your guess? (%d tries)\n", counter);
                int myGuess = Integer.parseInt(input);

            if (myGuess > toGuess){
                System.out.printf("Lower ^^\n");
            } else if (myGuess < toGuess) {
                System.out.printf("Higher ^^\n"); 
            } else {
                System.out.printf("You win!\n"); 
                win = true;
            }

            counter--;
        }

        if (!win){
        System.out.printf("You lose\n");
        }
    }
    

}



    
            // while(counter != 0){
            // String input = cons.readLine("What is your guess? (%d tries)\n", counter);
            // int myGuess = Integer.parseInt(input);
            // if (myGuess == toGuess){
            //     System.out.printf("Your guess is correct!\n");
            //     break;
            // } else{
            //     if (counter == 1){
            //         System.out.printf("Incorrect. Game over.\n");
            //         break;
            //     }
            //     System.out.printf("Incorrect try again\n");
            //     counter--;
            
            // }