
public class Computer
{
   private String hersteller;
   private int preis;
   private boolean laptop;
   
   public Computer()
   
   {
    setHersteller("Lenovo");
    setPreis(899);
    setLaptop(true);
    }
    
    public Computer(String neuHersteller, int neuPreis, boolean neuLaptop)
    {
    setHersteller(neuHersteller);
    setPreis(neuPreis);
    setLaptop(neuLaptop);
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
    
    public void setHersteller(String neuHersteller)
    
    {
        hersteller = neuHersteller;
    }
    
    public void setPreis(int neuPreis)
    {
        preis = neuPreis;
    }
    
    public void setLaptop(boolean neuLaptop)
    
    {
        laptop = neuLaptop;
    }
    
    public void printCpmputer()
    {
        System.out.println(hersteller + " " + "(" + laptop + ")" + " "+ preis  + " - EURO" );
    }   
}
   
 