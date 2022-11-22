
package com.sig.view;

import com.sig.model.InvoiceHeader;
import com.sig.model.InvoiceHeaderTable;
import com.sig.model.InvoiceLine;
import com.sig.model.InvoiceLinesTable;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class InvoiceFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener {

    /**
     * Creates new form InvoiceFrame
     */
    public InvoiceFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        InvoiceHeaderTbl = new javax.swing.JTable();
        InvoiceHeaderTbl.getSelectionModel().addListSelectionListener(this);
        CreateInvoiceBtn = new javax.swing.JButton();
        CreateInvoiceBtn.addActionListener(this);
        DeleteInvoiceBtn = new javax.swing.JButton();
        DeleteInvoiceBtn.addActionListener(this);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        InvNumLbl = new javax.swing.JLabel();
        InvTotalLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InvoiceLineTbl = new javax.swing.JTable();
        CreateLineBtn = new javax.swing.JButton();
        CreateLineBtn.addActionListener(this);
        DeleteLineBtn = new javax.swing.JButton();
        DeleteLineBtn.addActionListener(this);
        CusNameLbl = new javax.swing.JTextField();
        InvDateLbl = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadMenuItem = new javax.swing.JMenuItem();
        LoadMenuItem.addActionListener(this);
        SaveMenuItem = new javax.swing.JMenuItem();
        SaveMenuItem.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InvoiceHeaderTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(InvoiceHeaderTbl);

        CreateInvoiceBtn.setText("Create New Invoice");
        CreateInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateInvoiceBtnActionPerformed(evt);
            }
        });

        DeleteInvoiceBtn.setText("Delete Invoice");
        DeleteInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteInvoiceBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Inovice Number");

        jLabel2.setText("Invoce Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        InvoiceLineTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(InvoiceLineTbl);

        CreateLineBtn.setText("New Line");

        DeleteLineBtn.setText("Delete Line");
        DeleteLineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteLineBtnActionPerformed(evt);
            }
        });

        CusNameLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusNameLblActionPerformed(evt);
            }
        });

        InvDateLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvDateLblActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        LoadMenuItem.setText("Load Files");
        LoadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(LoadMenuItem);

        SaveMenuItem.setText("Save Files");
        jMenu1.add(SaveMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(CreateInvoiceBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteInvoiceBtn)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InvTotalLbl)
                                    .addComponent(InvNumLbl)))
                            .addComponent(CusNameLbl)
                            .addComponent(InvDateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(CreateLineBtn)
                        .addGap(146, 146, 146)
                        .addComponent(DeleteLineBtn)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(InvNumLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(CusNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(InvDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvTotalLbl)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateLineBtn)
                    .addComponent(CreateInvoiceBtn)
                    .addComponent(DeleteInvoiceBtn)
                    .addComponent(DeleteLineBtn))
                .addGap(387, 387, 387))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadMenuItemActionPerformed

    }

    private void CreateInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateInvoiceBtnActionPerformed

    }

    private void DeleteInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteInvoiceBtnActionPerformed

    }

    private void DeleteLineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteLineBtnActionPerformed

    }

    private void CusNameLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusNameLblActionPerformed

    }

    private void InvDateLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvDateLblActionPerformed

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceFrame().setVisible(true);
            }
        });
    }


    private javax.swing.JButton CreateInvoiceBtn;
    private javax.swing.JButton CreateLineBtn;
    private javax.swing.JTextField CusNameLbl;
    private javax.swing.JButton DeleteInvoiceBtn;
    private javax.swing.JButton DeleteLineBtn;
    private javax.swing.JTextField InvDateLbl;
    private javax.swing.JLabel InvNumLbl;
    private javax.swing.JLabel InvTotalLbl;
    private javax.swing.JTable InvoiceHeaderTbl;
    private javax.swing.JTable InvoiceLineTbl;
    private javax.swing.JMenuItem LoadMenuItem;
    private javax.swing.JMenuItem SaveMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;


    private DateFormat DF= new SimpleDateFormat("dd-MM-yyyy");
    private List<InvoiceHeader> InvoiceList = new ArrayList<>();
    private InvoiceHeaderTable headerTable;
    private InvoiceLinesTable linesTable;
    private HeaderDialog hdialog;
    private LineDialog ldialog;
    
    @Override
    public void actionPerformed(ActionEvent e) {

        switch(e.getActionCommand())
        {
            case "Create New Invoice":
                ShowHeaderDialog();
                break;
                    
            case "Delete Invoice":
                DeleteInvoice();
                break;
            case "New Line":
                CreateNewLine();
                break;
            case "Delete Line":
                DeleteLine();
                break;
            case "Save Files":
                 SaveFile();
                 break;
             
            case"Load Files":
                 LoadFile();
                 break;
            
            case "OKCreateHeader" :
                CreateInvoiceOK();
                   break;
                   
            case "CancelCreateHeader":
                CreateInvoiceCancel();
                break;
            
            case "OKCreateLine":
                    CreateLineOK();
                    break;
                    
            case "CancelCreateLine":
                    CreateLineCancel();
                    break;
                
        }

    }
    
    

    
    
       private void SaveFile()
    {
        
         String h = "";
        String l = "";
        for (InvoiceHeader header : InvoiceList) {
            h += header.CSV();
            h += "\n";
            for (InvoiceLine line : header.getLines()) {
                l += line.CSV();
                l += "\n";
            }
        }
        JOptionPane.showMessageDialog(this, "headers file here", "headers file", JOptionPane.WARNING_MESSAGE);
        JFileChooser chooser = new JFileChooser();
        int output = chooser.showSaveDialog(this);
        if (output == JFileChooser.APPROVE_OPTION) {
            File hFile = chooser.getSelectedFile();
            try {
                FileWriter hWriter = new FileWriter(hFile);
                hWriter.write(h);
                hWriter.flush();
                hWriter.close();

                JOptionPane.showMessageDialog(this, "lines file here", "lines file", JOptionPane.WARNING_MESSAGE);
                output = chooser.showSaveDialog(this);
                if (output == JFileChooser.APPROVE_OPTION) {
                    File lFile = chooser.getSelectedFile();
                    FileWriter lWriter = new FileWriter(lFile);
                    lWriter.write(l);
                    lWriter.flush();
                    lWriter.close();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        
        
        
    }
       
       
       
       private void LoadFile()
    {

        JOptionPane.showMessageDialog(this, "header file here","header File",JOptionPane.WARNING_MESSAGE);
         JFileChooser fileCh=new JFileChooser();
         int file=fileCh.showOpenDialog(this);
         if(file==JFileChooser.APPROVE_OPTION){

              File header=fileCh.getSelectedFile();
              FileReader reader;
            try {

                reader = new FileReader(header);
                  BufferedReader buffer=new BufferedReader(reader);
                   String Line=null;
                while((Line=buffer.readLine())!=null)
                {
                   String [] headerSplitted=Line.split(",");
                   int invNum=Integer.parseInt(headerSplitted[0]);
                    Date invdate=DF.parse(headerSplitted[1]);
                   String invName=headerSplitted[2];
                   
                   InvoiceHeader invHeader= new InvoiceHeader(invNum, invName, invdate);
                   InvoiceList.add(invHeader);
                   
                }
          
              

             JOptionPane.showMessageDialog(this, "lines file here","lines File",JOptionPane.WARNING_MESSAGE);
            file= fileCh.showOpenDialog(this);
             if(file==JFileChooser.APPROVE_OPTION)
            { 

              File lines=fileCh.getSelectedFile(); 
              FileReader reader2;

              reader2 =new FileReader(lines);
              BufferedReader buffer2= new BufferedReader(reader2);
              String Lines=null;
              while((Lines=buffer2.readLine()) != null)
              {
                  String [] linesplitted =Lines.split(",");
                  int invNum= Integer.parseInt(linesplitted[0]);
                  String itemName=linesplitted[1];
                  Double itemPrice = Double.parseDouble(linesplitted[2]);
                  int itemCount = Integer.parseInt(linesplitted[3]);
                  InvoiceHeader headerref=InvoiceFinding(invNum);
                  InvoiceLine  invLine= new InvoiceLine(itemName, itemPrice, itemCount, headerref);
                  headerref.getLines().add(invLine);
                  
              }
              
              headerTable = new InvoiceHeaderTable(InvoiceList);
              InvoiceHeaderTbl.setModel(headerTable);
              InvoiceHeaderTbl.validate();
              
            }  
             
         
                
                
            } catch (Exception ex) {ex.printStackTrace();            }
            
            
            Invoices();
            
              

        
         }
        
       
         
    }    
    
    
    
    
    
    
    
      private InvoiceHeader InvoiceFinding(int invNum)
         {
             InvoiceHeader inv=null;
             for(InvoiceHeader in: InvoiceList)
             {
                 if(invNum==in.getNum())
                 {
                     inv=in;
                     break;
                 }
             }
            
             
           return inv;
             
         }

    @Override
    public void valueChanged(ListSelectionEvent e) {

        System.out.println("select");
        
        SelectInvoice();

    }

    private void SelectInvoice() {
      
        
        int selected = InvoiceHeaderTbl.getSelectedRow();
        if (selected >= 0) {
            InvoiceHeader row = headerTable.getInvoiceList().get(selected);
            CusNameLbl.setText(row.getCustomer());
            InvDateLbl.setText(DF.format(row.getInvDate()));
            InvNumLbl.setText("" + row.getNum());
            InvTotalLbl.setText("" + row.getInvoiceTotal());
            ArrayList<InvoiceLine> lines = row.getLines();
            System.out.println("test");
            linesTable = new InvoiceLinesTable(lines);
            InvoiceLineTbl.setModel(linesTable);
            linesTable.fireTableDataChanged();
        
    }
         
    
    
    
    
}

    private void ShowHeaderDialog() {
        
       hdialog = new HeaderDialog(this);
       hdialog.setVisible(true);
       
       

    }

    private void CreateInvoiceOK() {
        
       String Name= hdialog.getNameF().getText();
       String dateString=hdialog.getDateF().getText();
        hdialog.setVisible(false);
        hdialog.dispose();
        hdialog=null;
        System.out.println("create 1");
        System.out.println(dateString);
        try {
            Date date=DF.parse(dateString);
            int number=InvoiceNumber();
            InvoiceHeader header = new InvoiceHeader(number, Name, date);
            InvoiceList.add(header);
            headerTable.fireTableDataChanged();
            System.out.println("create 2");
        } catch (ParseException ex) {}
        
        
        Invoices();
    }

    private void CreateInvoiceCancel() {
        
        hdialog.setVisible(false);
        hdialog.dispose();
        hdialog=null;
        System.out.println("cancel");

    }
    
    private int InvoiceNumber()
    {
      int max=0;
      
      for(InvoiceHeader header: InvoiceList)
      {
          if(header.getNum() > max)
              max=header.getNum();
      } 
      
      return max+1;
    }

    private void CreateNewLine() {
    
        ldialog= new LineDialog(this);
        ldialog.setVisible(true);
    }

    private void CreateLineOK() {
        
        String Name=ldialog.getNameF().getText();
        int count = Integer.parseInt(ldialog.getCountF().getText());
        double price=Double.parseDouble(ldialog.getPriceF().getText());
        
        ldialog.setVisible(false);
        ldialog.dispose();
        ldialog = null;
        
        int currentHeader=InvoiceHeaderTbl.getSelectedRow();
        
        InvoiceHeader invoice =headerTable.getInvoiceList().get(currentHeader);
        InvoiceLine line = new InvoiceLine(Name, price, count, invoice);
        
        invoice.addInvoiceLine(line);
        linesTable.fireTableDataChanged();
        headerTable.fireTableDataChanged();
        InvTotalLbl.setText("" + invoice.getInvoiceTotal());
        
        Invoices();
        
        

    }

    private void CreateLineCancel() {

          
        ldialog.setVisible(false);
        ldialog.dispose();
        ldialog=null;
        System.out.println("cancel");

    }

    private void DeleteLine() {
    

        int index= InvoiceLineTbl.getSelectedRow();
        

        InvoiceLine deletedLine= linesTable.getInvoiceLines().get(index);
        
        linesTable.getInvoiceLines().remove(index);
        linesTable.fireTableDataChanged();
        headerTable.fireTableDataChanged();
        InvTotalLbl.setText("" + deletedLine.getHeader().getInvoiceTotal());
        
        Invoices();
        
        
    }

    private void DeleteInvoice() {
        
        
        int index= InvoiceHeaderTbl.getSelectedRow();
        InvoiceHeader deletedheader= headerTable.getInvoiceList().get(index);
        
        headerTable.getInvoiceList().remove(index);
        headerTable.fireTableDataChanged();
        
        linesTable = new InvoiceLinesTable(new ArrayList<InvoiceLine>());
        InvoiceLineTbl.setModel(linesTable);
        linesTable.fireTableDataChanged();
        
        CusNameLbl.setText("");
        InvDateLbl.setText("");
        InvNumLbl.setText("");
        InvTotalLbl.setText("");
        
        Invoices();
        
        
    
    }
    
    
        private void Invoices() {
       
        for (InvoiceHeader header : InvoiceList) {
            System.out.println(header);
            System.out.println(header.getLines());
        }
        
    }

}