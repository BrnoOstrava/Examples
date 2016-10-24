/**Implicintn� konstruktor ten obsahuje ka�d� t��da pokud  nenap�e� konstruktor
*Ka�da t��da v�dy mus� obsahovat konstruktor.Mus� j�t vytvo�it instance
*Slov��ko new znamen� �e vytva��m novou instanci = vol�m nov� konstruktor 
*Ka�d� konstruktor m��u volat v dan�m objektu jenom 1x.
*
*/
public class Semafor {

    //private = modifik�tor p��stupu
    //Semafor = Datov� typ !
    //semaforek = n�zev
    //to v�echno = prom�nn�
    private Semafor semaforekus; //cvi�n� deklarace prom�nn�
    //deklarace prom�nn� znamen� kliknut� prav�m my��tkem na n�jakou t��du. N�zev t��dy je i OBJEKTOV�M datov�m typem
    
    //###########################################KONVENCE######################################
    //domluv�me se, �e atributy t��dy budou m�t modifik�tor p��stupu private
    //n�zev objektov�ho datov�ho typu je taky t��da.
    //Jakoukoliv pr�ci s prom�nn�mi p�eme do metod (konstruktoru)
    //vlastnosti nebo hodnoty instance nebo t��dy  vyvol�m te�kou. (!!!BEZ DATOV�HO TYPU!!!!)
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