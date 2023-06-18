package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import net.serenitybdd.screenplay.Actor;
import starter.helpers.DoActions;
import starter.helpers.NavigateTo;

public class GithubStepDef {
    @Given("{actor} is on github home page")
    public void user_is_on_github_home_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.theGithubPage());
    }
    @And("{actor} search for {string}")
    public void user_search_for(Actor actor, String keyword) {
        actor.attemptsTo(DoActions.search(keyword));
        actor.attemptsTo(DoActions.clickUsersCategoryButton());
    }
    @When("{actor} click user button with username {string} and name {string}")
    public void user_click_user_button(Actor actor, String username, String name){
        actor.attemptsTo(DoActions.clickArinalNameButton(username, name));
    }
    @Then("{actor} see Profile with name {string}")
    public void user_see_profile_with_name(Actor actor, String name){
        actor.wasAbleTo(DoActions.assertProfile(name));
    }

}
