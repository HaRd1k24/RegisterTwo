import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {


    public static WebElement open() {
        SelenideElement open = $x(("//*[@class='UI-button secondaryButton']"));
        return open;
    }

    public static WebElement register() {
        SelenideElement regis = $x(("//*[text()='Зарегистрироваться']"));
        return regis;
    }

}
