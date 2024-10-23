package testsuites;

import org.junit.Assert;
import org.openqa.selenium.edge.EdgeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;

public class StepDefProductPage {
	
	@Given("lutlisateur est dans la page climatiseurs")
	public void lutlisateur_est_dans_la_page_climatiseurs() {
		
		 Config.driver = new EdgeDriver ();
			
			Config.confEdge();
			
			Config.maximize();
			
			String url = "https://www.samsungtunisie.tn/fr/39-climatiseur-samsung-tunisie" ;
			
			Config.driver.get(url);
	   
	}

	@When("lutilisateur clique sur le nom {string}")
	public void lutilisateur_clique_sur_le_nom(String ProductName) {
		
		ProductPage page = new ProductPage ();
		page.clickOnProductByName(ProductName);
		
	    
	}

	@Then("la page du climatiseur choisi saffiche avec {string}")
	public void la_page_du_climatiseur_choisi_saffiche_avec(String ExpectedTitle) {
		
		ProductPage page = new ProductPage ();
		
		Assert.assertEquals(ExpectedTitle, page.verifTitleProduct()) ;
		
		Config.driver.quit();
	   
	}




}
