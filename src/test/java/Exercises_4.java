

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.swing.*;
import java.awt.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class Exercises_4 {
    @Test
    public void alo(){
        SoftAssert soft = new SoftAssert();
//        open ( "https://amindi.ge/ka/");
       open("https://www.bpn.ge/");
        $ (byAttribute("class ", "sign-in")).click();
        $ (byName("email")).click();
        String mail = "shaqarashvili25@mail.com";
        SelenideElement namevalue = $ (byName("email"));
        namevalue.setValue(mail);
        SelenideElement pas = $ (byName("password"));
        String asd = "123123123";
        pas.click();
        pas.setValue(asd);
        SelenideElement pasrep = $ (byName("password_repeat"));
        pasrep.click();
        pasrep.setValue(asd);
        soft.assertTrue(pas.is(Condition.visible));
        soft.assertTrue(pasrep.is(Condition.visible));
        soft.assertEquals(asd , asd);
        soft.assertEquals("12345",asd);

        soft.assertAll();

//        $ (by("title", "რეგისტრაცია")).click();
//        $ (byXpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/span/form/button")).pressEnter().click();
//        $(byXpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/form/div[1]/span/input")).click();
//        $(byXpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/form/div[1]/span/input")).
//                setValue("shaqarashvili25@gmail.com");
//        $(byXpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/form/div[2]/span/input")).click();
//        $(byXpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/form/div[2]/span/input")).setValue("123123123");
//        $(byXpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/form/button")).click();
////        $ (byClassName("auth__plugin"),1 ).click();
////        $ (byClassName("auth__plugin"),1 ).click();
//        $ (by("title", "დაგავიწყდა პაროლი?")).click();
//        $(by("rules","required|email")).click();
//        $(by("rules","required|email")).setValue("shaqarashvili25@gmail.com").pressEnter();
//        $(by("title","გაგზავნა"),1).pressEscape().click();
        sleep(30000);


    }
}
