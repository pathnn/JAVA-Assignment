package Admin.Register;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import Admin.Admin;
import Admin.PersonalForAdmin;

public class AddPerson extends JFrame{

    private JTextField name;
    private JButton button1;
    private JPanel Add_Panel;
    private JTextField MailAddress;
    private JTextField Password;

    public AddPerson() {
        setContentPane(Add_Panel);
        setVisible(true);
        setSize(450, 300);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    PersonalForAdmin f1 = new PersonalForAdmin();
                    String MailAdd = MailAddress.getText();
                    String Pass = Password.getText();
                    String Name = name.getText();
                    Admin comObj = new Admin(MailAdd, Pass, Name, "No");
                    f1.RegisterPerson(comObj);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
}
