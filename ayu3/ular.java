import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public void act() 
    {
        // Add your action code here.
        move(4);
          if(Greenfoot.isKeyDown("left"))
          turn(-5);
          if(Greenfoot.isKeyDown("right"))
          turn(5);
          if(Greenfoot.isKeyDown("up"))
          turn(-5);
          if(Greenfoot.isKeyDown("down"))
          turn(3);
          eatcherie();
        }
    public void eatcherie()
    {
        if(isTouching(cherie.class))
        removeTouching(cherie.class);
    }    
}
