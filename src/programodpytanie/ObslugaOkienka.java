package programodpytanie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ObslugaOkienka extends WindowAdapter{
    
    public static final double szerEkranu = Toolkit.getDefaultToolkit().getScreenSize().getWidth(),
			       wysEkranu = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    private double szerOkna,
		   wysOkna;
    
    public static final Font CZ_STANDARDOWA = new Font("Dialog", Font.PLAIN, 13),
			     CZ_NAGLOWEK = new Font("Dialog", Font.BOLD, 16);
    public static final int CZ_ROZMIAR_STANDARDOWY = 0,
			    CZ_ROZMIAR_SREDNI = 3,
			    CZ_ROZMIAR_DUZY = 6;
    private int czAktualnyRozmiar = 0,
                czNowyRozmiar = 0;
    
    private JFrame okno = new JFrame();
    private Dimension sredRozmiar = new Dimension(),
		      maksRozmiar = new Dimension();
    
    public int getCzAktualnyRozmiar(){ return czAktualnyRozmiar; }
    
    public void setCzAktualnyRozmiar(int rozmiar){ czAktualnyRozmiar = rozmiar; };
    
    public void zmienCzcionkeOkna(){
	for(Component komponent: okno.getContentPane().getComponents())
	    zmienCzcionkeKomponent(komponent);
    }
    
    private void zmienCzcionkeKomponent(Component komponent){
	//System.out.println(komponent.getFont().getSize() + " + " + getCzAktualnyRozmiar());
	int rozmiar = Math.max(komponent.getFont().getSize() + getCzAktualnyRozmiar(), CZ_STANDARDOWA.getSize());
	komponent.setFont(new Font(komponent.getFont().getFamily(), 
				   komponent.getFont().getStyle(), 
					rozmiar));
	if(komponent instanceof Container){
	    for(Component dzieckoKomponent: ((Container)komponent).getComponents()){
		zmienCzcionkeKomponent(dzieckoKomponent);
	    }
	}
    }
    
    /**
    * Funkcja porównuje pola wymiarów ze sobą i na tej podstawie zwraca wartość
    * @return 1 - wymiar1 > wymiar 2
    * @return 0 - wymiar1 = wymiar2
    * @return -1 - wymiar1 < wymiar2
    */
    private int porownajWymiary(Dimension wymiar1, Dimension wymiar2){ return Double.compare(wymiar1.getWidth() * wymiar1.getHeight(), wymiar2.getWidth() * wymiar2.getHeight()); }
    
    /**
     * Funkcja oblicza punkt, w którym należy postawić okno aby było przesunięte względem okna rodzica.
     * 
     * @param rodzic - wymiary ramki rodzica, potrzebny do obliczeń
     * @param przesuniecieX, przesuniecieY - parametry, którym zwykle podajemy wartość x oraz y,
     * którą otrzymujemy z metody getBounds() od rodzica, względem którego chcemy przesunąć ramkę
     * @param poKtorejStronie - przyjmuje wartosć 1 lub -1 (jak chcemy po lewej stronie dajemy -1,
     * jak po prawej to 1)
     * 
     * @return obliczony punkt lub (0, 0) w przypadku gdy ktoś chce przesunąć nieistniejące okno.
     */
    public Point getPozycjaOkna(Dimension rodzic, Dimension dziecko, double przesuniecieX, double przesuniecieY, int poKtorejStronie){
	if(szerOkna == 0.0){
	    szerOkna = dziecko.getWidth();
	    wysOkna = dziecko.getHeight();
	}
	return new Point((int)(przesuniecieX + poKtorejStronie * (rodzic.getWidth() - szerOkna)/2), (int)(przesuniecieY + poKtorejStronie * (rodzic.getHeight() - wysOkna)/2));
    }
    
    /**
     * Funkcja oblicza punkt, w którym należy postawić okno aby było przesunięte na środek ekranu.
     * 
     * @param dziecko - trzeba podać wymiary ramki, którą chcemy wycentrować by znać jej wielkość
     * 
     * @return obliczony punkt środka okna lub (0, 0) w przypadku gdy ktoś chce przesunąć nieistniejące okno.
     */

    public Point getSrodekEkranu(Dimension dziecko){	
	return getPozycjaOkna(new Dimension((int)this.szerEkranu, (int)this.wysEkranu), dziecko, 0.0, 0.0, 1);
    }
    
    public void setAllSize(){
        Dimension tmp = new Dimension(this.okno.getPreferredSize());
        
        // Ustawianie minimalnego rozmiaru
        this.okno.setMinimumSize(tmp);
        
        // Ustawianie preferowanej wielkości okna
        sredRozmiar = new Dimension(
                (int)(tmp.width * 1.5),
                (int)(tmp.height * 1.5)
        );
        
        // Ustawianie maksymalnego rozmiaru okna
        maksRozmiar = new Dimension(
                tmp.width * 2,
                tmp.height  * 2
        );
	
	this.okno.setMaximumSize(new Dimension((int)(maksRozmiar.getWidth() * 1.3), (int)(maksRozmiar.getHeight() * 1.3)));
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
	this.okno = (JFrame)e.getSource();
	
        setAllSize();
        
	this.szerOkna = this.okno.getSize().getWidth();
	this.wysOkna = this.okno.getSize().getHeight();
			
	okno.getRootPane().addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
		Dimension wymOkn = okno.getSize();
		
		int staryRozmiarCzcionki = czNowyRozmiar;
		//okno >= minimalny rozmiar I okno < preferowany rozmiar
                if(porownajWymiary(wymOkn,okno.getMinimumSize()) >= 0 && porownajWymiary(wymOkn, sredRozmiar) < 0){
		    czAktualnyRozmiar = ObslugaOkienka.CZ_ROZMIAR_STANDARDOWY;
                    czNowyRozmiar = ObslugaOkienka.CZ_ROZMIAR_STANDARDOWY;
		//okno >= preferowany rozmiar rozmiar I okno < maksymalny rozmiar
		}else if(porownajWymiary(wymOkn, sredRozmiar) >= 0 && porownajWymiary(wymOkn, maksRozmiar) < 0){
		    czAktualnyRozmiar = ObslugaOkienka.CZ_ROZMIAR_SREDNI;
                    czNowyRozmiar = ObslugaOkienka.CZ_ROZMIAR_SREDNI;
		//okno >= maksymalny rozmiar
		}else if(porownajWymiary(wymOkn, maksRozmiar) >= 0){
		    czAktualnyRozmiar = ObslugaOkienka.CZ_ROZMIAR_DUZY;
                    czNowyRozmiar = ObslugaOkienka.CZ_ROZMIAR_DUZY;
		}
		
		
		
		
		if(staryRozmiarCzcionki != czNowyRozmiar){
		    czAktualnyRozmiar -= staryRozmiarCzcionki;
		    
		    //System.out.println("Aktualny rozmiar ramki: \t" + wymOkn + "Minimalny rozmiar: \t" + okno.getMinimumSize() + "Preferowany rozmiar: \t" + prefRozmiar + "Maksymalny rozmiar: \t" + okno.getMaximumSize());
		    
		    //System.out.println("Rozmiar czcionki: " + czAktualnyRozmiar);
		    
		    zmienCzcionkeOkna();
		}
		    
		
            }
        });
    }

    @Override
    public void windowClosing(WindowEvent e) {
	
    }

    @Override
    public void windowClosed(WindowEvent e) {
	
    }

    @Override
    public void windowIconified(WindowEvent e) {
	
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
	
    }

    @Override
    public void windowActivated(WindowEvent e) {
	
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
	
    }
    
}
