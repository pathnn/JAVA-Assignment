package Admin.Register;

import Admin.PersonalForAdmin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ModifyPerson extends JFrame{
    private JTextField mail;
    private JButton button1;

    private JPanel Modify_Panel;
    private JTextField MailAddress;
    private JTextField Password;
    private JTextField Name;

    public ModifyPerson() {
        setContentPane(Modify_Panel);
        setVisible(true);
        setSize(450, 300);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    PersonalForAdmin f1 = new PersonalForAdmin();
                    String Mail = MailAddress.getText();
                    String changeMail = mail.getText();
                    String changePw = Password.getText();
                    String changeName = Name.getText();
                    f1.ModifyPerson(Mail, changeMail, changePw, changeName);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

    }
}
