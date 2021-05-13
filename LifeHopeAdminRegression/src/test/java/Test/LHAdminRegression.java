package Test;

import AdminPages.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

//@Listeners(TestNGListeners.class)
public class LHAdminRegression extends TestBase {

//    @Test (dataProvider = "getData")
//    public void Login_Validation(String userName, String passWord) throws IOException {
//        LoginPageObjects logObj = new LoginPageObjects(driver);
//
//        logObj.setLoginCredentials(userName, passWord);
//    }

    @Test
    public void Login() throws IOException {
        LoginPageObjects logObj = new LoginPageObjects(driver);

        logObj.verifyHomepageTitle();
        logObj.verifyLoginUI("Together we all serve by faith, hope and\n" + "love but the greatest of these is love...", "Login", "Email", "Password", "Login");
        logObj.setLoginCredentials(dataList.get(16), dataList.get(17));
    }
}
