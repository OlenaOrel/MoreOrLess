/**
 * Created by Olena Orel on 23.11.2019.
 */
public class Model {

    private int secretNumber;

    private int maxBarrier;
    private int minBarrier;

    public int getSecretNumber() {
        return secretNumber;
    }

    public void setSecretNumber() {
        secretNumber = (int) Math.ceil(Math.random() *
                (maxBarrier - minBarrier - 1) + minBarrier);
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


}
