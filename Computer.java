
public class Computer
{
   private String hersteller;
   private int preis;
   private boolean laptop;
   private int mhz;
   
   
   public Computer()
   
   {
    setHersteller("Lenovo");
    setPreis(899);
    setLaptop(true);
    setMhz(2000);
    }
    
    public Computer(String hersteller, int preis, boolean laptop, int mhz)
    {
    setHersteller(hersteller);
    setPreis(preis);
    setLaptop(laptop);
    }
   
   public String getHersteller()
   
   {
        return hersteller;
    }
    
    public int getPreis()
    
    {
        return preis;
    }
    
    public boolean getLaptop()
    {
        return laptop;
    }
    
    public void setHersteller(String hersteller)
    
    {
        this.hersteller = hersteller;
    }
    
    public void setPreis(int preis)
    {
        this.preis = preis;
    }
    
    public void setLaptop(boolean laptop)
    
    {
        this.laptop = laptop;
    }
    
    public void setMhz(int mhz)
    
    {
        this.mhz = mhz;
    }
    
    public void printCpmputer()
    {
        System.out.println(hersteller + " " + "(" + laptop + ")" + " "+ preis  + " - EURO" );
    }   
}
   
 