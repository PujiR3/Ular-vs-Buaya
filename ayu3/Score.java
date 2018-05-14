import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
public Score(String player1)
{
 GreenfootImage img = new GreenfootImage (800, 40);
 
 Font font = new Font("Helvitical", Font.BOLD, 20);

 img.drawString(player1, 150, 35);
 setImage(img);
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
}   
public void setText(String player1)
{
     GreenfootImage img = getImage();
     img.clear();
     img.drawString(player1, 150, 30);
        // Add your action code here.
    }
}
