package Admin.SupplyOfCar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Admin.*;


public class SupplyCars extends JFrame{
    private JPanel Manage_Schedule_Panel;
    private JButton modifyCarButton;
    private JButton searchCarButton;
    private JPanel Supply_Car_Panel;
    private JButton addCarSuplyButton;
    private JButton removeCarSuplyButton;
    private JButton viewAllButton;


    public SupplyCars() {
        setContentPane(Supply_Car_Panel);
        setVisible(true);
        setSize(450, 300);
        addCarSuplyButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                AddCar av = new AddCar();

            }
        });
        removeCarSuplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RemoveCar rv = new RemoveCar();
            }
        });
        modifyCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModifyCar mv = new ModifyCar();
            }
        });
        searchCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { SearchCar sv = new SearchCar();
            }
        });
        viewAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SupplyCar sv = new SupplyCar();
                sv.View();
            }
        });
    }
}
