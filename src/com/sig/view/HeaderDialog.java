
package com.sig.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class HeaderDialog extends JDialog{
    
    
    private JTextField NameF;
    private JTextField DateF;
    private JLabel NameL;
    private JLabel DateL;
    private JButton OK;
    private JButton Cancel;

    public HeaderDialog(InvoiceFrame f) {
        
        NameL = new JLabel("Customer Name:");
        NameF = new JTextField(20);
        DateL = new JLabel("Invoice Date:");
        DateF = new JTextField(20);
        OK = new JButton("OK");
        Cancel = new JButton("Cancel");
        
        
        OK.setActionCommand("OKCreateHeader");
        Cancel.setActionCommand("CancelCreateHeader");
        
         OK.addActionListener(f);
        Cancel.addActionListener(f);
      
        setLayout(new GridLayout(3, 2));
        
        add(DateL);
        add(DateF);
        add(NameL);
        add(NameF);
        add(OK);
        add(Cancel);
        
        pack();
        
        
    }

    public JTextField getNameF() {
        return NameF;
    }

    public JTextField getDateF() {
        return DateF;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
