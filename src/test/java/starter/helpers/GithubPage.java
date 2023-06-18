package starter.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://github.com/")
public class GithubPage extends PageObject {
    public static Target SEARCH_FIELD = Target.the("search field").locatedBy("//input[@aria-label='Search GitHub']");
    public static Target USERS_BUTTON = Target.the("user button").locatedBy("//a[@class='menu-item']//span[@data-search-type='Users']");
//    public static Target ARINAL_NAME_BUTTON = Target.the("arinal name button").locatedBy("//a[@href='/teukuarinal' and text()='Teuku Arinal']");

    public static Target resultUserList(String username, String name) {
        return Target.the("result username").locatedBy(
          String.format("//a[@href='/%s' and text()='%s']", username, name)
        );
    }

    public static Target profileName(String name) {
        return Target.the("profile name").locatedBy(String.format("//span[@itemprop='name' and contains(text(), '%s')]", name));
    }
}
