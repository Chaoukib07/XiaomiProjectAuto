package TestSuite;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.HomePage;
import Page.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class HomePageStepDef {
	@Given("L'utilisateur est sur la home page")
	public void l_utilisateur_est_sur_la_home_page() throws Exception {
		Config.confchrome();
		Config.driver = new ChromeDriver();
		Config.maximizeWindow();
		String url = "https://mistore.com.tn/";
		Config.driver.get(url);
		
		
		
	
	}

	@When("L'utilisateur survole le menu {string} et puis clique sur le sousmenu {string}")
	public void l_utilisateur_survole_le_menu_et_puis_clique_sur_le_sousmenu(String menu, String submenu) throws Exception {
		HomePage page = new HomePage();
		page.selectMenu(menu);
		HomePage pageH = new HomePage();
		page.clickOnSubMenu(submenu);
		 Thread.sleep(5000);
		
	  
	}

	@Then("La page d sousmenu s'affiche et contient le nom {string}")
	public void la_page_d_sousmenu_s_affiche_et_contient_le_nom(String productName) {
		ProductPage productPage = new ProductPage();
		// Thread.sleep(9000);
		// productPage.closePopup();
		String actualMessage = productPage.verification();
		Assert.assertEquals(null, productName, actualMessage);
		
	   
	}
	@Given("L'utilisateur clique sur le produit {string}")
	public void l_utilisateur_clique_sur_le_produit(String productName) throws Exception {
		ProductPage productPage = new ProductPage();
		productPage.clickOnProduct(productName);
		Thread.sleep(7000);
	   
	}

	@Given("L'utilisateur est rederigé vers la page qui contient le nom du produit\"<productName>\"")
	public void l_utilisateur_est_rederigé_vers_la_page_qui_contient_le_nom_du_produit_product_name(String ExpectedMessage, String expectedProductName) throws Exception  {
		ProductPage productPage = new ProductPage();
		// Thread.sleep(8000);
		// productPage.closePopup();
		String actualMessage = productPage.cartPageVerification();
		String actualProductName = productPage.productNameVerfifcation();
		Assert.assertEquals(ExpectedMessage, actualMessage);
		Assert.assertEquals(expectedProductName, actualProductName);
	
	}

	@When("L'utilisateur ajoute le produit au panier")
	public void l_utilisateur_ajoute_le_produit_au_panier() {
		ProductPage productPage = new ProductPage();
		productPage.clickOnAddToCart();

	}

	@When("clique sur le panier")
	public void clique_sur_le_panier() {
		ProductPage productPage = new ProductPage();
		productPage.clickOnCartBtn();
	    
	}

	@When("clique sur le bouton voir panier")
	public void clique_sur_le_bouton_voir_panier() {
		ProductPage productPage = new ProductPage();
		productPage.clickOnShowCart();
	   
	}

	@Then("L'utilisateur est derigé vers la page qui contient et le message {string} et  le nom du produit {string}")
	public void l_utilisateur_est_derigé_vers_la_page_qui_contient_et_le_message_et_le_nom_du_produit(String ExpectedMessage) throws Exception  {
		ProductPage productPage = new ProductPage();
		// Thread.sleep(8000);
		// productPage.closePopup();
		String actualMessage = productPage.productVerification();
		Assert.assertEquals(ExpectedMessage, actualMessage);
		
	   
	}




}
