package programodpytanie;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Komputer Domowy
 */
public class Menu extends javax.swing.JFrame {

    private ObslugaOkienka obslugaOkienka = new ObslugaOkienka();
    private ArrayList<JFrame> oknaOpcji;
    private Odpytanie oOdpytanie;
    private WyswietlPlik oWyswietlPlik;
    private Edycja oEdycja;
    
    public Menu() {
	this.addWindowListener(obslugaOkienka);
        ObslugaPliku.czyPlikMaZawartosc(ObslugaPliku.getPelnaNazwaPliku());
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

        jLabel1 = new javax.swing.JLabel();
        pNaglowka = new javax.swing.JPanel();
        eNaglowek = new javax.swing.JLabel();
        pOpcji = new javax.swing.JPanel();
        eOdpytanie = new javax.swing.JLabel();
        eZapis = new javax.swing.JLabel();
        eOdczyt = new javax.swing.JLabel();
        eZmianaPliku = new javax.swing.JLabel();
        gOdpytanie = new javax.swing.JButton();
        gZapis = new javax.swing.JButton();
        gOdczyt = new javax.swing.JButton();
        gZmianaPliku = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setMinimumSize(new java.awt.Dimension(446, 317));
        setPreferredSize(new java.awt.Dimension(546, 417));

        eNaglowek.setFont(ObslugaOkienka.CZ_NAGLOWEK);
        eNaglowek.setText("Wybierz opcję");

        javax.swing.GroupLayout pNaglowkaLayout = new javax.swing.GroupLayout(pNaglowka);
        pNaglowka.setLayout(pNaglowkaLayout);
        pNaglowkaLayout.setHorizontalGroup(
            pNaglowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNaglowkaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(eNaglowek)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pNaglowkaLayout.setVerticalGroup(
            pNaglowkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNaglowkaLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(eNaglowek)
                .addGap(23, 23, 23))
        );

        eOdpytanie.setFont(ObslugaOkienka.CZ_NAGLOWEK);
        eOdpytanie.setText("Odpytanie");

        eZapis.setFont(ObslugaOkienka.CZ_NAGLOWEK);
        eZapis.setText("Zapisanie pytań i odpowiedzi");

        eOdczyt.setFont(ObslugaOkienka.CZ_NAGLOWEK);
        eOdczyt.setText("Przejrzenie zawartości pliku");

        eZmianaPliku.setFont(ObslugaOkienka.CZ_NAGLOWEK);
        eZmianaPliku.setText("Zmień plik");

        gOdpytanie.setFont(ObslugaOkienka.CZ_STANDARDOWA);
        gOdpytanie.setText("+");
        gOdpytanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gOdpytanieActionPerformed(evt);
            }
        });

        gZapis.setFont(ObslugaOkienka.CZ_STANDARDOWA);
        gZapis.setText("+");
        gZapis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gZapisActionPerformed(evt);
            }
        });

        gOdczyt.setFont(ObslugaOkienka.CZ_STANDARDOWA);
        gOdczyt.setText("+");
        gOdczyt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gOdczytActionPerformed(evt);
            }
        });

        gZmianaPliku.setFont(ObslugaOkienka.CZ_STANDARDOWA);
        gZmianaPliku.setText("+");
        gZmianaPliku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gZmianaPlikuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pOpcjiLayout = new javax.swing.GroupLayout(pOpcji);
        pOpcji.setLayout(pOpcjiLayout);
        pOpcjiLayout.setHorizontalGroup(
            pOpcjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOpcjiLayout.createSequentialGroup()
                .addGroup(pOpcjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pOpcjiLayout.createSequentialGroup()
                        .addComponent(eOdpytanie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gOdpytanie))
                    .addGroup(pOpcjiLayout.createSequentialGroup()
                        .addComponent(eZapis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gZapis))
                    .addGroup(pOpcjiLayout.createSequentialGroup()
                        .addComponent(eOdczyt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gOdczyt))
                    .addGroup(pOpcjiLayout.createSequentialGroup()
                        .addComponent(eZmianaPliku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gZmianaPliku)))
                .addContainerGap())
        );
        pOpcjiLayout.setVerticalGroup(
            pOpcjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOpcjiLayout.createSequentialGroup()
                .addGroup(pOpcjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eOdpytanie)
                    .addComponent(gOdpytanie))
                .addGap(5, 5, 5)
                .addGroup(pOpcjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eZapis)
                    .addComponent(gZapis))
                .addGap(5, 5, 5)
                .addGroup(pOpcjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eOdczyt)
                    .addComponent(gOdczyt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pOpcjiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gZmianaPliku)
                    .addComponent(eZmianaPliku))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(98, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(pNaglowka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pOpcji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pNaglowka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(pOpcji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void myOptions(){
        
        this.setLocation(obslugaOkienka.getSrodekEkranu(this.getSize()));
        ListaKomponentowDoAktywacji.lista.add(gOdczyt);
        ListaKomponentowDoAktywacji.lista.add(gOdpytanie);
        
        oknaOpcji = new ArrayList<>();
        
        ListaKomponentowDoAktywacji.ustawKomponent(ObslugaPliku.getCzyMaZawartosc());
    }
    
    private void gOdpytanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gOdpytanieActionPerformed
	if(!(oOdpytanie instanceof Odpytanie) || !oOdpytanie.isVisible()){
	    oOdpytanie = new Odpytanie();
            addOknaOpcji(oOdpytanie);
	    oOdpytanie.setVisible(true);  
	}
	
    }//GEN-LAST:event_gOdpytanieActionPerformed

    private void gOdczytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gOdczytActionPerformed
        if(!(oWyswietlPlik instanceof WyswietlPlik) || !oWyswietlPlik.isVisible()){
	    oWyswietlPlik = new WyswietlPlik((JFrame)this);
            addOknaOpcji(oWyswietlPlik);
	    oWyswietlPlik.setVisible(true);
	}
	
    }//GEN-LAST:event_gOdczytActionPerformed

    private void gZmianaPlikuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gZmianaPlikuActionPerformed
        this.dispose();
        this.zamknijWszystkieOkna();
	ObslugaPliku.setDomyslneWartosci();
	new Main().setVisible(true);
    }//GEN-LAST:event_gZmianaPlikuActionPerformed

    private void gZapisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gZapisActionPerformed
        if(!(oEdycja instanceof Edycja) || !oEdycja.isVisible()){
	    oEdycja = new Edycja();
            addOknaOpcji(oEdycja);
	    oEdycja.setVisible(true);
	}
    }//GEN-LAST:event_gZapisActionPerformed

    public void zamknijWszystkieOkna(){
        for(JFrame okno: oknaOpcji){
            okno.dispose();
            //System.out.println(okno);
        }
        
        oknaOpcji.clear();
    }
    
    public void addOknaOpcji(JFrame okno){
        for(int i = 0; i < oknaOpcji.size(); i++){
            if(!oknaOpcji.get(i).isVisible())
                oknaOpcji.remove(i);
        }
        oknaOpcji.add(okno);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eNaglowek;
    private javax.swing.JLabel eOdczyt;
    private javax.swing.JLabel eOdpytanie;
    private javax.swing.JLabel eZapis;
    private javax.swing.JLabel eZmianaPliku;
    private javax.swing.JButton gOdczyt;
    private javax.swing.JButton gOdpytanie;
    private javax.swing.JButton gZapis;
    private javax.swing.JButton gZmianaPliku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pNaglowka;
    private javax.swing.JPanel pOpcji;
    // End of variables declaration//GEN-END:variables
}
