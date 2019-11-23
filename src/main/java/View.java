public class View {

    public final String START_GAME = "I made up a number.";
    public final String RULE = "You should guess the number. You can input a number from 0 to 100 except 0 and 100.";
    public final String INPUT_NUMBER = "Input number:";
    public final String MORE = "The number is more than your number";
    public final String LESS = "The number is less than your number";
    public final String WRONG_INPUT = "Wrong input! Try one more time. You can input a number from %d to %d.";
    public final String GUESS = "Congratulations! You guessed the number.";


    public void print(String message) {
        System.out.println(message);
    }

    public void printWrongMessage(String message, int maxBarrier, int minBarrier) {
        System.out.printf(message, maxBarrier, minBarrier);
    }

}
