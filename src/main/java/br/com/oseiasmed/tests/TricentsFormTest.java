package br.com.oseiasmed.tests;

import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import br.com.oseiasmed.core.BaseTest;
import br.com.oseiasmed.core.DriverFactory;
import br.com.oseiasmed.pages.TricentsFormOnePage;
import br.com.oseiasmed.utils.DataUtils;

public class TricentsFormTest extends BaseTest {

	@Test
	public void realizarCadastro() throws InterruptedException {

		TricentsFormOnePage page = new TricentsFormOnePage();
        DriverFactory.getDriver().get("http://sampleapp.tricentis.com/101/app.php");

		Date dataFutura = DataUtils.obterDataComDiferencaDias(-5);
		Date dataDiferencaMensal = DataUtils.obterDataComDiferencaDias(45);
		Date dataPassada = DataUtils.obterDataComDiferencaAno(-43);

		page.setMake("Porshe");
		page.setModel("Motorcycle");
		page.setCylinderCapacity("1750");
		page.setEnginePerformance("1500");
		page.setDateOfManufacture(DataUtils.obterDataFormatada(dataFutura));
		page.setNumberOfSeats("3");
		page.setRightHandDrive();
		page.setNumberOfSeatsMotorcycle("2");
		page.setFuelType("Gas");
		page.setPayload("800");
		page.setTotalWeight("900");
		page.setListPrice("5000");
		page.setLicensePlateNumber("777");
		page.setAnnualMileage("50000");
		page.nextEnterinsurantDataButton();
		page.setFirstName("Oseias");
		page.setLastName("Medeiros");
		page.setDateOfBirth(DataUtils.obterDataFormatada(dataPassada));
		page.setGender();
		page.setStreetAddress("Rua Gonçalo Coelho");
		page.setCountry("Brazil");
		page.seZipCode("93256067");
		page.setCity("São José dos Pinhais");
		page.setOccupation("Farmer");
		page.setHobbies();
		page.setWebsite("http://accenturebrazil.com");
		//page.uploadPicture();
	    page.nextEnterProductData();
		page.setStartDate(DataUtils.obterDataFormatada(dataDiferencaMensal));
		page.setInsuranceSum("10.000.000,00");
		page.setMeritRating("Bonus 7");
		page.setDamageInsurance("Full Coverage");
		page.setOptionalProducts();
		page.setCourtesyCar("Yes");
		page.nextSelectPriceOption();
		page.setSelectGold();
		page.nextSendQuote();
		page.setEmail("oseiasmedeiros@test.com");
		page.setPhone("5195623124");
		page.setUser("oseiasmed");
		page.setPassword("Accen2021@ture");
		page.setConfirmPassword("Accen2021@ture");
		page.setComments("Hello World!");
		page.prevSelectPriceOption();
		Assert.assertEquals("Sending e-mail success!",page.obterMensagemSucesso());	
	}
}
