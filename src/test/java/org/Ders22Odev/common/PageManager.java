package org.Ders22Odev.common;

import org.Ders22Odev.Drivers.DriverFactory;
import org.Ders22Odev.pages.ElementsPage;
import org.Ders22Odev.pages.WebTablesPage;

public class PageManager {
    public WebTablesPage webTablesPage;

    public ElementsPage elementsPage;

    public PageManager() {

        DriverFactory.initDriver();

        webTablesPage = PageFactory.buildWebTablesPage();
        elementsPage = PageFactory.buildElementsPage();

    }
}