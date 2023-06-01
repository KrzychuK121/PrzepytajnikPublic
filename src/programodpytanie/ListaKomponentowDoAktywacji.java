package programodpytanie;

import java.awt.Component;
import java.util.ArrayList;

/**
 * Klasa powstała po to by przechowywać w niej komponenty z okienek,
 * które mają się ustawić na aktywne (nieaktywne) po tym jak plik, na którym pracuje,
 * zyskał (stracił) zawartość.  
 * @author Krzychu
 */
public class ListaKomponentowDoAktywacji{
    
    public static final ArrayList<Component> lista = new ArrayList<>();
    
    public static void ustawKomponent(boolean czyAktywny){
        for(Component c: lista){
            c.setEnabled(czyAktywny);
            //System.out.println(c);
        }
            
    }
}
