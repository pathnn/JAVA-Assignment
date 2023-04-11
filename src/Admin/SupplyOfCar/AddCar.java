package Admin.SupplyOfCar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Admin.SupplyCar;

public class AddCar extends JFrame{
    private JButton button1;
    private JPanel Add_Venue_Panel;
    private JTextField EnterName;
    private JTextField EnterDate;
    private JTextField EnterNumber;

    public AddCar() {
        setContentPane(Add_Venue_Panel);
        setVisible(true);
        setSize(450, 300);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SupplyCar supplyVaccines = new SupplyCar();
                String venueName = EnterName.getText();
                String date = EnterDate.getText();
                String numOfTaken = EnterNumber.getText();
                supplyVaccines.Add(venueName, date, numOfTaken);
            }
        });
    }
}
