package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmGuessingGame {
    public static void main(String[] args) {

        List<String> movies =new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIANIST", "GREENMILE", "LEON",
                "GODFATHER", "JURASSICPARK", "TITANIC"));

        Scanner sc = new Scanner(System.in);

        //1. Ask the user to select a movie from the list by entering an index (Kullanıcıya film listesinden bir film seçtir)
        System.out.println("Please enter a number between 0 and " + (movies.size() - 1) + " to select a movie:");
        int movieIndex = sc.nextInt();

        // 2. Get the selected movie (Filmi al)
        String selectedMovie = movies.get(movieIndex).toUpperCase();
        int movieLetterCount = selectedMovie.length();

        // 3. Allow the user to have twice the number of letters in the movie as guesses (Tahmin hakkı filmin harf sayısının iki katı)
        int guessLimit = movieLetterCount * 2;

        // Notify the user about the letter count and their guess limit (Kullanıcıya filmi bildirmeden, kaç harf olduğunu söyle)
        System.out.println("The movie you selected has " + movieLetterCount + " letters");
        System.out.println("You have " + guessLimit + " guesses.");

        // Initializing the state of guessed letters (Tahmin edilen harfler için başlangıç durumu)
        char[] guessedState = new char[movieLetterCount];
        Arrays.fill(guessedState, '_');
        int correctGuesses = 0;
        int incorrectGuesses = 0;

        // 4. Guessing loop (Tahmin döngüsü)
        while (guessLimit > 0 && correctGuesses < movieLetterCount) {
            System.out.println("Current guessed state: " + String.valueOf(guessedState));
            System.out.println("Guess a letter: ");
            char guess = sc.next().toUpperCase().charAt(0);

            boolean isCorrect = false;
            for (int i = 0; i < selectedMovie.length(); i++) {
                if (selectedMovie.charAt(i) == guess && guessedState[i] == '_') {
                    guessedState[i] = guess;
                    correctGuesses++;
                    isCorrect = true;
                }
            }
            if (isCorrect){
                System.out.println("Correct guess.");
            }else {
                System.out.println("Incorrect guess!");
                incorrectGuesses++;
            }

            guessLimit--;
            System.out.println("Remaining guesses: " + guessLimit);
            System.out.println("Correct guesses: " + correctGuesses + ", Incorrect guesses: " + incorrectGuesses);
        }

        // 5. Game result (Oyun sonucu)
        if (correctGuesses == movieLetterCount) {
            System.out.println("Congratulations... You guessed the movie correctly: " + selectedMovie);
        }else {
            System.out.println("Sorry, you've run out of guesses. The movie you needed to guess was: " + selectedMovie);
        }
        sc.close();
    }
}
