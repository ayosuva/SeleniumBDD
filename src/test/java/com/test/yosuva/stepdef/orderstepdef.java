package com.test.yosuva.stepdef;

import com.test.yosuva.Util.DriverManager;
import com.test.yosuva.pages.SignInPage;
import com.test.yosuva.pages.TshirtPage;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class orderstepdef {

    DriverManager context;
    TshirtPage tshirtPage;
    SignInPage signInPage;

    public orderstepdef(DriverManager context){
        this.context = context;

    }

    @Given("I am on homepage")
    public void iAmOnHomepage() {
        context.getDriver().get("http://automationpractice.com/");
        tshirtPage = new TshirtPage(context);
        signInPage = new SignInPage(context);
    }

    @When("I order a tshirt")
    public void iOrderATshirt() {
        tshirtPage.tshirtTab().click();
        tshirtPage.HoverOnProductImage();
        tshirtPage.addToCart().click();
        for(int i = 0; i < 3;i++){
            tshirtPage.proceedToCheckout().click();
        }
        tshirtPage.agreeTermsAndCondition().click();
        tshirtPage.proceedToCheckout().click();
        tshirtPage.payByCheck().click();
        tshirtPage.confirmOrder().click();
        tshirtPage.backToOrder().click();
    }

    @Then("I should see my order in order history")
    public void iShouldSeeMyOrderInOrderHistory() {
        Assert.assertTrue(tshirtPage.orders().size() > 0);
    }

    @When("I sign in with(.*) (.*)$")
    public void iSignIn(String username,String password) {
        signInPage.signInLink().click();
        signInPage.username().sendKeys(username);
        signInPage.password().sendKeys(password);
        signInPage.signIn().click();
    }

    @And("I update my personal information")
    public void iUpdateMyPersonalInformation() {
        signInPage.personalInfo().click();
        signInPage.personalInfoTab().click();
        signInPage.firstName().clear();
        signInPage.firstName().sendKeys("testuser changed");
        signInPage.currentPassword().sendKeys("qualitest");
        signInPage.newPassword().sendKeys("qualitest");
        signInPage.confirmPassword().sendKeys("qualitest");
        signInPage.save().click();
    }

    @Then("my personal information is saved")
    public void myPersonalInformationIsSaved() throws InterruptedException {
        System.out.println("+=+++++++++++++"+signInPage.personalInfo().getText());
        for(int i = 0; i < 5; i++) {
            if(signInPage.personalInfo().getText().contains("Changed")){
                Assert.assertTrue(true);
            }else{
                Thread.sleep(1000);
            }
        }
        Assert.assertTrue(signInPage.personalInfo().getText().contains("Changed"));
    }

    @After
    public void closeDriver(){
        context.getDriver().quit();
    }
}
