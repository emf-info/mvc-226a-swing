package ihm;

import ctrl.ICtrlIhm;
import javax.swing.UIManager;

public class Ihm extends javax.swing.JFrame implements IIhmCtrl {

    public Ihm() {
        refCtrl = null;

        // Dire à Java de faire ressembler cette application à celles de 
        // la plateforme sur laquelle il tourne.
        try {
            UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
        }
        catch ( Exception e ) {
        }

        initComponents();
        setResizable( false );
        setLocationRelativeTo( null );
        setTitle( "MVC-226a en Swing" );
        setDefaultCloseOperation( javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE );
        setLocationByPlatform( true );
    }

    @Override
    public void start() {
        setVisible( true );
    }

    @Override
    public void affiche( String message ) {
        jLabelMessage.setText( message );
    }

    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonFermer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonFermer.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButtonFermer.setText("Fermer");
        jButtonFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFermerActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setText("Message");

        jLabelMessage.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMessage.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabelMessage.setText("Bonjour comment ça va ?");
        jLabelMessage.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelMessage.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonFermer))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonFermer)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFermerActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonFermerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFermer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelMessage;
    // End of variables declaration//GEN-END:variables

    public ICtrlIhm getRefCtrl() {
        return refCtrl;
    }

    public void setRefCtrl( ICtrlIhm refCtrl ) {
        this.refCtrl = refCtrl;
    }

    private ICtrlIhm refCtrl;
}
