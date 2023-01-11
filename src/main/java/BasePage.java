public class BasePage {
    static private WebDriver driver = new WebDriver(); //NOTE: temporary solution

    public BasePage() {
        System.out.println("BasePage default constructor call");
    }

    static protected WebDriver getDriver() {
        System.out.println("BasePage getDriver constructor call");
        return driver;
    }
}
