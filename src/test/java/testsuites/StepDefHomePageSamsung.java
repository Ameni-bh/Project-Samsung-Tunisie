package testsuites;

import org.junit.Assert;
import org.openqa.selenium.edge.EdgeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageSamsung;

public class StepDefHomePageSamsung {
	
	@Given("lutilisateur est dans la page daccueil")
	public void lutilisateur_est_dans_la_page_daccueil() {
		
        Config.driver = new EdgeDriver ();
		
		Config.confEdge();
		
		Config.maximize();
		
		String url = "https://www.samsungtunisie.tn/" ;
		
		Config.driver.get(url);
	 
	}

	@When("lutilisateur survolle le menu {string} et clique sur le sous menu {string}")
	public void lutilisateur_survolle_le_menu_et_clique_sur_le_sous_menu(String MenuName, String SubMenuName) {
		
		HomePageSamsung page = new HomePageSamsung () ;
		
		page.mouseHooverMenus(MenuName);
		page.clickOnSubMenu(SubMenuName);
	    
	}

	@Then("la page climatiseur saffiche avec son nom {string}")
	public void la_page_climatiseur_saffiche_avec_son_nom(String ExpectedTitle) {
		

Assert.assertTrue(Config.driver.getCurrentUrl().contains(ExpectedTitle.toLowerCase()));

Config.driver.quit();
	    
	}



}
