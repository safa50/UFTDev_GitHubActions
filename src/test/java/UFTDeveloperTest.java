import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.*;
import com.hp.lft.sdk.web.Button;
import org.junit.*;
import unittesting.UnitTestClassBase;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;
public class UFTDeveloperTest extends UnitTestClassBase {
    public UFTDeveloperTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new UFTDeveloperTest();
        globalSetup(UFTDeveloperTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {
        Browser browser = BrowserFactory.launch(BrowserType.CHROME);
        browser.navigate("https://advantageonlineshopping.com/#/");

        Link speakersCategoryTxtLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("SPEAKERS")
                .tagName("SPAN").build());
        speakersCategoryTxtLink.click();

        Button buyNowButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("BUY NOW")
                .tagName("BUTTON").build());
        buyNowButton.click();

        Button saveToCartButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("ADD TO CART")
                .tagName("BUTTON").build());
        saveToCartButton.click();

        Link shoppingCartLink = browser.describe(Link.class, new LinkDescription.Builder()
                .accessibilityName("ShoppingCart")
                .innerText("1 ")
                .role("link")
                .tagName("A").build());
        shoppingCartLink.click();

        WebElement rEMOVEWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("REMOVE")
                .tagName("A").build());
        rEMOVEWebElement.click();

        Link dvantageDEMOLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("dvantage DEMO ")
                .tagName("A").build());
        dvantageDEMOLink.click();


        browser.close();
    }
}
