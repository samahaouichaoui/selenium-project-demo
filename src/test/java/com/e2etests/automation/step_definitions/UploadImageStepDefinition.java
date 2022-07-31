package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.UploadImagePage;

import io.cucumber.java.en.When;

public class UploadImageStepDefinition {
	
private UploadImagePage uploadImagePage;
public UploadImageStepDefinition() {
	this.uploadImagePage = new UploadImagePage();
}
	@When("Je clique sur l icone Upload Images")
	public void jeCliqueSurLIconeUploadImages() {
		uploadImagePage.clickOnbtnUploadimages();
	}


	@When("Je clique sur le bouton Upload Images {string}")
	public void jeCliqueSurLeBoutonUploadImages(String msg) throws InterruptedException {
		Thread.sleep(3000);
		uploadImagePage.uploadImage(msg);
	}






}
