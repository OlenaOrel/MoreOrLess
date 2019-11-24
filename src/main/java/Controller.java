import java.util.Scanner;

/**
 * Created by Olena Orel on 23.11.2019.
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void process() {
        Scanner sc = new Scanner(System.in);
        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER,
                GlobalConstants.PRIMARY_MAX_BARRIER);
        model.setSecretNumber();
        view.print(view.START_GAME);
        view.print(view.RULE);
        inputNumberWithScanner(sc);
    }

    private void inputNumberWithScanner(Scanner sc) {
        boolean isNumberGuess = false;
        while (!isNumberGuess) {
            int number = sc.nextInt();
            checkInputNumber(number);
            isNumberGuess = model.isSecretNumber(number);
            if (isNumberGuess) {
                view.printWinMessage(number);
                model.getInputNumbers().add(number);
                view.print(view.YOUR_INPUT + model.getInputNumbers().toString());
                break;
            }
            view.printRangeMessage(model.getMinBarrier(), model.getMaxBarrier());
            view.print(view.INPUT_NUMBER);
        }
    }

    // is value in correct range
    private void checkInputNumber(int number) {
        if (number <= model.getMinBarrier() || number >= model.getMaxBarrier()) {
            view.print(view.WRONG_INPUT);
        }
        if (number > model.getSecretNumber() && number < model.getMaxBarrier()) {
            model.getInputNumbers().add(number);
            view.print(view.LESS);
        }
        if (number < model.getSecretNumber() && number > model.getMinBarrier()) {
            model.getInputNumbers().add(number);
            view.print(view.MORE);
        }
    }
}
