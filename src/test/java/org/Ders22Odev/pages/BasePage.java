package org.Ders22Odev.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.Ders22Odev.utils.PropertyManager;

public abstract class BasePage {

    protected String pageUrl;
    PropertyManager propertyManager = new PropertyManager();

    public BasePage(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void open() {
        String url;
        url = propertyManager.getProperty("APP_URL");
        Selenide.open(url);
    }

    public void openWebTables() {
        String url;
        url = propertyManager.getProperty("APP_URL2");
        Selenide.open(url);
    }

    public String getUrl() {
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }

}
