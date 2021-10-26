package UI.Swing;

import Domain.Payments.CashPayment;
import Domain.Payments.CheckPayment;
import Domain.Payments.CreditPayment;
import Domain.Sales.Product;
import Domain.Sales.Register;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//processSale Frame
public class NewSaleFrame extends javax.swing.JInternalFrame {

    private String payment; //type of payment(credit - cash - check)
    private final GuiListModels<Product> itemmodel = new GuiListModels();//model for JList
    private final Register register;

    public NewSaleFrame(Register register) {
        initComponents();
        this.register = register;
        productlist.setModel(itemmodel);
        this.setLocation(120, 90);
    }

    public void reset() {
        idfield.setText("");
        nbfield.setText("");
        productlist.removeAll();
        itemmodel.removeAll();
        creditbtn.setEnabled(true);
        cashbtn.setEnabled(true);
        checkbtn.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newsalebtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        idfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nbfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addproductbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productlist = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        creditbtn = new javax.swing.JButton();
        checkbtn = new javax.swing.JButton();
        cashbtn = new javax.swing.JButton();
        endbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 243, 242));

        newsalebtn.setText("New Sale");
        newsalebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsalebtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("NEW SALE");

        jLabel2.setText("ID :");

        jLabel3.setText("NB :");

        addproductbtn.setText("Add Product");
        addproductbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addproductbtnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(productlist);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        creditbtn.setText("Credit");
        creditbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditbtnActionPerformed(evt);
            }
        });

        checkbtn.setText("Check");
        checkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbtnActionPerformed(evt);
            }
        });

        cashbtn.setText("Cash");
        cashbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(creditbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(checkbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cashbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creditbtn)
                    .addComponent(checkbtn)
                    .addComponent(cashbtn)))
        );

        endbtn.setBackground(new java.awt.Color(51, 102, 255));
        endbtn.setForeground(new java.awt.Color(255, 255, 255));
        endbtn.setText("End Sale");
        endbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endbtnActionPerformed(evt);
            }
        });

        cancelbtn.setText("Close");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("               List of chosen Products  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 33, Short.MAX_VALUE)
                        .addComponent(endbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nbfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addproductbtn)))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(newsalebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newsalebtn)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nbfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addproductbtn))
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(endbtn)
                .addGap(11, 11, 11)
                .addComponent(cancelbtn)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newsalebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newsalebtnActionPerformed
        reset();
    }//GEN-LAST:event_newsalebtnActionPerformed

    //Ajouter un nouveau product sur la liste des products choisis avec sa quantité
    //En cas d'erreur :message(alert) explique la cause
    private void addproductbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addproductbtnActionPerformed
        String id = idfield.getText();//id du product ajouté
        String nb = nbfield.getText();//la quantité 

        if (id == null || id.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "ID field should not be empty",
                    "Entry Error",
                    JOptionPane.ERROR_MESSAGE);
            idfield.requestFocus();
            return;
        }
        if (nb == null || nb.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "NB field should not be empty",
                    "Entry Error",
                    JOptionPane.ERROR_MESSAGE);
            nbfield.requestFocus();
            return;
        }
        int nb1 = Integer.parseInt(nb);

        Product prod = register.getCatalog().getProduct(Integer.parseInt(id));
        for (int i = 0; i < nb1; i++) {
            itemmodel.add(prod);
        }
        idfield.setText("");
        nbfield.setText("");
    }//GEN-LAST:event_addproductbtnActionPerformed

    //choose the credit Payment 
    private void creditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditbtnActionPerformed
        creditbtn.setEnabled(false);
        cashbtn.setEnabled(false);
        checkbtn.setEnabled(false);
        this.payment = new CreditPayment().proceed();
    }//GEN-LAST:event_creditbtnActionPerformed

    //choose check Payment
    private void checkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbtnActionPerformed
        creditbtn.setEnabled(false);
        cashbtn.setEnabled(false);
        checkbtn.setEnabled(false);
        this.payment = new CheckPayment().proceed();
    }//GEN-LAST:event_checkbtnActionPerformed

    //choose cash Payment
    private void cashbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashbtnActionPerformed
        creditbtn.setEnabled(false);
        cashbtn.setEnabled(false);
        checkbtn.setEnabled(false);
        this.payment = new CashPayment().proceed();
    }//GEN-LAST:event_cashbtnActionPerformed

    
    //Calculate the total amount of the List of chosen Products
    //insert new Sale in SaleDB
    //Display type of Payment
    private void endbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endbtnActionPerformed
        if (itemmodel.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "list of product is empty",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);
            reset();
            return;
        }
        //if we do not specify the type of payment
        if (checkbtn.isEnabled() || creditbtn.isEnabled() || cashbtn.isEnabled()) {
            JOptionPane.showMessageDialog(this,
                    "Choose the type of Payment",
                    "Error!",
                    JOptionPane.ERROR_MESSAGE);

            return;
        }

        List<Product> ls = new ArrayList();
        ls.addAll(itemmodel.getAll());
        register.makeNewSale(ls);
        try {
            register.getStorage().create_sale(register.getSale());//insert this Sale in SaleDB
        } catch (SQLException ex) {
            Logger.getLogger(NewSaleFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Afficher total amount(net+Taxes)
        //Afficher type de paiement
        JOptionPane.showMessageDialog(this,
                "Amount(Total) :" + register.getSale().getPayment().getAmount() + "$" + "\n"
                + "Payment : " + this.payment,
                "Successful Sale",
                JOptionPane.INFORMATION_MESSAGE);
        reset();
    }//GEN-LAST:event_endbtnActionPerformed
    
    //close Frame
    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addproductbtn;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton cashbtn;
    private javax.swing.JButton checkbtn;
    private javax.swing.JButton creditbtn;
    private javax.swing.JButton endbtn;
    private javax.swing.JTextField idfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nbfield;
    private javax.swing.JButton newsalebtn;
    private javax.swing.JList<Product> productlist;
    // End of variables declaration//GEN-END:variables
}
