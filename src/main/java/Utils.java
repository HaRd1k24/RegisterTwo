import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Locale;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$;

public class Utils {

    /**
     * Ожидание
     */
    public static void wait(WebElement webElement) {
        $((webElement)).shouldBe(Condition.enabled, Duration.ofSeconds(30));
    }


    /**
     * Данный метод реализует генерацию ввиде рандомных чисел и букв от a-F до f-F
     */
    public static String generateRqUIDAndDocGuid(int generateData) {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 70; // letter 'z'
        Random random = new Random();
        StringBuilder bl = new StringBuilder();

        bl.append(random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(generateData)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString().toLowerCase(Locale.ROOT));

        return bl.toString();
    }
}
