import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userDetails implements ActionListener {
    TextField t1, t2, t3, t4;
    CheckboxGroup gender;

    public void gui() {
        Frame f = new Frame("User Details");
        f.setLayout(null);

        Label l1 = new Label("Name");
        l1.setBounds(30, 30, 80, 25);
        f.add(l1);

        t1 = new TextField("Enter your name");
        t1.setBounds(120, 30, 200, 25);
        f.add(t1);

        Label l2 = new Label("Enrollment no.");
        l2.setBounds(30, 60, 80, 25);
        f.add(l2);

        t2 = new TextField("Enter your enroll");
        t2.setBounds(120, 60, 200, 25);
        f.add(t2);

        Label l3 = new Label("Hobbies");
        l3.setBounds(30, 90, 80, 25);
        f.add(l3);

        t3 = new TextField("Enter your hobbies");
        t3.setBounds(120, 90, 200, 25);
        f.add(t3);

        Label l4 = new Label("Address");
        l4.setBounds(30, 120, 80, 25);
        f.add(l4);

        t4 = new TextField("Enter your address");
        t4.setBounds(120, 120, 200, 25);
        f.add(t4);

        Label l5 = new Label("Gender");
        l5.setBounds(30, 150, 80, 25);
        f.add(l5);

        gender = new CheckboxGroup();
        Checkbox ch1 = new Checkbox("Male", gender, false);
        ch1.setBounds(120, 150, 80, 25);
        f.add(ch1);

        Checkbox ch2 = new Checkbox("Female", gender, false);
        ch2.setBounds(210, 150, 80, 25);
        f.add(ch2);

        Button b1 = new Button("Register");
        b1.setBounds(120, 190, 75, 30);
        b1.addActionListener(this);
        f.add(b1);

        Button b2 = new Button("Reset");
        b2.setBounds(200, 190, 75, 30);
        b2.addActionListener(this);
        f.add(b2);

        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        userDetails U1 = new userDetails();
        U1.gui();
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if (command.equals("Register")) {
            Frame f = new Frame("User Details");
            f.setLayout(null);
            TextArea displayArea = new TextArea();
            displayArea.setBounds(30, 30, 300, 200);
            displayArea.setEditable(false);
            f.add(displayArea);
            String multilineText = t1.getText() + "\n" + t2.getText() + "\n" + t3.getText() + "\n" + t4.getText()+"\n"
                    + gender.getSelectedCheckbox().getLabel();
            displayArea.setText(multilineText);
            System.err.println("Register button clicked");
            f.setSize(400, 400);
            f.setVisible(true);
        } else if (command.equals("Reset")) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            gender.setSelectedCheckbox(null);

            System.err.println("Reset button clicked");
        }
    }
}
