package pages;

import java.time.Duration;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Config;

public class AjoutPanier {
	
	
	@FindBy (xpath="/html/body/main/section/div/div/div/div/section/div/div[2]/div[3]/form/div[3]/div[1]/div[2]/button")
	WebElement BtnAcheter ;
	

	@FindBy(css="button.btn.btn-secondary[data-dismiss='modal']")
	WebElement BtnContinuerMesAchats ;
	
	@FindBy(id="cart-block")
	WebElement BtnPanier ;
	
	@FindBy (xpath="/html/body/main/section/div/div/div/div/section/div/div[1]/div/div[2]/ul/li/div/div[2]/div[1]/a")
	WebElement TitleProduct ;
	
	public AjoutPanier () {
		
		PageFactory.initElements(Config.driver, this);
	}
	
	
	public void commandProduct () {
		
		Config.attente(10);
		
		BtnAcheter.click();
		
		WebDriverWait wait=new WebDriverWait(Config.driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(BtnContinuerMesAchats));                                                                                                               
						
		BtnContinuerMesAchats.click();
		
		Config.attente(10);
		
		BtnPanier.click();
				
			
	}
	
	public String verifAjoutProduct () {
	
		String ActualTitle = TitleProduct.getText();
		
		return ActualTitle ;
	}

}
