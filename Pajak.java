import greenfoot.*;

public class Pajak extends Actor
{
    
    public void act() 
    {
        ruszSie();
        
        if(this.isTouching(Mucha.class))
            getWorld().removeObject(this);
        
        move(3);
    }    
    
    public void ruszSie(){
        int czyRuch = Greenfoot.getRandomNumber(100);
            
        if(czyRuch<4){
        int jakiKierunek = Greenfoot.getRandomNumber(360);
        setRotation(jakiKierunek);
        move(1);
        }
    }    
}
