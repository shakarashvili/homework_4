import chromrunner.Chrome;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Exercises_5 extends Chrome {
    @Test
    public void firsttest(){


   $(byName ("travpr")).click();
    }
}
