package com.bancolombia.utest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/create_account_on_utest.feature",
    glue = "com.bancolombia.utest.stepdefinitions",
    snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CreateAccountOnUtestRunner {}
