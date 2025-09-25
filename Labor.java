public class Labor
{
    private String gebaude;
    private int stock;
    private boolean beamer;
    private int anzPlatze;
    
    public Labor(String gebaude, int stock, boolean beamer, int anzPlatze)
    
    {
        setGebaude(gebaude);
        setStock(stock);
        setBeamer(beamer);
        setAnzPlatze(anzPlatze);
    
    }
    
    public Labor(String gebaude, int stock, boolean beamer)
    
    {
        setGebaude(gebaude);
        setStock(stock);
        setBeamer(beamer);
        setAnzPlatze(20);
    
    }
    
    public Labor(String gebaude, int stock, int anzPlatze)
    
    {
        setGebaude(gebaude);
        setStock(stock);
        setBeamer(true);
        setAnzPlatze(anzPlatze);
    
    }
    
    public Labor (int stock)
    
    {
        setGebaude("C");
        setStock(stock);
        setBeamer(true);
        setAnzPlatze(20);
        
    }
    
    public Labor()
    
    {
        setGebaude("C");
        setStock(5);
        setBeamer(true);
        setAnzPlatze(20);
    
    }
    
    public String getGebaude()
    {
        return gebaude;
    
    }
    
    public int getStock()
    
    {
        return stock;
        
    }
    
    public boolean getBeamer()
    
    {
        return beamer;
        
    }
    
    public int getAnzPlatze()
    
    {
        return anzPlatze;
    }
    
    public void setGebaude(String gebaude)
    
    {
        this.gebaude = gebaude;
    }
    
    public void setStock(int stock)
    
    {
        this.stock = stock;
    
    }
    
    public void setBeamer(boolean beamer)
    {
    
        this.beamer = beamer;
    }
    
    public void setAnzPlatze(int anzPlatze)
    {
        this.anzPlatze = anzPlatze;
    
    }
    
    public void printLabor()
    
    {
        System.out.println("Gebaude:" + gebaude + " " + "stock:" + stock);
    
    }
} 


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
