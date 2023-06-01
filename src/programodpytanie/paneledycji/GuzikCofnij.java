
package programodpytanie.paneledycji;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import programodpytanie.Edycja;

public class GuzikCofnij extends JButton{
    
    Edycja edycja;
    
    public GuzikCofnij(Edycja edycja){
	this.edycja = edycja;
	myOptions();
    }
    
    public void myOptions(){
	this.setText("Wróć");
	this.addActionListener((ActionEvent e) -> {
	    edycja.stworzPanel(edycja.getPWyboruEdycji(), "card2");
	});
    }
}
