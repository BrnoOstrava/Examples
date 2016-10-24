

public class Tree{

 
 private Obdelnik kmen = new Obdelnik();
 private Elipsa koruna = new Elipsa();
    
public Tree() {
kmen.setPozice(35, 90);
kmen.setRozmer(30, 75);
koruna.setRozmer(100, 100);

kmen.setBarva(Barva.HNEDA);
koruna.setBarva(Barva.ZELENA);

}
 }
