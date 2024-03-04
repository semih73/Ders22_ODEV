package org.Ders22Odev.Tests;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.Ders22Odev.common.PageManager;
import org.Ders22Odev.common.PageFactory;
import static org.assertj.core.api.Assertions.assertThat;

public class Ders22_Odev1 {
    PageManager pageManager = new PageManager();
    @BeforeMethod
    public void before(){
        pageManager.elementsPage.open();
    }
    @Test
    public void buttonsClick(){
        pageManager.elementsPage.buttonsClick.click();
        pageManager.elementsPage.clickMeClick.click();
        String text=pageManager.elementsPage.clickMeText.getText();
        assertThat(text).isEqualTo("You have done a dynamic click");
    }
}
