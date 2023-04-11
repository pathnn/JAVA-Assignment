package Admin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import Admin.Register.AddPerson;
import Admin.Register.ModifyPerson;
import Admin.Register.SearchPerson;

public class Admin_sub1 extends JFrame{
    private JButton addNewPersonButton;
    private JButton modifyPersonButton;
    private JButton viewAllPeopleButton;


    private JButton searchPersonButton;
    private JPanel Admin_sub_panel;

    public Admin_sub1() {
        setContentPane(Admin_sub_panel);
        setVisible(true);
        setSize(450, 300);
        addNewPersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddPerson ap = new AddPerson();
            }
        });
        modifyPersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModifyPerson mp = new ModifyPerson();
            }
        });
        viewAllPeopleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PersonalForAdmin f1 = new PersonalForAdmin();
                try {
                    f1.ViewPerson();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        searchPersonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchPerson sp = new SearchPerson();
            }
        });
    }


}
