import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestModel {

    private static Model model;

    @BeforeClass
    public static void before() {
        model = new Model();
        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);
    }

    // Test compiled successfully
    @Ignore
    @Test
    public void testSetSecretNumber() {
        for (int i = 0; i < 100000; i++) {
            model.setSecretNumber();
            Assert.assertTrue(model.getSecretNumber() > model.getMinBarrier());
            Assert.assertTrue(model.getSecretNumber() < model.getMaxBarrier());
        }
    }


}
