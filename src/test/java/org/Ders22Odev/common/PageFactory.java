package org.Ders22Odev.common;

import org.Ders22Odev.pages.ElementsPage;
import org.Ders22Odev.pages.WebTablesPage;

public class PageFactory {

    public static WebTablesPage buildWebTablesPage() {

        return new WebTablesPage("/webtables");
    }

    public static ElementsPage buildElementsPage() {
        return new ElementsPage("/elements");
    }
}