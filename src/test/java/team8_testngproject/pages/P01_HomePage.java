package team8_testngproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team8_testngproject.utilities.Driver;

public class P01_HomePage {
    public P01_HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }








    // 20.Satır --> Ali





























    // 50.Satır --> Esra
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signIn_Es;
    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement signOut_Es;

























    // 80.Satır --> Gonca





























    // 110.Satır --> Gürkay





























    // 140.Satır --> Hüseyin





























    // 170.Satır --> Mehmet





























    // 200.Satır --> Meryem





























    // 230.Satır --> Zeliha





























    // 260.Satır --> Nurullah





























    // 290.Satır --> Ramazan





























    // 320.Satır --> Sevda





























    // 350.Satır --> Mustafa





























}
