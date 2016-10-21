// Ben Said   Zine El Abidine 
package exocours;
import java.util.ArrayList;

public class Personne {
    
    private String Nom; 
    private String Prnom;
    private String Nat;
    private int Age ;
    ArrayList <Personne>ListA = new ArrayList<> () ;
    
    public Personne (String N,String P,String Na,int A )
    {
        this.Nom = N;
        this.Prnom = P;
        this.Nat = Na;
        this.Age = A;
    }
    public String toString (Personne P) 
    {
        return "Name : "+this.Nom +" || Prenom : "+this.Prnom +" ||Age : "+this.Age +" || Nationality :"+this.Nat;
    }
    
    
    public String getNom ()
    {
        return this.Nom;
    }
    public String getPrnom ()
    {
        return this.Prnom;
    }
    public String getNat ()
    {
        return this.Nat;
    }
    
    public void AjouterAmis (Personne P)
    {
        this.ListA.add(P);
    }
    
    public void MyListAmis (){
        System.out.println("☺☺☺ Liste D'Amis ☺☺☺ ");
        for (int i=0;i<ListA.size();i++)
        {
            
            System.out.println(this.ListA.get(i).getNom()+" "+this.ListA.get(i).getPrnom()+" from "+this.ListA.get(i).getNat());
        }
    }
    
    public void AmisAlg (){
        System.out.println("☺☺☺ Liste D'Amis Algerien ☺☺☺ ");
        for (int i=0;i<ListA.size();i++)
        {
            if (this.Nat.equals(ListA.get(i).getNat()))
            {
              System.out.println("Mr. "+this.ListA.get(i).getNom()+" "+this.ListA.get(i).getPrnom());
            }
        }
    }
    
    public void AmisEtr (){
        System.out.println("☺☺☺ Liste D'Amis Etrange ☺☺☺ ");
        for (int i=0;i<ListA.size();i++)
        {
            if (!this.Nat.equals(ListA.get(i).getNat()))
            {
              System.out.println("Mr. "+this.ListA.get(i).getNom()+" "+this.ListA.get(i).getPrnom()+" from "+this.ListA.get(i).getNat());
            }
        }
    }
    }
    
   
    
   
    
    

