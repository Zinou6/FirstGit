// Ben Said   Zine El Abidine 
package exocours;


public class ExoCours {

   
    public static void main(String[] args) {
       
       Personne P = new Personne ("Ben Said","Zine El Abidine","Algérien",23);
       
       System.out.println(P.toString(P));
       
        Personne P2 = new Personne("BenAtia","Mehdi","Moroco",28);
        Personne P3 = new Personne("Salah","Mohammed","Egypte",26);
        Personne P4 = new Personne("Mahrez","Reyad","Algérien",24);
        Personne P5 = new Personne("Del Piero","Alex","Italy",39);
        Personne P6 = new Personne("Morata","Alvaro","espagne",25);
        Personne P7 = new Personne("Belbachir","Chemsou","Algérien",21);
        
        P.AjouterAmis(P2);
        P.AjouterAmis(P3);
        P.AjouterAmis(P4);
        P.AjouterAmis(P5);
        P.AjouterAmis(P6);
        P.AjouterAmis(P7);
        
        System.out.println();
        P.MyListAmis();
        System.out.println();
        P.AmisAlg();
        System.out.println();
        P.AmisEtr();

    }

    
}
