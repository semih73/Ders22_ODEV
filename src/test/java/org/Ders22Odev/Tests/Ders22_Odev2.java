package org.Ders22Odev.Tests;

import com.codeborne.selenide.Condition;
import org.Ders22Odev.common.PageManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class Ders22_Odev2 {
    PageManager pageManager = new PageManager();

    @BeforeSuite
    public void before() {
        pageManager.webTablesPage.openWebTables();
    }

    // add butonuna tıkla ve formu aç
    @Test(priority = 1)
    public void addClick() {
        pageManager.webTablesPage.addButtonClick.click();
        pageManager.webTablesPage.nameDoldur.click();
        pageManager.webTablesPage.nameDoldur.setValue("Semih");
        pageManager.webTablesPage.surNameDoldur.click();
        pageManager.webTablesPage.surNameDoldur.setValue("Dinler");
        pageManager.webTablesPage.emailDoldur.click();
        pageManager.webTablesPage.emailDoldur.setValue("semih.dinler@gmail.com");
        pageManager.webTablesPage.ageDoldur.click();
        pageManager.webTablesPage.ageDoldur.setValue("50");
        pageManager.webTablesPage.salaryDoldur.click();
        pageManager.webTablesPage.salaryDoldur.setValue("0");
        pageManager.webTablesPage.departmentDoldur.click();
        pageManager.webTablesPage.departmentDoldur.setValue("Kalite");
        pageManager.webTablesPage.submitClick.click();
    }

    @Test(priority = 2)
    public void duzenleClick() {

        pageManager.webTablesPage.duzenle.click();
        pageManager.webTablesPage.ageDoldur.click();
        pageManager.webTablesPage.ageDoldur.clear();
        pageManager.webTablesPage.ageDoldur.type("45");
        pageManager.webTablesPage.submitClick.click();
        String ageText = pageManager.webTablesPage.newAge.getText();
        Assertions.assertThat(ageText).isEqualTo("45");

    }

}
