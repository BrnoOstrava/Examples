public class Prejezd {

    private Elipsa svetlo1 = new Elipsa();
    private Elipsa svetlo2 = new Elipsa();
    private Obdelnik telo = new Obdelnik();
 public Prejezd () {
    svetlo1.setPozice(5,10);
    svetlo1.setRozmer(30);
    svetlo2.setPozice(60, 10);
    svetlo2.setRozmer(30);
    telo.setRozmer(100,50);
    
    svetlo1.setBarva(Barva.CERVENA);
    svetlo2.setBarva(Barva.CERVENA);
    telo.setBarva(Barva.CERNA);
    svetlo1.nakresli();
    svetlo2.nakresli();
    
    }
}
