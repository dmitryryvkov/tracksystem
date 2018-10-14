package packages.pages;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public static void openMobilePage(){
        $(byClassName("catalog-bar__item")).$(byXpath("li[1]/a")).click();
    }
}
