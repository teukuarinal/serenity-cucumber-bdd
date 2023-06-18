package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theGithubPage() {
        return Task.where("{0} opens the Github page",
                Open.browserOn().the(GithubPage.class));
    }
}