package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

public class DoActions {
    public static Performable search(String keyword){
        return Task.where("{0} search with keyword "+keyword,
                Enter.theValue(keyword)
                        .into(GithubPage.SEARCH_FIELD)
                        .thenHit(Keys.RETURN)
        );
    }
    public static Performable clickUsersCategoryButton(){
        return Task.where("{0} click users category button",
                Click.on(GithubPage.USERS_BUTTON)
                );
    }
    public static Performable clickArinalNameButton(String username, String name){
        return Task.where("{0} click Arinal name button",
                Click.on(GithubPage.resultUserList(username, name))
                );
    }
    public static Performable assertProfile(String name){
        return Task.where("{0} assert profile with name",
                Ensure.that(GithubPage.profileName(name)).hasText(name)
                );
    }

}
