package team8_testngproject.tests.us20;

import org.testng.Assert;
import org.testng.annotations.Test;
import team8_testngproject.pages.*;
import team8_testngproject.utilities.ConfigReader;
import team8_testngproject.utilities.Driver;
import team8_testngproject.utilities.ReusableMethods;

public class TC02 { // Description alanına metin girilebilmeli (PASS)
    @Test
    public void tc01(){
        P01_HomePage homePage = new P01_HomePage();
        P03_LoginPage loginPage = new P03_LoginPage();
        P04_MyAccountPage myAccountPage = new P04_MyAccountPage();
        P16_VendorStoreManagerPage vendorStoreManagerPage = new P16_VendorStoreManagerPage();
        P20_VendorCouponsPage vendorCouponsPage = new P20_VendorCouponsPage();

        Driver.getDriver().get(ConfigReader.getProperty("URL"));
        homePage.signInGur.click();
        loginPage.userNameGur.sendKeys(ConfigReader.getProperty("usernameGur"));
        loginPage.passwordGur.sendKeys(ConfigReader.getProperty("passwordGur"));
        loginPage.signInButtonGur.click();

        homePage.signOutGur.click();
        myAccountPage.storeManagerGur.click();
        ReusableMethods.hover(vendorStoreManagerPage.couponsButtonGur);
        vendorStoreManagerPage.couponsAddNewButtonGur.click();

        String descriptionData = "Bu kupon size özeldir.";
        vendorCouponsPage.descriptionBoxGur.sendKeys(descriptionData);

        Assert.assertEquals(vendorCouponsPage.descriptionBoxGur.getAttribute("value"), descriptionData);
        Driver.closeDriver();
    }
}
