
import org.testng.annotations.Test;

public class RegistrationTest extends BaseUI {

    @Test
    public void testRegistration() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
    }

}