public class Panacek   {
private Elipsa hlava = new Elipsa();
private Obdelnik telo = new Obdelnik();
private Obdelnik ruka1 = new Obdelnik();
private Obdelnik ruka2 = new Obdelnik();
private Obdelnik noha1 = new Obdelnik();
private Obdelnik noha2 = new Obdelnik();

public Panacek(){

noha1.setRozmer(15,40);
noha1.setPozice(10,110);
noha2.setRozmer(15,40);
noha2.setPozice(29,110);
noha1.setBarva(Barva.MODRA);
noha2.setBarva(Barva.MODRA);

ruka1.setRozmer(20);
ruka1.setPozice(0,65);
ruka2.setRozmer(20);
ruka2.setPozice(45,65);
ruka1.setBarva(Barva.MODRA);
ruka2.setBarva(Barva.MODRA);

telo.setRozmer(40,60);
telo.setPozice(5,50);
telo.setBarva(Barva.ZELENA);

hlava.setRozmer(50);
hlava.setBarva(Barva.CERNA);


}

}
