package Admin.Register;


import Admin.PersonalForAdmin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SearchPerson extends JFrame{
    private JTextField mail;
    private JButton button1;
    private JPanel Search_Panel;

    public SearchPerson() {
        setContentPane(Search_Panel);
        setVisible(true);
        setSize(450, 300);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String Mail = mail.getText();
                    PersonalForAdmin f1 = new PersonalForAdmin();
                    f1.SearchPerson(Mail);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
