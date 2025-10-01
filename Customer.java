
public class Customer
{
   private String name;
   private int geld;
 
   
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
    
   public String getNachname()
    {
        int pos = name.indexOf(" ");
        int length = name.length();
        return name.substring(pos+1,length);
    }
    
   public String getVorname()
    {
        int pos = name.indexOf(" ");
        return name.substring(0,pos);
    }
    
   public String getNachnameVorname()
    {
       int pos = name.indexOf(" ");
       int length = name.length();
       return name.substring(pos+1,length)+name.substring(0,pos);
    
    }
 
   public void setName(String name)
   
    {
        this.name = name;
    
    }
    
    
   public void setGeld(int geld)
   
    {
        this.geld = geld;
    
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