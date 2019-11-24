import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olena Orel on 23.11.2019.
 */
public class Model {

    private int secretNumber;

    private int maxBarrier;
    private int minBarrier;

    private List<Integer> inputNumbers = new ArrayList<Integer>();

    public int getSecretNumber() {
        return secretNumber;
    }

    public void setSecretNumber() {
        secretNumber = (int) Math.ceil(Math.random() *
                (maxBarrier - minBarrier - 1) + minBarrier);
    }

    public boolean isSecretNumber(int number) {
        if (secretNumber == number) {
            return true;
        }
        if (number < secretNumber && number > minBarrier) {
            minBarrier = number;
        }
        if (number > secretNumber && number < maxBarrier) {
            maxBarrier = number;
        }
        return false;
    }

    public void setPrimaryBarrier(int minBarrier, int maxBarrier) {
        this.minBarrier = minBarrier;
        this.maxBarrier = maxBarrier;
    }

    public int getMaxBarrier() {
        return maxBarrier;
    }

    public int getMinBarrier() {
        return minBarrier;
    }

    public List<Integer> getInputNumbers() {
        return inputNumbers;
    }
}
