package TestCases;


import Session.TestSessionInitiator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginPageTest{

    TestSessionInitiator test;

    @BeforeClass
    public void init(){
        test = new TestSessionInitiator();
    }

    @Test
    public void Step1_Login_into_The_APP(){
        Assert.assertTrue(test.loginpage.enterLoginCredentials(),"This test step is passed");
    }









}
