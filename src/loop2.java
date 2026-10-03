import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int guesses = 0;
        while (true) {
            System.out.println("Guess my name (type stop to exit)");
            String name = in.nextLine();
            if (name.equals("stop")) {
                break;
            }
            guesses++;
            if (name.equals("Emma")) {
                System.out.println("Congratulation!");
                break;
            }

        }
        System.out.println("You guessed " + guesses + " times.");
        in.close();
    }
}
// Create a guessing game.

// First the app asks the user to guess a name. If the guess of the user is
// correct, print “Congratulation!” and exit the loop. If the answer is
// incorrect, the app asks again. The user can stop guessing by typing "stop".
// Lastly, print how many times the user guessed.

// Important - the right answer is Emma.

// The output in the console should be if the guesses were Olivia, Ava and Emma:

// Guess my name (type stop to exit)
// Olivia
// Guess my name (type stop to exit)
// Ava
// Guess my name (type stop to exit)
// Emma
// Congratulations!
// You guessed 3 times.
// Tip! At first create the game so that is just asks the question once. After
// that, try to make the loop structure. Should you use for, while or do-while?
