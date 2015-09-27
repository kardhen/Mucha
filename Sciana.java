import greenfoot.*;

public class Sciana extends World
{
    int x = Greenfoot.getRandomNumber(800);
    int y = Greenfoot.getRandomNumber(600);
    int iloscPajaczkow = Greenfoot.getRandomNumber(6)+3;
    
    public Sciana()
    {    
        super(800, 600, 1); 
        
        Mucha muszka = new Mucha();
        
        addObject(muszka, x, y);
        for(int listaPajakow=0; listaPajakow<iloscPajaczkow; listaPajakow++)
        {
            int pajakLokX = Greenfoot.getRandomNumber(800);
            int pajakLokY = Greenfoot.getRandomNumber(600);
            Pajak pajaczek = new Pajak();
            addObject(pajaczek,pajakLokX, pajakLokY);
        }
        
        
        
        
    }
}
