/**
 * Created by Olena Orel on 23.11.2019.
 */
public class View {

    public final String START_GAME = "I have chosen a number.";
    public final String RULE = "You should guess the number. You can input a number from 0 to 100 except 0 and 100.";
    public final String INPUT_NUMBER = "Input number:";
    public final String MORE = "Secret number is more than your number.";
    public final String LESS = "Secret number is less than your number.";
    public final String WRONG_INPUT = "Wrong input! Try one more time.";
    public final String RANGE = "You can input a number from %d to %d.%n";
    public final String GUESS = "Congratulations! You guessed secret number = %d.%n";
    public final String YOUR_INPUT = "Your input = ";


    public void print(String message) {
        System.out.println(message);
    }

    public void printRangeMessage(int minBarrier, int maxBarrier) {
        System.out.printf(RANGE, minBarrier, maxBarrier);
    }

    public void printWinMessage(int number) {
        System.out.printf(GUESS, number);
    }

}
