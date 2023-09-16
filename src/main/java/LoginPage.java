import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//page_url=github.com/login
public class LoginPage
{

    private final WebDriver driver;

    @FindBy(xpath="//*[@id=\"login_field\"]")
    private WebElement usernameInput;

    @FindBy(xpath="//*[@id=\"password\"]")
    private WebElement passwordInput;

    @FindBy(xpath="//*[@id=\"login\"]/div[4]/form/div/input[13]")
    private WebElement signInButton;

    @FindBy(xpath="//*[@id=\"dialog-show-dialog-b00d6b35-842f-427f-84a9-29d6cae5488d\"]")
    private WebElement avatarButton;

    @FindBy(xpath="//*[@id=\"dialog-b00d6b35-842f-427f-84a9-29d6cae5488d\"]/div[1]/div/div[1]/div/div[2]/div/span/span")
    private WebElement loggedUserName;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void inputUsername(String username)
    {
        usernameInput.sendKeys(username);
    }

    public void inputPassword(String password)
    {
        passwordInput.sendKeys(password);
    }

    public void clickSignInButton()
    {
        signInButton.click();
    }

    public void clickAvatarButton()
    {
        avatarButton.click();
    }

    public String getLoggedUserName()
    {
        return loggedUserName.getText();
    }
}