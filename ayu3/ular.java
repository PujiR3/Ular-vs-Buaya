import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
/**
 * Write a description of class ular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ular extends Actor
{
    /**
     * Act - do whatever the ular wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int skor=0;
    public void act() 
    {
        // Add your action code here.
        move(4);
          if(Greenfoot.isKeyDown("left"))
          turn(-5);
          if(Greenfoot.isKeyDown("Right"))
          turn(5);
          if(Greenfoot.isKeyDown("Up"))
          turn(5);
          if(Greenfoot.isKeyDown("Down"))
          turn(-5);
          makancherie();
         

        }
    public void makancherie()
    {
        if(isTouching(cherie.class)){
            skor++;
            getWorld().showText("skor = "+skor, 300,50);
        removeTouching(cherie.class);
    }
    
    }    
    
}
