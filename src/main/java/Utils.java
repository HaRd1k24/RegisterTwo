import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class Utils {

   public static void wait(WebElement webElement) {
        $((webElement)).shouldBe(Condition.enabled,Duration.ofSeconds(30));

    }
}
