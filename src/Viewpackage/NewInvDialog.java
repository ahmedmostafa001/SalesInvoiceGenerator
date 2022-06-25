package Viewpackage;

import Viewpackage.NewJFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewInvDialog extends JDialog {

    private JTextField customerNameField;
    private JTextField inDateF;
    private JLabel customerNameL;
    private JLabel invDateL;
    private JButton okButton;
    private JButton canselButton;

    public NewInvDialog(NewJFrame frame) {
        customerNameL = new JLabel("Customer Name : ");
        customerNameField = new JTextField(20);
        invDateL = new JLabel("Date : ");
        inDateF = new JTextField(20);
        okButton = new JButton("Ok");
        canselButton = new JButton("Cancel");

        okButton.setActionCommand("createOk");
        canselButton.setActionCommand("createCancel");

        okButton.addActionListener(frame);
        canselButton.addActionListener(frame);

        setLayout(new GridLayout(3, 2));
        setSize(100, 100);
        setLocation(200, 300);

        add(customerNameL);
        add(customerNameField);
        add(invDateL);
        add(inDateF);
        add(okButton);
        add(canselButton);
        
        pack();

    }

    public JTextField getCustomerNameField() {
        return customerNameField;
    }

    public JTextField getInDateF() {
        return inDateF;
    }

}
