package programodpytanie.paneledycji;

import programodpytanie.Edycja;
import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JRadioButton;
import programodpytanie.ListaKomponentowDoAktywacji;
import programodpytanie.ObslugaOkienka;
import programodpytanie.ObslugaPliku;
import programodpytanie.paneledycji.panelelisty.*;

public class PanelLista extends javax.swing.JPanel {

    public static final String NAZWA_KLASY = "PanelLista";
    
    private PanelListaUsun pListaUsun;
    
    private Edycja edycja;
    
    private CardLayout cl, 
                       pOpcjiCL;
    
    public PanelLista(Edycja edycja) {
	this.edycja = edycja;
	this.cl = edycja.getCardLayout();
	initComponents();
	myOptions();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gGrupaOpcji = new javax.swing.ButtonGroup();
        gWroc = new GuzikCofnij(edycja);
        pWyboruEdycji = new javax.swing.JPanel();
        eKtoraOpcja = new javax.swing.JLabel();
        rbUsun = new javax.swing.JRadioButton();
        rbDodaj = new javax.swing.JRadioButton();
        pOperacji = new javax.swing.JPanel();

        gWroc.setText("Wróć");

        eKtoraOpcja.setFont(ObslugaOkienka.CZ_NAGLOWEK);
        eKtoraOpcja.setText("Wybierz sposób edycji:");

        rbUsun.setFont(ObslugaOkienka.CZ_NAGLOWEK);
        rbUsun.setSelected(false);
        rbUsun.setText("Usuń");
        rbUsun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUsunActionPerformed(evt);
            }
        });

        rbDodaj.setFont(ObslugaOkienka.CZ_NAGLOWEK);
        rbDodaj.setText("Dodaj");
        rbDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDodajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pWyboruEdycjiLayout = new javax.swing.GroupLayout(pWyboruEdycji);
        pWyboruEdycji.setLayout(pWyboruEdycjiLayout);
        pWyboruEdycjiLayout.setHorizontalGroup(
            pWyboruEdycjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pWyboruEdycjiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pWyboruEdycjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(pWyboruEdycjiLayout.createSequentialGroup()
                        .addComponent(rbDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbUsun))
                    .addComponent(eKtoraOpcja))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pWyboruEdycjiLayout.setVerticalGroup(
            pWyboruEdycjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pWyboruEdycjiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(eKtoraOpcja)
                .addGap(18, 18, 18)
                .addGroup(pWyboruEdycjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDodaj)
                    .addComponent(rbUsun))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pOperacji.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gWroc)
                .addContainerGap(322, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pWyboruEdycji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(pOperacji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gWroc)
                .addGap(18, 18, 18)
                .addComponent(pWyboruEdycji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pOperacji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDodajActionPerformed
        pokazPanel(((JRadioButton)evt.getSource()), rbUsun);
        
    }//GEN-LAST:event_rbDodajActionPerformed

    private void rbUsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUsunActionPerformed
        pListaUsun.pokazStrone();
	pokazPanel(((JRadioButton)evt.getSource()), rbDodaj);
    }//GEN-LAST:event_rbUsunActionPerformed

    public void pokazPanel(JRadioButton kliknietyRadioGuzik, JRadioButton drugiRadioGuzik){
        if(kliknietyRadioGuzik.isSelected()){
            kliknietyRadioGuzik.setEnabled(false);
            pOpcjiCL.show(pOperacji, kliknietyRadioGuzik.getText());
	    boolean czyAktywny = !kliknietyRadioGuzik.isEnabled();
	    if(drugiRadioGuzik == rbUsun)
		czyAktywny = ObslugaPliku.getPytania().size() != 0;
	    drugiRadioGuzik.setEnabled(czyAktywny);
        }
    }
    
    
    public void myOptions(){
        
        gGrupaOpcji.add(rbDodaj);
        gGrupaOpcji.add(rbUsun);
        
        ListaKomponentowDoAktywacji.lista.add(rbUsun);
        ListaKomponentowDoAktywacji.ustawKomponent(ObslugaPliku.getCzyMaZawartosc());
        
        pOpcjiCL = (CardLayout)this.pOperacji.getLayout();
        
        pOperacji.add(new PanelListaDodaj(), rbDodaj.getText());
	pListaUsun = new PanelListaUsun(edycja);
        pOperacji.add(pListaUsun, rbUsun.getText());
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eKtoraOpcja;
    private javax.swing.ButtonGroup gGrupaOpcji;
    private javax.swing.JButton gWroc;
    private javax.swing.JPanel pOperacji;
    private javax.swing.JPanel pWyboruEdycji;
    private javax.swing.JRadioButton rbDodaj;
    private javax.swing.JRadioButton rbUsun;
    // End of variables declaration//GEN-END:variables
}
