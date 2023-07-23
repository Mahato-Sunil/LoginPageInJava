// import hashmap class to use the hash map methods

import java.util.HashMap;

public class LoginInfo {
    // creating a hash map for storing the
    // credentials of the users
    HashMap<String, String> loginDetail = new HashMap<>();

    // create a constructor  to store and pass the users details
    LoginInfo() {
        // enter your username and password here
        // place username in "key"
        // place password in "Value";
        // add the username and password as required

        loginDetail.put("key", "value");
    }

    // getter method to get the login info
    // making the method protected to make password and user name secured
    protected HashMap getLoginInfo() {
        return loginDetail;
    }
}

