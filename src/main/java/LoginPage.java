import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

public static WebElement sendEmail(String email){
    SelenideElement sendEmail = $x("//*[@name='email']").setValue(email);
    return sendEmail;
}

    public static SelenideElement sendPassword(String pass){
        SelenideElement sendPass = $x("//*[@name='password']").setValue(pass);
        return sendPass;
    }

    public static SelenideElement sendAcceptPassword(String pass){
        SelenideElement sendPass = $x("//*[@name='compare-password']").setValue(pass);
        return sendPass;
    }

    public static SelenideElement acceptRegister(){
        SelenideElement sendAccept = $x("//*[text()='Зарегистрироваться']");
        return sendAccept;
    }


    public static SelenideElement accept() {
        SelenideElement accept = $x("//*[text()='Личный кабинет']");
        return accept;
    }
}
