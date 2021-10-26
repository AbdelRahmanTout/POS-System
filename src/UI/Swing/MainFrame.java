package UI.Swing;

import Domain.Sales.Store;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;


//Desktop pane contient les 2 Frame :NewSaleFrame - ProductFrame
public class MainFrame extends javax.swing.JFrame {

    private final NewSaleFrame newsaleframe = new NewSaleFrame(Store.instance.getRegister());
    private final ProductFrame productframe = new ProductFrame(Store.instance.getRegister());

    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        desk.add(newsaleframe);
        desk.add(productframe);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desk = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        salebtn = new javax.swing.JButton();
        productbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desk.setBackground(new java.awt.Color(255, 255, 255));

        salebtn.setText("New Sale");
        salebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salebtnActionPerformed(evt);
            }
        });

        productbtn.setText("Products");
        productbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(salebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 425, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(salebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(productbtn))
        );

        desk.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(620, 620, 620))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desk)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Open NewSaleFrame
    private void salebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salebtnActionPerformed
        if (newsaleframe.isVisible()) {
            desk.moveToFront(newsaleframe);
            try {
                newsaleframe.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            return;
        }
        newsaleframe.setVisible(true);
        newsaleframe.reset();

    }//GEN-LAST:event_salebtnActionPerformed

    //Open ProductFrame
    private void productbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productbtnActionPerformed
        if (productframe.isVisible()) {
            desk.moveToFront(productframe);
            try {
                productframe.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            return;
        }
        productframe.setVisible(true);

    }//GEN-LAST:event_productbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton productbtn;
    private javax.swing.JButton salebtn;
    // End of variables declaration//GEN-END:variables

}
