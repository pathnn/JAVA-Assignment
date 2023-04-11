package Admin.ManageAppointments;

import Admin.ManageSchedules;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class RemoveSchedule extends JFrame {
    private JButton button1;
    private JPanel Remove_Panel;
    private JTextField Mail;

    public RemoveSchedule() {
        setContentPane(Remove_Panel);
        setVisible(true);
        setSize(450, 300);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ManageSchedules f1 = new ManageSchedules();
                    String mail = Mail.getText();
                    f1.RemoveSchedule(mail);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
