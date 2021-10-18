package br.com.oseiasmed.pages;

import org.openqa.selenium.By;

import br.com.oseiasmed.core.BasePage;

public class TricentsFormOnePage extends BasePage {
	
	public void setMake(String id) {
		selecionarCombo("make", id);
	}

	public void setModel(String id) {
		selecionarCombo("model", id);
	}

	public void setCylinderCapacity(String id) {
		escrever("cylindercapacity", id);
	}

	public void setEnginePerformance(String id) {
		escrever("engineperformance", id);
	}

	public void setDateOfManufacture(String id) {
		escrever("dateofmanufacture", id);
	}

	public void setNumberOfSeats(String id) {
		selecionarCombo("numberofseats", id);
	}

	public void setRightHandDrive() {
		clicarRadio(By.xpath("//label[normalize-space()='Yes']//span[@class='ideal-radio']"));
	}

	public void setNumberOfSeatsMotorcycle(String id) {
		selecionarCombo("numberofseatsmotorcycle", id);
	}

	public void setFuelType(String id) {
		selecionarCombo("fuel", id);
	}

	public void setPayload(String id) {
		escrever("payload", id);
	}

	public void setTotalWeight(String id) {
		escrever("totalweight", id);
	}

	public void setListPrice(String id) {
		escrever("listprice", id);
	}

	public void setLicensePlateNumber(String id) {
		escrever("licenseplatenumber", id);
	}

	public void setAnnualMileage(String id) {
		escrever("annualmileage", id);
	}

	public void nextEnterinsurantDataButton() {
		clicarBotao("nextenterinsurantdata");
	}

	public void setFirstName(String id) {
		selecionarCombo("firstname", id);
	}

    public void setLastName(String id) {
		selecionarCombo("lastname", id);
	}

	public void setDateOfBirth(String id) {
		escrever("birthdate", id);
	}

	public void setGender() {
		clicarRadio(By.xpath("//label[normalize-space()='Male']"));
	}

	public void setStreetAddress(String id) {
		escrever("streetaddress", id);
	}

	public void setCountry(String id) {
		selecionarCombo("country", id);
	}

	public void seZipCode(String id) {
		escrever("zipcode", id);
	}

	public void setCity(String id) {
		escrever("city", id);
	}

	public void setOccupation(String id) {
		selecionarCombo("occupation", id);
	}

	public void setHobbies() {
		clicarRadio(By.xpath("//label[normalize-space()='Speeding']"));
	}

	public void setWebsite(String id) {
		escrever("website", id);
	}

	/*
	 * public void uploadPicture() { WebElement fileInput =
	 * driver.findElement(By.id("open"));
	 * fileInput.sendKeys("C:\\Users\\oseiasmed\\Desktop\\test.txt"); }
	 */

	public void nextEnterProductData() {
		clicarBotao("nextenterproductdata");
	}

	public void setStartDate(String id) {
		escrever("startdate", id);
	}

	public void setInsuranceSum(String id) {
		selecionarCombo("insurancesum", id);
	}

	public void setMeritRating(String id) {
		selecionarCombo("meritrating", id);
	}

	public void setDamageInsurance(String id) {
		selecionarCombo("damageinsurance", id);
	}

	public void setOptionalProducts() {
		clicarRadio(By.xpath("//label[normalize-space()='Euro Protection']"));
	}

	public void setCourtesyCar(String id) {
		selecionarCombo("courtesycar", id);
	}

	public void nextSelectPriceOption() {
		clicarBotao("nextselectpriceoption");
	}

	public void setSelectGold() {

		clicarRadio(By.xpath("//label[@class='choosePrice ideal-radiocheck-label']/self::label"));
	}

	public void nextSendQuote() throws InterruptedException {
		Thread.sleep(5000);
		clicarBotao(By.id("nextsendquote"));
	}

	public void setEmail(String id) {
		escrever("email", id);
	}

	public void setPhone(String id) {
		escrever("phone", id);
	}

	public void setUser(String id) {
		escrever("username", id);
	}

	public void setPassword(String id) {
		escrever("password", id);
	}

	public void setConfirmPassword(String id) {
		escrever("confirmpassword", id);
	}

	public void setComments(String id) {
		escrever("Comments", id);
	}

	public void prevSelectPriceOption() {
		clicarBotao("sendemail");
	}

	public String obterMensagemSucesso() throws InterruptedException {
		Thread.sleep(10000);
		return obterTexto(By.xpath("//h2[normalize-space()='Sending e-mail success!']"));
	}
}
