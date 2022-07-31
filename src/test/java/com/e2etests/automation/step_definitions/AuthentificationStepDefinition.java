package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.e2etests.automation.page_objects.AuthenticationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {

	private AuthenticationPage authenticationPage;
	static Logger logger = Logger.getLogger(AuthentificationStepDefinition.class);
	
	public AuthentificationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
		PropertyConfigurator.configure("src/main/java/log4j.properties");
	}

	/*Login*/
	@Given("Je me connecte a l application  OrangeHRM")
	public void jeMeConnecteALApplicationOrangeHRM() {
		authenticationPage.goToURL();
		logger.info("Je me connecte a l application  OrangeHRM");
	}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String username) {
		authenticationPage.fillUsername(username);
		logger.info("Je saisie le username");
	}

	@When("Je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		authenticationPage.fillPassword(password);
		logger.info("Je saisie le mot de passe");
	}

	@When("Je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		authenticationPage.clickOnbtnLogin();
		logger.info("Je clique sur le bouton login");
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String msg) {
		String message = AuthenticationPage.homePage.getText();
		Assert.assertTrue(message.contains(msg));
		logger.info("Je me redirige vers la page home");
	}

	/*Logout*/
	@When("Je clique sur l icone logout")
	public void jeCliqueSurLIconeLogout() {
		authenticationPage.clickOniconLogout();
		logger.info("Je clique sur l icone logout");
	}
	@When("Je clique sur le boutton logout")
	public void jeCliqueSurLeBouttonLogout() throws InterruptedException {
		Thread.sleep(2000);
		authenticationPage.clickOnbtnLogout();
		logger.info("Je clique sur le boutton logout");
	}



}
