/**Implicintní konstruktor ten obsahuje každá tøída pokud  nenapíšeš konstruktor
*Každa tøída vždy musí obsahovat konstruktor.Musí jít vytvoøit instance
*Slovíèko new znamená že vytvaøím novou instanci = volám nový konstruktor 
*Každý konstruktor mùžu volat v daném objektu jenom 1x.
*
*/
public class Semafor {

    //private = modifikátor pøístupu
    //Semafor = Datový typ !
    //semaforek = název
    //to všechno = promìnná
    private Semafor semaforekus; //cvièná deklarace promìnné
    //deklarace promìnné znamená kliknutí pravým myšítkem na nìjakou tøídu. Název tøídy je i OBJEKTOVÝM datovým typem
    
    //###########################################KONVENCE######################################
    //domluvíme se, že atributy tøídy budou mít modifikátor pøístupu private
    //název objektového datového typu je taky tøída.
    //Jakoukoliv práci s promìnnými píšeme do metod (konstruktoru)
    //vlastnosti nebo hodnoty instance nebo tøídy  vyvolám teèkou. (!!!BEZ DATOVÉHO TYPU!!!!)
    private Obdelnik deska = new Obdelnik();
    private Obdelnik stojan = new Obdelnik();
    private Elipsa cervena = new Elipsa();
    private Elipsa zluta = new Elipsa();
    private Elipsa zelena = new Elipsa();
    
    public Semafor(){
        
        
        deska.setRozmer(50,110);
        stojan.setRozmer(20, 80);
        cervena.setRozmer(30);
        zluta.setRozmer(30);
        zelena.setRozmer(30);
        
        deska.setPozice(100, 100);
        stojan.setPozice(115, 205);
        cervena.setPozice(110, 107);
        zluta.setPozice(110, 140);
        zelena.setPozice(110, 173);
        
        deska.setBarva(Barva.CERNA);
        stojan.setBarva(Barva.CERNA);
        cervena.setBarva(Barva.CERVENA);
        zluta.setBarva(Barva.ZLUTA);
        zelena.setBarva(Barva.ZELENA);
    }
}