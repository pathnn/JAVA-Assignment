package Admin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Admin.ManageAppointments.ManageSchedule;
import Admin.SupplyOfCar.SupplyCars;

public class Admin_main extends JFrame{

    public JPanel Admin_main_Panel;
    private JButton aboutCarButton;
    private JButton manageCarButton;
    private JButton supplyCarButton;
    private JButton exitButton;

    public Admin_main() {
        setContentPane(Admin_main_Panel);
        setVisible(true);
        setSize(450, 300);
        aboutCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin_sub1 com_sub = new Admin_sub1();
            }
        });


        manageCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageSchedule ms = new ManageSchedule();
            }
        });

        supplyCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SupplyCars sv = new SupplyCars();
            }
        });
    }
}
