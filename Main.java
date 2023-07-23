public class Main {
    public static void main(String[] args) {
        LoginInfo loginInfo = new LoginInfo();      // instantiating the object for login info
        new LoginPage(loginInfo.getLoginInfo());  // instantiating the login page and passing login infro as constructopr
    }
}