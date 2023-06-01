package programodpytanie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ObslugaPliku {
    private static int iloscStron = 0;
    private static double poprawneOdpowiedzi = 0.0;
    private static final String sciezkaProgramu = new File("").getAbsolutePath(),
				sciezkaZestawSlowek = ObslugaPliku.sciezkaProgramu + "\\Slowniki",
				sciezkaOcen = ObslugaPliku.sciezkaProgramu + "\\Oceny";
    
    private static String nazwaPliku = "NowyPlikOdpytanie", 
			  rozszerzenie = ".txt",
			  nazwaPlikuOcen = "domyslne",
			  rozszerzenieOcen = ".txt",
			  pelnaNazwaPliku = sciezkaZestawSlowek + "\\" + nazwaPliku + rozszerzenie,
			  pelnaNazwaPlikuOcen = sciezkaOcen + "\\" + nazwaPlikuOcen + rozszerzenieOcen,
			  granicaSlow = ";";
    private static boolean czyMaZawartosc = false;
    private static ArrayList<String> pytania = new ArrayList<>(),
			      odpowiedzi = new ArrayList<>();
    private static ArrayList<Ocena> oceny = new ArrayList<>();
    
    public static String getSciezkaProgramu(){
	return ObslugaPliku.sciezkaProgramu;
    }
	    
    public static String getSciezkaZestawSlowek(){
	return ObslugaPliku.sciezkaZestawSlowek;
    }
	    
    public static String getSciezkaOcen(){
	return ObslugaPliku.sciezkaOcen;
    }
    
    public static String getNazwaPliku(){
	return ObslugaPliku.nazwaPliku;
    }
    
    public static String getRozszerzenie(){
	return ObslugaPliku.rozszerzenie;
    }
    
    public static String getNazwaPlikuOcen(){
	return ObslugaPliku.nazwaPlikuOcen;
    }
    
    public static String getRozszerzenieOcen(){
	return ObslugaPliku.rozszerzenieOcen;
    }
    
    public static String getPelnaNazwaPliku(){
	return ObslugaPliku.pelnaNazwaPliku;
    }
    
    public static String getPelnaNazwaPlikuOcen(){
	return ObslugaPliku.pelnaNazwaPlikuOcen;
    }
    
    public static String getGranicaSlow(){
	return ObslugaPliku.granicaSlow;
    }
    
    public static boolean getCzyMaZawartosc(){
        return ObslugaPliku.czyMaZawartosc;
    }
    
    public static ArrayList<String> getPytania(){
	return ObslugaPliku.pytania;
    }
    
    public static ArrayList<String> getOdpowiedzi(){
	return ObslugaPliku.odpowiedzi;
    }
    
    public static ArrayList<Ocena> getOceny(){
	return ObslugaPliku.oceny;
    }
    
    public static int getIloscStron(){
	return ObslugaPliku.iloscStron;
    }
    
    public static double getPoprawneOdpowiedzi(){
	return ObslugaPliku.poprawneOdpowiedzi;
    }
    
    public static void setPoprawneOdpowiedzi(int poprawneOdpowiedzi){
	ObslugaPliku.poprawneOdpowiedzi = ObslugaPliku.getPoprawneOdpowiedzi() < 0 ||  ObslugaPliku.getPoprawneOdpowiedzi() > 100 ? 0 : poprawneOdpowiedzi;
    }
    
    public static void setPoprawneOdpowiedzi(){
	++ObslugaPliku.poprawneOdpowiedzi;
    }
    
    /**
     * Funkcja ustawiająca statyczną zmienną <code>nazwaPliku</code>, sprawdzając czy ktoś
     * nie podał pustego ciągu znaków oraz czy nie użył niedozwolonych znaków.
     * 
     * @return string "0" gdy string zostanie ustawiony prawidłowo. 
     * W przeciwnym wypadku @return komunikat błędu
     */
    
    public static String setNazwaPliku(String nazwaPliku){
	String komunikat = ObslugaPliku.czyPoprawnyString(nazwaPliku);
	if(!komunikat.equals("0"))
	    return komunikat;
	ObslugaPliku.nazwaPliku = nazwaPliku;
	ObslugaPliku.setPelnaNazwaPliku();
	return "0";	    
    }
    
    /**
     * Funkcja ustawiająca statyczną zmienną <code>rozszerzenie</code>, sprawdzając czy ktoś
     * nie podał pustego ciągu znaków, czy nie użył niedozwolonych znaków oraz czy zaczyna się kropką.
     * 
     * @return string "0" gdy string zostanie ustawiony prawidłowo. 
     * W przeciwnym wypadku @return komunikat błędu
     */
    
    public static String setRozszerzenie(String rozszerzenie){
	String komunikat = ObslugaPliku.czyPoprawnyString(rozszerzenie);
	if(!komunikat.equals("0"))
	    return komunikat;
	if(rozszerzenie.indexOf(".") != 0)
	    return "Rozszerzenie musi zaczynać się znakiem \".\"";
	ObslugaPliku.rozszerzenie = rozszerzenie;
	ObslugaPliku.setPelnaNazwaPliku();
	return "0";
    }
    
    /**
     * Funkcja ustawiająca statyczną zmienną <code>pelnaNazwaPliku</code> bez sprawdzania poprawności
     * zmiennych, które budują tę zmienną.
     */
    
    public static void setPelnaNazwaPliku(){
	ObslugaPliku.pelnaNazwaPliku = ObslugaPliku.sciezkaZestawSlowek + "\\" + ObslugaPliku.nazwaPliku + ObslugaPliku.rozszerzenie;
    }
    
    /**
     * Funkcja ustawiająca statyczną zmienną <code>pelnaNazwaPliku</code> sprawdzając poprawność
     * zmiennych <code>nazwaPliku</code> oraz <code>rozszerzenie</code> a następnie ustawiając
     * je jako wartość zmiennej statycznej <code>nazwaPliku</code> a także <code>rozszerzenie</code>
     */
    
    public static String setPelnaNazwaPliku(String nazwaPliku, String rozszerzenie){
	String komunikat = setNazwaPliku(nazwaPliku);
	if(!komunikat.equals("0"))
	    return komunikat;
	komunikat = setRozszerzenie(rozszerzenie);
	if(!komunikat.equals("0"))
	    return komunikat;
	ObslugaPliku.nazwaPliku = nazwaPliku;
	ObslugaPliku.rozszerzenie = rozszerzenie;
	ObslugaPliku.setPelnaNazwaPliku();
	return "0";
    }
    
    /**
     * Funkcja ustawiająca statyczną zmienną <code>nazwaPlikuOcen</code>, sprawdzając czy ktoś
     * nie podał pustego ciągu znaków oraz czy nie użył niedozwolonych znaków.
     * 
     * @return string "0" gdy string zostanie ustawiony prawidłowo. 
     * W przeciwnym wypadku @return komunikat błędu
     */
    
    public static String setNazwaPlikuOcen(String nazwaPliku){
	String komunikat = ObslugaPliku.czyPoprawnyString(nazwaPliku);
	if(!komunikat.equals("0"))
	    return komunikat;
	ObslugaPliku.nazwaPlikuOcen = nazwaPliku;
	ObslugaPliku.setPelnaNazwaPlikuOcen();
	return "0";	    
    }
    
    /**
     * Funkcja ustawiająca statyczną zmienną <code>rozszerzenieOcen</code>, sprawdzając czy ktoś
     * nie podał pustego ciągu znaków, czy nie użył niedozwolonych znaków oraz czy zaczyna się kropką.
     * 
     * @return string "0" gdy string zostanie ustawiony prawidłowo. 
     * W przeciwnym wypadku @return komunikat błędu
     */
    
    public static String setRozszerzenieOcen(String rozszerzenie){
	String komunikat = ObslugaPliku.czyPoprawnyString(rozszerzenie);
	if(!komunikat.equals("0"))
	    return komunikat;
	if(rozszerzenie.indexOf(".") != 0)
	    return "Rozszerzenie musi zaczynać się znakiem \".\"";
	ObslugaPliku.rozszerzenieOcen = rozszerzenie;
	ObslugaPliku.setPelnaNazwaPlikuOcen();
	return "0";
    }
    
    
    /**
     * Funkcja ustawiająca statyczną zmienną <code>pelnaNazwaPlikuOcen</code> bez sprawdzania poprawności
     * zmiennych, które budują tę zmienną.
     */
    
    public static void setPelnaNazwaPlikuOcen(){
	ObslugaPliku.pelnaNazwaPlikuOcen = ObslugaPliku.sciezkaOcen + "\\" + ObslugaPliku.nazwaPlikuOcen + ObslugaPliku.rozszerzenieOcen;
    }
    
    /**
     * Funkcja ustawiająca statyczną zmienną <code>pelnaNazwaPlikuOcen</code> sprawdzając poprawność
     * zmiennych <code>nazwaPlikuOcen</code> oraz <code>rozszerzenieOcen</code> a następnie ustawiając
     * je jako wartość zmiennej statycznej <code>nazwaPlikuOcen</code> a także <code>rozszerzenieOcen</code>
     */
    
    public static String setPelnaNazwaPlikuOcen(String nazwaPlikuOcen, String rozszerzenieOcen){
	String komunikat = setNazwaPliku(nazwaPlikuOcen);
	if(!komunikat.equals("0"))
	    return komunikat;
	komunikat = setRozszerzenie(rozszerzenieOcen);
	if(!komunikat.equals("0"))
	    return komunikat;
	ObslugaPliku.nazwaPlikuOcen = nazwaPlikuOcen;
	ObslugaPliku.rozszerzenieOcen = rozszerzenieOcen;
	ObslugaPliku.setPelnaNazwaPlikuOcen();
	return "0";
    }
    
    /**
     * Funkcja potrzebna do przywrócenia domyślnych wartości wszystkim zmiennym.
     * Przydaje się w momencie gdy użytkownik w oknie menu wybierze opcję
     * "Zmiana pliku". Wtedy trzeba wyczyścić wszystkie zmienne i przygotować je
     * pod nowy plik, podany przez użytkownika.
     */
    
    public static void setDomyslneWartosci(){
	ObslugaPliku.iloscStron = 0;
	ObslugaPliku.poprawneOdpowiedzi = 0.0;
	ObslugaPliku.nazwaPliku = "NowyPlikOdpytanie";
	ObslugaPliku.nazwaPlikuOcen = "domyslne";
	ObslugaPliku.rozszerzenie = ".txt";
	ObslugaPliku.rozszerzenieOcen = ".txt";
	ObslugaPliku.setPelnaNazwaPliku();
	ObslugaPliku.setPelnaNazwaPlikuOcen();
	ObslugaPliku.granicaSlow = ";";
	ObslugaPliku.czyMaZawartosc = false;
	ObslugaPliku.pytania = new ArrayList<String>();
	ObslugaPliku.odpowiedzi = new ArrayList<String>();
    }
    
    public static void setCzyMaZawartosc(boolean czyMaZawartosc){
        ObslugaPliku.czyMaZawartosc = czyMaZawartosc;
    }
    
    
    public static void setIloscStron(){
        ObslugaPliku.iloscStron = (int)Math.ceil(pytania.size() / 10.0);
    }
    /**
     * Funkcja używana do sprawdzenia <code>nazwaPliku</code> oraz <code>rozszerzenie</code>
     * pod kątem występowania znaków szczególnych i długości nazwy pliku (różna od 0).
     * 
     * @return String "0" gdy nie zawiera znaków szczególnych i nie jest pusty
     * W przeciwnym wypadku @return String z komunikatem błędu
     */
    public static String czyPoprawnyString(String doSprawdzenia){
	if(doSprawdzenia.length() == 0){
	   return "Wpisz wartość!";
	}
	
	for(int i = 0; i < doSprawdzenia.length(); i++){
	    char znak = doSprawdzenia.charAt(i);
	    char[] niedozwoloneZnaki = {'\\', '/', ':', '*', '?', '\"', '<', '>', '|'};
	    for(char niedozwolonyZnak: niedozwoloneZnaki)
		if(znak == niedozwolonyZnak)
		    return "Podana nazwa nie może zawierać: \\/:*?\"<>|. Użyto: " + niedozwolonyZnak;
	}
	
	return "0";
    }    
    
    /**
     * Funkcja, która sprawdza czy plik o ścieżce <code>pelnaNazwaPliku</code> istnieje.
     * 
     * @return true jeśli plik istnieje oraz gdy użytkownik zdecyduje się utworzyć plik. 
     * Zwraca false jeśli plik nie istnieje i użytkownik nie zdecydował się utworzyć
     * nowego pliku.
     * 
     */
    
    public static boolean czyIstniejePlik(JFrame okno){
	File plik = new File(ObslugaPliku.getPelnaNazwaPliku());
	int czyUtworzyc = -1;
	boolean czyUtworzono = false;
            if(plik.exists() == true)
		return true;
	    try{
		czyUtworzyc = JOptionPane.showConfirmDialog(okno, "Nie znaleziono podanego pliku.\nCzy chcesz utworzyć nowy?", "Uwaga!", JOptionPane.YES_NO_OPTION);
		if(czyUtworzyc == 0){
		    plik.createNewFile();
		    czyUtworzono = true;
		}
	    }catch (IOException e) {
		System.out.println(e.getMessage());
	    }finally{
		return czyUtworzono;
	    }
    }
    /**
     * Funkcja, która sprawdza pierwszą linię pliku po to by się dowiedzieć czy plik posiada jakąkolwiek zawartość.
     * Przydaje się później przy ustawianiu parametru <code>enabled</code> dla guzików z klasy <code>Menu</code>:
     * <code>gOdpytanie</code> oraz <code>gOdczyt</code>.
     * 
     * @param nazwaPliku - domyślnie powinna przyjmować wartość <code>ObslugaPliku.getPelnaNazwaPliku()</code>.
     * 
     * @return true jeśli posiada zawartość i false w przeciwnym wypadku
     */
    public static void czyPlikMaZawartosc(String nazwaPliku){
	BufferedReader plik = null;
	try{
	    plik = new BufferedReader(new FileReader(nazwaPliku));
	    ObslugaPliku.czyMaZawartosc = plik.readLine() == null ? false : true;
	}catch(FileNotFoundException e){
	    System.out.println("Podany plik nie istnieje!");
	    ObslugaPliku.czyMaZawartosc = false;
	}catch(IOException ex){
	    System.out.println("Plik jest pusty!");
	    ObslugaPliku.czyMaZawartosc = false;
	}finally{
	    try{
		plik.close();
	    }catch(IOException e){
		System.out.println("Próbujesz zamknąć niezainicjalizowany plik!");
	    }
	}
    }
    
    /**
     * Funkcja pobiera pozycję <code>granicaSlow</code> w linii pobranej z pliku. Następnie jest on
     * podawany do ifa, który sprawdza czy zwrócona wartość jest równa -1 (nie znaleziono),
     * 0 (początek stringa a więc nie istnieje słowo po polsku) lub linia.length() - 1 
     * (koniec pliku a więc nie istnieje słowo po angielsku). Następnie sprawdza jeszcze czy w linii
     * nie znajduje się jeszcze jeden znak <code>granicaSlow</code>. Jeśli tak to plik również jest
     * zapisany w nieprawidłowym formacie.
     * 
     * @param linia - String pobierany z pliku, który będziemy sprawdzać pod kątem prawidłowego zapisu
     * 
     * @return true kiedy linia czytana z pliku jest formatu: slowo;slowo, jeśli nie zwraca false
     */
    public static boolean czyPoprawnaZawartoscPliku(String linia){
	int pozycjaGranicySlow = linia.indexOf(ObslugaPliku.getGranicaSlow());
	if(pozycjaGranicySlow == -1 || pozycjaGranicySlow == 0 || pozycjaGranicySlow == (linia.length() - 1))
	    return false;
	return linia.indexOf(ObslugaPliku.getGranicaSlow(), pozycjaGranicySlow + 1) == -1;
    }
    
    public static boolean czyPoprawnaZawartoscPlikuOcen(String linia){
	int pozycjaGranicySlow = linia.indexOf(ObslugaPliku.getGranicaSlow());
	if(pozycjaGranicySlow == -1 || pozycjaGranicySlow == 0 || pozycjaGranicySlow == (linia.length() - 1))
	    return false;
	for(int i = 0; i < 2; i++){
	    pozycjaGranicySlow = linia.indexOf(ObslugaPliku.getGranicaSlow(), pozycjaGranicySlow);
	    if(pozycjaGranicySlow == -1)
		return false;
	}
	return linia.indexOf(ObslugaPliku.getGranicaSlow(), pozycjaGranicySlow + 1) == -1;
    }
    
    
    /**
     * Funkcja ma za zadanie sprawdzić czy istnieje folder z ocenami
     * oraz folder, w którym są pliki tekstowe z listą słówek.
     */
    public static void przygotujFoldery(){
	// Zmienna, która najpierw przechowuje wskaźnik do folderu z plikami listy słówek
	// a później do folderu z plikami ocen
	File tymczasowy = new File(sciezkaZestawSlowek);
	if(!tymczasowy.exists())
	    tymczasowy.mkdir();
	tymczasowy = new File(sciezkaOcen);
	if(!tymczasowy.exists()){
	    tymczasowy.mkdir();
	    tymczasowy = new File(sciezkaOcen + "\\domyslne.txt");
	    try {
		if(!tymczasowy.exists())
		    tymczasowy.createNewFile();
		BufferedWriter bw = new BufferedWriter(new FileWriter(tymczasowy.getPath()));
		bw.write(
		    "5;100;91;Congratulations!! :D\n"
		    + "4;90;75;Well done! :)\n"
		    + "3;74;51;Not bad ;)\n"
		    + "2;50;30;Practise make u stronger!\n"
		    + "1;29;0;You have to learn more! :(\n"
		);
		bw.close();
	    } catch (FileNotFoundException ex) {
		System.out.println("Pliku nie znaleziono.");
	    } catch (IOException ex) {
		System.out.println("Wyjąctek IOException wywołany zamknięciem pliku.");
	    }
	}
	
    }
    
    /**
     * Funkcja, która inicjalizuje tablicę pytań i odpowiedzi z podanego pliku.
     * Używana przy uruchamianiu <code>Menu</code> oraz do tworzenia listy plików
     * <code>lPlikowDoOtwarcia</code> w klasie <code>Main</code>. Dzięki temu
     * lista będzie zawierać tylko te pliki tekstowe, które zostały zapisane w odpowiednim formacie.
     * 
     * @param nazwaPliku - w <code>Main</code> przyjmuje parametr <code>ObslugaPliku.getPelnaNazwaPliku()</code>.
     * Podczas tworzenia <code>lPlikowDoOtwarcia</code> przyjmuje <code>name</code> w <code>FilenameFilter()</code>
     * @param czyZapisac - jeśli ustawione na tak to zapisze czytane wartości do listy <code>pytania</code>
     * i <code>odpowiedzi</code>.
     * 
     * @return String "0" gdy udało się odczytać plik w prawidłowym formacie. W przeciwnym wypadku zwraca String  komunikatu błędu.
     */
    public static String czytanieZPliku(String nazwaPliku, boolean czyZapisac){
	BufferedReader odczPliku = null;
	try{
	    odczPliku = new BufferedReader(new FileReader(nazwaPliku));
	    //int i = 0;
	    String linia;
	    while((linia = odczPliku.readLine()) != null){
		if(!ObslugaPliku.czyPoprawnaZawartoscPliku(linia))
		    return "Niepoprawna struktura pliku!" +
			    "\nPlik musi być postaci: polskie slowo;angielskie slowo";
		if(czyZapisac){
		    pytania.add(linia.substring(0, linia.indexOf(granicaSlow)));
		    odpowiedzi.add(linia.substring(linia.indexOf(granicaSlow) + 1, linia.length()));
		}
		//System.out.println("pytanie: " + pytania.get(i));
		//System.out.println("odpowiedz: " + odpowiedzi.get(i));
		//i++;
	    }
	    
	    if(czyZapisac)
		ObslugaPliku.iloscStron = (int)Math.ceil(pytania.size() / 10.0);
		
	    
	    if(odczPliku != null) odczPliku.close();
	    return "0";
	}catch(FileNotFoundException e){
	    return e.getMessage();
	}catch (IOException e){
	    return e.getMessage();
	}
    }
    
    public static String zapisDoPliku(Object[] pytania, Object[] odpowiedzi, boolean czyDopisac){
	BufferedWriter bw;
	try{
	    bw = new BufferedWriter(new FileWriter(ObslugaPliku.getPelnaNazwaPliku(), czyDopisac));
	    
	    int n = Math.min(pytania.length, odpowiedzi.length);
	    for(int i = 0; i < n; i++){
		bw.append((String)pytania[i] + ObslugaPliku.getGranicaSlow() + (String)odpowiedzi[i] + "\n");
	    }
	    bw.close();
	}catch(IOException ex){
	    return "Coś poszło nie tak w trakcie zapisywania do pliku.\tSpróbuj ponownie.";
	}
	return "0";
    }
    
    public static String czytanieOcen(String nazwaPliku, boolean czyZapisac){
	BufferedReader odczPliku = null;
	try{
	    odczPliku = new BufferedReader(new FileReader(nazwaPliku));
	    String linia;
	    while((linia = odczPliku.readLine()) != null){
		//if(!ObslugaPliku.czyPoprawnaZawartoscPlikuOcen(linia))
		    //return "Niepoprawna struktura pliku!" +
			    //"\nPlik musi być postaci: nazwa;górny próg;dolny próg;opis.";
		if(czyZapisac){
		    int pozycjaGranicy[] = new int[3];
		    pozycjaGranicy[0] = linia.indexOf(getGranicaSlow());
		    for(int i = 1; i < pozycjaGranicy.length; i++){
			pozycjaGranicy[i] = linia.indexOf(getGranicaSlow(), pozycjaGranicy[i - 1] + 1);
		    }
		    
		    /*System.out.println(linia.substring(0, pozycjaGranicy[0]));
		    System.out.println(Integer.parseInt(linia.substring(pozycjaGranicy[0] + 1, pozycjaGranicy[1])));
		    System.out.println(Integer.parseInt(linia.substring(pozycjaGranicy[1] + 1, pozycjaGranicy[2])));
		    System.out.println(linia.substring(pozycjaGranicy[2] + 1, linia.length()));*/
		    
		    oceny.add(new Ocena(
			linia.substring(0, pozycjaGranicy[0]),
			Integer.parseInt(linia.substring(pozycjaGranicy[0] + 1, pozycjaGranicy[1])),
			Integer.parseInt(linia.substring(pozycjaGranicy[1] + 1, pozycjaGranicy[2])),
			linia.substring(pozycjaGranicy[2] + 1, linia.length())
		    ));
		}
	    }
	    
	    if(odczPliku != null) odczPliku.close();
	    return "0";
	}catch(FileNotFoundException e){
	    return e.getMessage();
	}catch (IOException e){
	    return e.getMessage();
	}
    }
    
    public static String[] stworzListePlikow(){
	File plik = new File(sciezkaZestawSlowek);
	FilenameFilter filtrRozszerzen = new FilenameFilter(){
	    @Override
	    public boolean accept(File dir, String name){
		return name.endsWith(ObslugaPliku.getRozszerzenie()) && czytanieZPliku(sciezkaZestawSlowek + "\\" + name, false).equals("0") ? true : false;
	    }
	};
	String listaPlikow[] = plik.list(filtrRozszerzen);
	//System.out.println("Lista plików " + rozszerzenie);
	for(int i = 0; i < listaPlikow.length; i++) {
	    listaPlikow[i] = listaPlikow[i].substring(0, listaPlikow[i].length() - rozszerzenie.length());
	    //System.out.println(listaPlikow[i]);
	}
	return listaPlikow;
    }
	    
}