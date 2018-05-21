import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buaya extends Actor
{
    /**
     * Act - do whatever the aligator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(4);
        if(Greenfoot.getRandomNumber(100)<10)
        turn(Greenfoot.getRandomNumber(15)-30);
        eatular();
    }    
     public void eatular()
    {
        if(isTouching(ular.class))
        removeTouching(ular.class);
    }    
}

