package programodpytanie;

public class Ocena{
    private String komunikat, nazwa;
    private int dolnaGranica, gornaGranica;
    
    public Ocena(){
	
    }
    
    public Ocena(String nazwa, int gornaGranica, int dolnaGranica, String komunikat){
	this.nazwa = nazwa;
	this.gornaGranica = gornaGranica;
	this.dolnaGranica = dolnaGranica;
	this.komunikat = komunikat;
    }
    
    public String getKomunikat(){
	return komunikat;
    }
    
    public String getNazwa(){
	return nazwa;
    }
    
    public int getDolnaGranica(){
	return dolnaGranica;
    }
    
    public int getGornaGranica(){
	return gornaGranica;
    }
    
    @Override
    public String toString(){
	return "Ocena: " + getNazwa() + " (od "+ getDolnaGranica() + " do " + getGornaGranica() + " procent).\nOpis: " + getKomunikat();
    }
    
    public boolean czyWZakresie(int procent){
	return this.dolnaGranica <= procent && procent <= this.gornaGranica;
    }
    
    public boolean czyWZakresie(double procent){
	return this.dolnaGranica <= procent && procent <= this.gornaGranica;
    }
    
}