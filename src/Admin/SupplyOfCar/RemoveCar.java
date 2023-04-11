package Admin.SupplyOfCar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Admin.SupplyCar;

public class RemoveCar extends JFrame{
    private JTextField enterName;
    private JTextField enterDate;

    private JButton button1;
    private JPanel Remove_Car_Panel;

    public RemoveCar() {
        setContentPane(Remove_Car_Panel);
        setVisible(true);
        setSize(450, 300);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = enterName.getText();
                String date = enterDate.getText();
                SupplyCar supplyCar = new SupplyCar();
                supplyCar.Remove(name, date);
            }
        });
    }
}
