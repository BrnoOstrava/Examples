public class Cinka{

    private Elipsa zavazi2 = new Elipsa();
    private Elipsa zavazi1 = new Elipsa();
    private Obdelnik telo = new Obdelnik();
    
    
    public Cinka() {
      zavazi1.setRozmer(50);
      zavazi1.setPozice(0,0);
      zavazi2.setRozmer(50);
      zavazi2.setPozice(100,0);
      telo.setRozmer(55,30);
      telo.setPozice(48,10);
      zavazi1.nakresli();
      zavazi1.setBarva(Barva.CERNA);
      zavazi2.setBarva(Barva.CERNA);
      telo.setBarva(Barva.CERVENA);
      
    
        
    
    }
}
