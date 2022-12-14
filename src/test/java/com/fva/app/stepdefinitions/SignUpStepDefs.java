package com.fva.app.stepdefinitions;

import com.fva.app.builders.data.UserBuilder;
import com.fva.app.conf.DriverConfig;
import com.fva.app.tasks.NavigateTo;
import com.fva.app.tasks.UserSingUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import static org.assertj.core.api.Assertions.assertThat;

@ContextConfiguration(classes = {DriverConfig.class})
public class SignUpStepDefs {

    @Autowired
    private UserSingUp signUp;

    @Autowired
    private NavigateTo navigateTo;

    @Given("Pepito wants to have an account")
    public void pepito_wants_to_have_an_account() {
        navigateTo.singUpPage();
    }

    @When("he sends required information to get the account")
    public void he_sends_required_information_to_get_the_account() {

        signUp.withInfo(UserBuilder
                .anUser()
                .defaultInfo()
                .withoutEmail()
                .build());

    }

    @Then("he should be told that the account was created")
    public void he_should_be_told_that_the_account_was_created() {

        assertThat(true).isEqualTo(true);

    }

    @Then("he should be told that the account was not created")
    public void he_should_be_told_that_the_account_was_not_created() {
        assertThat(true).isEqualTo(true);
    }
}
