package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class ProductPage {
	
	@FindBy (xpath="/html/body/main/section/div[4]/div/div/div[2]/section/section/div[2]/div/div/div[1]/div/div/div/article/div/div[2]/div[1]/h3/a")
	List<WebElement> Products;
	
	@FindBy (tagName="h1")
	WebElement TitleProduct;
	
	public ProductPage() {
		
		PageFactory.initElements(Config.driver, this);
	}
	
	
	public void clickOnProductByName (String NameProduct) {
		
		try {
		
		for (WebElement product : Products) {
			
			if(product.getText().contains(NameProduct)) {
				
				product.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	

	public String verifTitleProduct() {
		
		String ActualTitle = TitleProduct.getText();
		
		return ActualTitle ;
		
	}

}
