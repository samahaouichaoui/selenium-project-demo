package com.e2etests.automation.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class UploadImagePage {

	/* @FindBy WebElement */
	@FindBy(how = How.ID, using = "images-tab-label")
	public static WebElement iconUploadImages;
	
	@FindBy(how = How.ID, using = "image-upload-button")
	public static WebElement btnUploadImages;
	
	@FindBy(how = How.ID, using = "imageUploadBtn")
	public static WebElement btnPost;
	
	public UploadImagePage() {
		PageFactory.initElements(Setup.driver, this);

	}
	public void clickOnbtnUploadimages() {
		iconUploadImages.click();
	}
	public void clickOnUploadImages() {
		btnUploadImages.click();
	}
	public void uploadImage(String msg) {
		
		btnUploadImages.sendKeys(msg);
	}
	
}
