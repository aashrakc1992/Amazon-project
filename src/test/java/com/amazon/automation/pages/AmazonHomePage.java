package com.amazon.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomePage {

    private WebDriver driver;

    public AmazonHomePage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\smana\\IdeaProjects\\amazon-automation\\src\\test\\java\\libs\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void loadHomePage() throws InterruptedException {
        driver.get("https://www.amazon.com/");
    }

    public void searchBook() {
        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        searchBox.sendKeys("qa testing for beginners");


        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
        searchButton.click();
    }

    public void clickItem() {
        WebElement firstItem = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/h2/a"));
        firstItem.click();
    }

    public String getPriceofItem() {
        WebElement priceOfItem = driver.findElement(By.xpath("//*[@id=\"newBuyBoxPrice\"]"));
        //return Double.parseDouble(priceOfItem.getText());
        return priceOfItem.getText();
    }

    public void addToCart() {
        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
        addToCart.click();
    }

    public String getCartTotalPrice(){
        WebElement priceOfItem = driver.findElement(By.xpath("//*[@id=\"hlb-subcart\"]/div[1]/span/span[2]"));
        //return Double.parseDouble(priceOfItem.getText());
        return priceOfItem.getText();

    }

    public void proceedCheckOut() {
        WebElement checkOutButton = driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]"));
        checkOutButton.click();
    }
}
