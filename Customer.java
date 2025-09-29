
public class Customer
{
   private String name;
   private int geld;
   private String vorname;
   private String nachname;
   
   public Customer(String name, int geld)
    {
    
        setName(name);
        setGeld(geld);
    
    }
    
   public Customer()
   
    {
        setName("Max Mustermann");
        setGeld(1000);
    
    }
   
   
   public String getName()
    {
        return name;
        
    }
   
   public int getGeld()
   
    {
        return geld;
    
    }
    
   public String getVorname()
   
    {
       return vorname; 
    
    }
    
   public String getNachname()
   
    {
    
        return nachname;
    
    }
    
   public String getNachnameVorname() 
    {
        return nachname + " " + vorname;
        
        
    }
 
    
   public void setName(String name)
   
    {
        this.name = name;
    
    }
    
    
   public void setGeld(int geld)
   
    {
        this.geld = geld;
    
    }
    
   public void setVorname(String vorname)
   
   {
    
        this.vorname = vorname;
    
    }
    
   public void setNachname(String nachname)
   
   {
    
        this.nachname = nachname;
    
    }
    
   public void printCustomer()
   
   {
       if (geld == 0 )
        {
        
            System.out.println(name + " " + geld + " " + "EUR" + " " + "- hat kein Geld");
        
        }
        
        else 
       {
        
             System.out.println(name + " " + geld + " " + "EUR" + " " + "- hat Geld"); 
        
        
        } 
       

       
        
        
    
    }
}