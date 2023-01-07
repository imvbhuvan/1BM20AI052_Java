public interface Tossable
{
    void toss();
}

public abstract class Ball implements Tossable
{
    private String brandName;
    
    public Ball(String brandName)
    {
        this.brandName = brandName;
    }
    
    public String getBrandName()
    {
        return brandName;
    }
    
    public abstract void bounce(); 
}

public class Baseball extends Ball
{

    public Baseball(String brandName)
    {
        super(brandName);
    }

    public void toss()
    {
      System.out.println("Baseball toss");
    }

    public void bounce()
    {
      System.out.println("Baseball bounce");
    }

}

public class Football extends Ball
{

    public Football(String brandName)
    {      
        super(brandName);
    }
    
    public void toss()
    {
      System.out.println("Football toss");
    }

    public void bounce()
    {
      System.out.println("Football bounce");
    }
}

public class Rock implements Tossable
{
    
    public void toss()
    {        
      System.out.println("Rock toss");
    }
    
}
