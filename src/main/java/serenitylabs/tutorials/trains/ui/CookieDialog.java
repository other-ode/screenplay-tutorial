package serenitylabs.tutorials.trains.ui;

import net.serenitybdd.core.annotations.findby.*;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class CookieDialog extends PageObject {
    public static final By ACCEPT_ALL_COOKIES= By.linkText("Accept all cookies");
    public static final By DONE = By.linkText("Done");
}
