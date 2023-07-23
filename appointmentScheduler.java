import javax.swing.*;

// class for user registration
class Registration {
    public static void Register() {
        // creation of the frame object
        JFrame frame = new JFrame();

        // creation of panel object
        JPanel panel = new JPanel();

        // heading
        JLabel heading = new JLabel("Welcome to the Appointment Schedule Management System ");
        heading.setBounds(450, 50, 550, 60);
        heading.setSize(550, 100);

        // heading 2
        JLabel heading2 = new JLabel("Please Fill out the details to get yourself registered  ");
        heading2.setBounds(350, 100, 550, 60);
        heading2.setSize(550, 100);

        // field for taking the user input and information
        //first name label
        JLabel fname = new JLabel("First Name :- ");
        fname.setBounds(150, 180, 150, 60);
        JTextField fnameInp = new JTextField();         // text field for fname
        fnameInp.setBounds(230, 180, 280, 45);

        // label for lname
        JLabel lname = new JLabel("Last Name :- ");
        lname.setBounds(540, 180, 150, 60);
        JTextField lnameInp = new JTextField();         // text field for lname
        lnameInp.setBounds(640, 180, 280, 45);

        // label for contact number
        JLabel contact = new JLabel("Contact No.:- ");
        contact.setBounds(150, 230, 150, 60);
        JTextField contactInp = new JTextField();           // text field for contact number
        contactInp.setBounds(230, 230, 280, 45);

        // label for address
        JLabel address = new JLabel("Address: ");
        address.setBounds(540, 230, 150, 60);
        JTextField addInp = new JTextField();               // text field for address
        addInp.setBounds(640, 230, 150, 45);

        // label for website
        JLabel website = new JLabel("WebSite : ");
        website.setBounds(150, 280, 150, 60);
        JTextField webInp = new JTextField();          // text field for website
        webInp.setBounds(230, 280, 300, 45);

        // label for email
        JLabel email = new JLabel("Email ID:- ");
        email.setBounds(540, 280, 150, 60);
        JTextField emailInp = new JTextField();          // text field for email
        emailInp.setBounds(640, 280, 300, 45);

        // label for blood group
        JLabel blood = new JLabel("Blood Group :- ");
        blood.setBounds(150, 330, 150, 60);
        JTextField bloodInp = new JTextField();     // text field for blood group
        bloodInp.setBounds(240, 330, 200, 45);

        // label for the educational status
        JLabel edu = new JLabel("Educational Status [ Tick all that is applicable]");
        edu.setBounds(540, 320, 250, 60);
        // create objects for checkbox
        JCheckBox box1 = new JCheckBox("SEE");
        JCheckBox box2 = new JCheckBox("+2");
        JCheckBox box3 = new JCheckBox("Bachelor");
        JCheckBox box4 = new JCheckBox("Master");
        JCheckBox box5 = new JCheckBox("Diploma");

        // initializing the panel object
        panel.setBounds(530, 360, 400, 40);

        // add check box to panel
        panel.add(box1);
        panel.add(box2);
        panel.add(box3);
        panel.add(box4);
        panel.add(box5);

        // adding horizontal line
        JTextField line = new JTextField();
        line.setBounds(20, 405, 1000, 5);

        // label for heading 3
        JLabel heading3 = new JLabel("---------------------------------------------Official Information-----------------------------------------------");
        heading3.setBounds(350, 410, 500, 50);

        // label for company name
        JLabel comName = new JLabel("Company Name : ");
        comName.setBounds(150, 450, 150, 50);
        JTextField nameInp = new JTextField();  // text field for company name
        nameInp.setBounds(270, 450, 280, 45);

        // label for company address
        JLabel comAdd = new JLabel("Company Address : ");
        comAdd.setBounds(150, 500, 150, 50);
        JTextField comAddInp = new JTextField();  // text field for company address
        comAddInp.setBounds(270, 500, 280, 45);

        // label for company contact number
        JLabel comNum = new JLabel("Office Number : ");
        comNum.setBounds(570, 450, 150, 50);
        JTextField comNumInp = new JTextField();  // text field for company number
        comNumInp.setBounds(685, 450, 280, 45);

        // label for company email address
        JLabel comEmail = new JLabel("Company Email Id : ");
        comEmail.setBounds(570, 500, 150, 50);
        JTextField comEmailInp = new JTextField();  // text field for company email
        comEmailInp.setBounds(685, 500, 280, 45);

        // label for request date of appointment
        JLabel date = new JLabel("Requested Date of Appointment : ");
        date.setBounds(150, 550, 200, 50);
        JTextField dateInp = new JTextField();  // text field fordate
        dateInp.setBounds(340, 550, 200, 45);

        // label for request time of appointment
        JLabel time = new JLabel("Requested time of Appointment : ");
        time.setBounds(150, 600, 200, 50);
        JTextField timeInp = new JTextField();  // text field for company name
        timeInp.setBounds(340, 600, 200, 45);

        // label for text area remarks
        JLabel remarks = new JLabel("Remarks: [ Reason for your Visit: ]");
        remarks.setBounds(570, 540, 200, 50);
        JTextArea remarksInp = new JTextArea();     // area for writing the remarks
        remarksInp.setBounds(570, 580, 400, 100);

        // adding horizontal line
        JTextField line1 = new JTextField();
        line1.setBounds(20, 690, 1000, 5);

        //  buttons
        JButton cancel = new JButton("Reset");     // creating the reset button object
        cancel.setBounds(320, 700, 200, 50);
        cancel.setFocusable(false);      // remove the focus / box from text

        JButton register = new JButton("Submit");     // creating the Submit button object
        register.setBounds(550, 700, 200, 50);

        // setting the frame width and height and making it visible
        frame.setVisible(true);
        frame.setSize(1080, 800);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adding the components to the frame
        frame.add(heading);
        frame.add(heading2);
        frame.add(fname);
        frame.add(fnameInp);
        frame.add(lname);
        frame.add(lnameInp);
        frame.add(contact);
        frame.add(contactInp);
        frame.add(address);
        frame.add(addInp);
        frame.add(website);
        frame.add(webInp);
        frame.add(email);
        frame.add(emailInp);
        frame.add(blood);
        frame.add(bloodInp);
        frame.add(edu);
        frame.add(panel);       // add checkbos panel
        frame.add(line);        // horizontal line
        frame.add(heading3);
        frame.add(comName);
        frame.add(nameInp);
        frame.add(comNum);
        frame.add(comNumInp);
        frame.add(comAdd);
        frame.add(comAddInp);
        frame.add(comEmail);
        frame.add(comEmailInp);
        frame.add(comEmailInp);
        frame.add(line1);
        frame.add(date);
        frame.add(dateInp);
        frame.add(time);
        frame.add(timeInp);
        frame.add(cancel);
        frame.add(register);
        frame.add(remarks);
        frame.add(remarksInp);
    }
}

public class appointmentScheduler {
    appointmentScheduler() {
        Registration.Register();
    }
}