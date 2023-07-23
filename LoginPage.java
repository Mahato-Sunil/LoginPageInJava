import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();   // creating of the frame
    JLabel heading = new JLabel("Welcome to Appointment Scheduler");    // for heading
    JLabel userIdLabel = new JLabel("Username :-");    // label for user name
    JLabel userPwdLabel = new JLabel("Password :-");    // label for password
    JLabel message = new JLabel();      // label for message
    JTextField userIdInp = new JTextField();     // input area for user name
    JPasswordField userPwdInp = new JPasswordField();   // input field for password
    JButton reset = new JButton("Reset");   // reseet button
    JButton submit = new JButton("Login");  // login button

    // global hash map that is available to all the methods
    HashMap<String, String> login;

    // login page constructor
    LoginPage(HashMap<String, String> logininfoOrg) {
        login = logininfoOrg;   // passing the hashmap to the global variable

        // designing the gui
        heading.setBounds(60, 10, 300, 40);
        heading.setFont(new Font(null, Font.ITALIC, 16));
        heading.setForeground(Color.blue);

        userIdLabel.setBounds(50, 100, 75, 40); // username
        userPwdLabel.setBounds(50, 150, 75, 40);    // password
        message.setBounds(125, 280, 250, 40);   // message

        userIdInp.setBounds(125, 100, 200, 40);
        userPwdInp.setBounds(125, 150, 200, 40);

        reset.setBounds(220, 230, 100, 40);
        reset.setFocusable(false);      // remove the focus / box from text
        reset.addActionListener(this);  // adding action listener

        submit.setBounds(110, 230, 100, 40);
        submit.setFocusable(false);      // remove the focus / box from text
        submit.addActionListener(this);  // adding action listener

        // setting the frame width and height and making it visible
        frame.setVisible(true);
        frame.setSize(420, 420);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adding the componets to the frame
        frame.add(heading);         // heading
        frame.add(userIdLabel);     // username label
        frame.add(userPwdLabel);    // password label
        frame.add(message);         // message label
        frame.add(userIdInp);       // username input area
        frame.add(userPwdInp);      // password input area
        frame.add(reset);           // reset button
        frame.add(submit);          // submit button

        frame.setTitle("Login Page");
    }

    // event handler for login button
    @Override
    public void actionPerformed(ActionEvent e) {
        // reset  button
        if (e.getSource() == reset) {
            userIdInp.setText("");
            userPwdInp.setText("");
        }

        // login button
        if (e.getSource() == submit) {
            String id = userIdInp.getText();
            String password = String.valueOf(userPwdInp.getPassword());
            // validating the password
            if (login.containsKey(id)) {
                if (login.get(id).equals(password)) {
                    message.setForeground(Color.green);
                    // message.setText("Login Successful");
                    frame.setVisible(false);
                    new WelcomePage();
                } else {
                    message.setForeground(Color.red);
                    message.setText("Username or Password Incorrect !");
                }
            } else {
                message.setForeground(Color.red);
                message.setText("Username Not Found  !");
            }
        }
    }
}