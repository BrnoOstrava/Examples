public class ReproBedna{
Elipsa reprak1 = new Elipsa();
Elipsa reprak2 = new Elipsa();
Obdelnik telo = new Obdelnik();

public ReproBedna() {
    reprak1.setRozmer(70);
    reprak2.setRozmer(70); 
    reprak1.setPozice(43,0);
    reprak2.setPozice(43,80);
    telo.setRozmer(160);
    
    reprak1.setBarva(Barva.HNEDA);
    reprak2.setBarva(Barva.HNEDA);
    telo.setBarva(Barva.CERNA);
    reprak1.nakresli();
    reprak2.nakresli();
    
    
 }
}
