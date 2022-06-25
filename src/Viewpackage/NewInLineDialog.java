package Viewpackage;

import Viewpackage.NewJFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewInLineDialog extends JDialog {

    private JTextField itemNameTF;
    private JLabel itemNameL;
    
    private JTextField itemCountTF;
    private JLabel itemCountL;
    
    private JTextField itemPriceTF;
    private JLabel itemPriceL;
    
    private JButton okButton;
    private JButton cancelButton;

    public NewInLineDialog(NewJFrame frame) {
       
        itemNameL = new JLabel("ProductName : ");
        itemNameTF = new JTextField(20);
        
        itemCountL = new JLabel("Amount : ");
        itemCountTF = new JTextField(20);
        
        itemPriceL = new JLabel("ProductPrice : ");
        itemPriceTF = new JTextField(20);
        
        okButton = new JButton("Ok");
        cancelButton = new JButton("Cancel");

        okButton.setActionCommand("createItemOk");
        cancelButton.setActionCommand("createItemCancel");

        okButton.addActionListener(frame);
        cancelButton.addActionListener(frame);

        setLayout(new GridLayout(4, 2));
        setSize(200, 200);
        setLocation(200, 300);

        add(itemNameL);
        add(itemNameTF);
        add(itemCountL);
        add(itemCountTF);
        add(itemPriceL);
        add(itemPriceTF);
        add(okButton);
        add(cancelButton);
        
        pack();

    }

   
    public JTextField getItemNameTF() {
        return itemNameTF;
    }

    public JTextField getItemCountTF() {
        return itemCountTF;
    }

    public JTextField getItemPriceTF() {
        return itemPriceTF;
    }



}
