package view.panels;

import controller.RegistrationController;
import employee.Employee;
import register_entry.RegisterEntry;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class RegistrationButtonPanel extends JPanel {

    private JButton checkIn;
    private JButton checkOut;
    private RegistrationController controller;

    private Employee employee;

    public RegistrationButtonPanel(RegistrationController controller)
    {
        this.controller = controller;
        JLabel label = new JLabel("Registration buttons");
        this.checkIn = new JButton("Check In");
        this.checkOut = new JButton("Check Out");

        addCheckInButtonActionListener();
        addCheckOutButtonActionListener();

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.add(label);
        this.add(this.checkIn);
        this.add(this.checkOut);
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void addCheckInButtonActionListener() {
        this.checkIn.addActionListener((ActionEvent e) -> {
            // Assuming 'employee' instance available
            controller.checkIn(employee);
        });
    }

    public void addCheckOutButtonActionListener() {
        this.checkOut.addActionListener((ActionEvent e) -> {
            // Assuming 'employee' instance available
            controller.checkOut(employee);
        });
    }
}
