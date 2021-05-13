package Test;

import AdminPages.LoginPageObjects;
import AdminPages.TestBase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(TestNGListeners.class)
public class LifeHopeAdminRegression extends TestBase {

    @Test
    public void Login() throws IOException {
        LoginPageObjects logObj = new LoginPageObjects(driver);

        logObj.verifyHomepageTitle();
        logObj.verifyLoginUI("Together we all serve by faith, hope and\n" + "love but the greatest of these is love...", "Login", "Email", "Password", "Login");
        logObj.setLoginCredentials(dataList.get(2), dataList.get(3));
    }

}