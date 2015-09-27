import greenfoot.*;

public class Mucha extends Actor
{
    
    public void act() 
    {
       int x = getX();
       int y = getY();
       
       int movementSpeed = 5;
       
       if(Greenfoot.isKeyDown("up")){
           setLocation(x, y - movementSpeed);
        }else if(Greenfoot.isKeyDown("down")){
             setLocation(x, y + movementSpeed);
        }else if(Greenfoot.isKeyDown("left")){
             setLocation(x - movementSpeed, y);
        }else if(Greenfoot.isKeyDown("right")){
            setLocation(x + movementSpeed, y);
        }
    }    
}
