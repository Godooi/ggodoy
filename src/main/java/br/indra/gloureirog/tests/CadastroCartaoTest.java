package br.indra.gloureirog.tests;

import static br.indra.gloureirog.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import br.indra.gloureirog.core.BasePage;
import br.indra.gloureirog.core.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CadastroCartaoTest {

	BasePage page = new BasePage();
	
	/*---- CT01 ----*/

	@Given("^CT01 - Acceder la Página principal$")
	public void acessarPaginaCadastro() throws Throwable {
		getDriver().get("http://www.bancoripley.com.pe/bancoripley/home/index.html");
	}

	@When("^CT01 - Clicar en la tarjeta$")
	public void clicarTarjeta() throws Throwable {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.mouseHover("//*[@id=\"MMMenu0805194703_0_Item_0\"]");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("^CT01 - Prestamo Efectivo$")
	public void prestamoEfectivo() throws InterruptedException{
		WebElement we = DriverFactory.getDriver().findElement(By.id("m_creditos"));
		WebElement wd = DriverFactory.getDriver().findElement(By.id("MMMenu0805194703_0_Item_0"));

		 String mouseOverScript=
				 "if(document.createEvent){var evObj = document.createEvent('MouseEvents');"
				 +"evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} "
				 +"else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,we);
		 Thread.sleep(1000);
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,wd);
		 Thread.sleep(1000);
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click();",wd);
	}
	
	@When("^CT01 - Consolidacion de Deuda$")
	public void consolidacionDeDeuda() throws InterruptedException{
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.mouseHover("//*[@id=\"MMMenu0805194703_0_Item_1\"]");
		
		WebElement we = DriverFactory.getDriver().findElement(By.id("m_creditos"));
		WebElement wd = DriverFactory.getDriver().findElement(By.id("MMMenu0805194703_0_Item_1"));

		 String mouseOverScript=
				 "if(document.createEvent){var evObj = document.createEvent('MouseEvents');"
				 +"evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} "
				 +"else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,we);
		 Thread.sleep(1000);
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,wd);
		 Thread.sleep(1000);
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click();",wd);
		 
	}
	
	@When("^CT01 - Credito por convenio$")
	public void creditoPorConvenio() throws InterruptedException{
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.mouseHover("//*[@id=\"MMMenu0805194703_0_Item_2\"]");
		
		WebElement we = DriverFactory.getDriver().findElement(By.id("m_creditos"));
		WebElement wd = DriverFactory.getDriver().findElement(By.id("MMMenu0805194703_0_Item_2"));

		 String mouseOverScript=
				 "if(document.createEvent){var evObj = document.createEvent('MouseEvents');"
				 +"evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} "
				 +"else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,we);
		 Thread.sleep(1000);
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,wd);
		 Thread.sleep(1000);
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click();",wd);
		 
	}
	
	@When("^CT01 - Reprogramacion de Deuda$")
	public void reprogramacionDeDeuda() throws InterruptedException{
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.mouseHover("//*[@id=\"MMMenu0805194703_0_Item_3\"]");
		
		WebElement we = DriverFactory.getDriver().findElement(By.id("m_creditos"));
		WebElement wd = DriverFactory.getDriver().findElement(By.id("MMMenu0805194703_0_Item_3"));

		 String mouseOverScript=
				 "if(document.createEvent){var evObj = document.createEvent('MouseEvents');"
				 +"evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} "
				 +"else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,we);
		 Thread.sleep(1000);
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,wd);
		 Thread.sleep(1000);
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click();",wd);
		 
	}

	@When("^CT01 - Prestamos R Cuotas$")
	public void prestamosRCuotas() throws InterruptedException{
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.mouseHover("//*[@id=\"MMMenu0805194703_0_Item_4\"]");
		
		WebElement we = DriverFactory.getDriver().findElement(By.id("m_creditos"));
		WebElement wd = DriverFactory.getDriver().findElement(By.id("MMMenu0805194703_0_Item_4"));

		 String mouseOverScript=
				 "if(document.createEvent){var evObj = document.createEvent('MouseEvents');"
				 +"evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} "
				 +"else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,we);
		 Thread.sleep(1000);
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,wd);
		 Thread.sleep(1000);
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click();",wd);
		 
	}
	
	@When("^CT01 - Pago Antecipado$")
	public void pagoAntecipado() throws InterruptedException{
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page.mouseHover("//*[@id=\"MMMenu0805194703_0_Item_5\"]");
		
		WebElement we = DriverFactory.getDriver().findElement(By.id("m_creditos"));
		WebElement wd = DriverFactory.getDriver().findElement(By.id("MMMenu0805194703_0_Item_5"));

		 String mouseOverScript=
				 "if(document.createEvent){var evObj = document.createEvent('MouseEvents');"
				 +"evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} "
				 +"else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,we);
		 Thread.sleep(1000);
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript(mouseOverScript,wd);
		 Thread.sleep(1000);
		 ((JavascriptExecutor)DriverFactory.getDriver()).executeScript("arguments[0].click();",wd);
		 
	}
	
	@When("^CT01 - Añadir DNI \"(.*?)\" válido$")
	public void inserirDni(String dni) throws Throwable {
		page.escreverWaitId("userDNI", dni);
		
	}

	@When("^CT01 - Añadir Correo \"(.*?)\" válido$")
	public void inserirCorreo(String correo) throws Throwable {
		page.escreverWaitId("userEmail", correo);
	}

	@When("^CT01 - Clic en enviar$")
	public void acessarTelaTipoAutorizacao() throws Throwable {
		page.clicarWaitXpath("//*[@id=\"form1\"]/a");
	}

	/*---- CT001 ----*/
	

}
