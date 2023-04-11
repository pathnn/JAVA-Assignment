package Admin.ManageAppointments;

import Admin.ManageSchedules;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ModifySchedule extends JFrame{
    private JTextField mail;
    private JButton button1;
    private JTextField Date;
    private JPanel Modify_Panel;

    public ModifySchedule() {
        setContentPane(Modify_Panel);
        setVisible(true);
        setSize(450, 300);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String Mail = mail.getText();
                    String date = Date.getText();
                    ManageSchedules f1 = new ManageSchedules();
                    f1.ModifySchedule(Mail, date);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
