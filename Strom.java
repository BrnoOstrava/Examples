public class Strom {
    
    private Elipsa koruna;
    private Obdelnik kmen;
    
    public Strom() {
        koruna = new Elipsa(0, 0, 100, 100);
        kmen = new Obdelnik(35, 90, 30, 75);
        
        koruna.setBarva(Barva.ZELENA);
        kmen.setBarva(Barva.HNEDA);
        
        koruna.nakresli();
    }
}