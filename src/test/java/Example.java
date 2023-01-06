import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class Example {

    private final String mail = Utils.generateRqUIDAndDocGuid(10) +"@mail.ru";
    private final String pass = "Ascz13210009";
    private static final String url = "https://bitokk.biz/exchange/SBERRUB/BTC/MSK";


    @BeforeClass
    public static void startUp() {

        open(url);
    }


    @Test
    public  void successRegister() {
        Utils.wait(MainPage.open());
        MainPage.open().click();
        Utils.wait(MainPage.register());
        MainPage.register().click();

        Utils.wait(LoginPage.sendEmail(""));
        LoginPage.sendEmail(mail);

        Utils.wait(LoginPage.sendPassword(""));
        LoginPage.sendPassword(pass);

        Utils.wait(LoginPage.sendAcceptPassword(""));
        LoginPage.sendAcceptPassword(pass);

        Utils.wait(LoginPage.acceptRegister());
        LoginPage.acceptRegister().click();

        Utils.wait(LoginPage.accept());
    }

}
