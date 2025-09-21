
public class Buch
{
    private String verlag;
    private int seiten;
    
    public Buch(String neuVerlag, int neuSeiten)
    
    {
        setVerlag(neuVerlag);
        setSeiten(neuSeiten);
    }
    
    public Buch(int neuSeiten)
    
    {
        setVerlag("Springer");
        setSeiten(neuSeiten);
    }
    
    public Buch()
    
    {
        setVerlag("Springer");
        setSeiten(100);
    }
    
    public String getVerlag()
    {
        return verlag;
    }
    
    public int getSeiten()
    {
        return seiten;
    }
    
    public void setVerlag(String neuVerlag)
    {
        verlag = neuVerlag;
    }
    
    public void setSeiten(int neuSeiten)
    {
        seiten = neuSeiten;
    }
    
    public void printBuch()
    
    {
        System.out.println( "verlag:" + " " +verlag + " " +  "seiten - " + seiten );
    }
    
}
    
    
