package ait.qa49;

import org.testng.annotations.Test;

public class LoginTests extends TestBase{
  @Test
  public void loginPositiveTest(){
      clickOnLoginButton();
      LoginAndPassword();
      ClickLogIn();
  }
}
