import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.Given;
import packages.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

public class Test {

    @BeforeStories
    public void setUp(){
        ChromeDriverManager.getInstance(CHROME).setup();
        open("https://catalog.onliner.by/");
    }

    @Given("Go to Mobile Phone Page")
    public void goToMobilePhonePage(){
        MainPage.openMobilePage();

    }
}
