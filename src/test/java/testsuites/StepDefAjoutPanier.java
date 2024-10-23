package testsuites;

import org.junit.Assert;
import org.openqa.selenium.edge.EdgeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AjoutPanier;

public class StepDefAjoutPanier {
	
	
	
	@Given("lutilisateur est dans la page dun produit choisi")
	public void lutilisateur_est_dans_la_page_dun_produit_choisi() {
		
		 Config.driver = new EdgeDriver ();
			
			Config.confEdge();
			
			Config.maximize();
			
			String url = "https://www.samsungtunisie.tn/fr/climatiseur-samsung-tunisie/773-1352-climatiseur-samsung-12000-btu-chaud-froid-prix-tunisie.html#/8-couleur-blanc" ;
			
			Config.driver.get(url);
	    
	}

	@When("lutilisateur clique sur le bouton Acheter puis sur le bouton CONTINUER MES ACHATS")
	public void lutilisateur_clique_sur_le_bouton_acheter_puis_sur_le_bouton_continuer_mes_achats() {
		AjoutPanier panier = new AjoutPanier ();
	
		panier.commandProduct();
	
	}

		
		@Then("Le produit est ajoute dans le panier avec son {string}")
		public void le_produit_est_ajoute_dans_le_panier_avec_son(String ExpectedTitle) {
			
			
			AjoutPanier panier = new AjoutPanier ();
			Assert.assertEquals(ExpectedTitle, panier.verifAjoutProduct());
			
			Config.driver.quit();
		   
		}
	}



