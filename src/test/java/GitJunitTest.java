import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class GitJunitTest {

    @BeforeAll
    static void beforeall(){
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x2000";
    }

    @Test
    void test(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-body").$(byText("Soft assertions")).click();
        $(".markdown-body").shouldHave(text("ExtendWith"));

    }

}