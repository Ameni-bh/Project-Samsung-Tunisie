package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class HomePageSamsung {
	
	@FindBy (xpath="/html/body/main/header/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/ul/li/a/span")
	List<WebElement> Menus ;
	
	@FindBy (xpath="/html/body/main/header/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/ul/li[4]/ul/li[1]/ul/li/div[1]/div/ul/li/a")
    List<WebElement> SubMenus ;
	
	
	public HomePageSamsung () {
		
		PageFactory.initElements(Config.driver, this);
	}
	
	
	public void mouseHooverMenus (String MenuName) {
		
		try {
		
		for ( WebElement menu : Menus) {
			
			if(menu.getText().contains(MenuName)) {
				
				Config.actions = new Actions (Config.driver);
				Config.actions.moveToElement(menu).perform();
				
			    }	
			
		    }
				
		} catch (Exception e) {
				// TODO: handle exception
		}	
		
	}
				
		
	public void clickOnSubMenu (String SubMenuName) {
				
				try {
				
				for (WebElement submenu : SubMenus) {
					
					if(submenu.getText().contains(SubMenuName)) {
						
						submenu.click();
					}
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
					

}
}
