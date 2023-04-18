package runtt.runtt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page extends BaseClass {
	public Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement email;

	public WebElement setemail() {
		return email;
	}

	@FindBy(id = "password")
	private WebElement password;

	public WebElement setpassword() {
		return password;
	}

	@FindBy(xpath = "//button[text()='SIGN IN']")
	private WebElement btnsignin;

	public WebElement btnClick() {
		return btnsignin;
	}

	@FindBy(xpath = "//a/span[text()='Master']")
	private WebElement master;

	public WebElement masters() {
		return master;
	}

	@FindBy(xpath = "//a/span[text()='Country Master']")
	private WebElement countrymaster;

	public WebElement country() {
		return countrymaster;
	}

	@FindBy(xpath = "//button[text()='Add Country']")
	private WebElement addCountry;

	public WebElement addCountries() {
		return addCountry;
	}

	@FindBy(xpath = "//div[text()='Add Country']")
	private WebElement heading;

	public WebElement headingmain() {
		return heading;
	}
}
