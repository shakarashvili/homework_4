package Login;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class FirstTest {
    @Test
    public void test(){
        open("https://www.bpn.ge/");
    }
}
