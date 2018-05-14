 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sand extends World
{

    /**
     * Constructor for objects of class sand.
     * 
     */
    public sand()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ular ular = new ular();
        addObject(ular,52,278);
        cherie cherie = new cherie();
        addObject(cherie,238,325);
        cherie cherie2 = new cherie();
        addObject(cherie2,205,218);
        cherie cherie3 = new cherie();
        addObject(cherie3,280,122);
        cherie cherie4 = new cherie();
        addObject(cherie4,285,38);
        cherie cherie5 = new cherie();
        addObject(cherie5,337,345);
        cherie cherie6 = new cherie();
        addObject(cherie6,316,240);
        cherie cherie7 = new cherie();
        addObject(cherie7,370,140);
        cherie cherie8 = new cherie();
        addObject(cherie8,383,70);
        aligator aligator = new aligator();
        addObject(aligator,225,87);
        aligator aligator2 = new aligator();
        addObject(aligator2,438,311);

        cherie cherie9 = new cherie();
        addObject(cherie9,414,213);
        cherie cherie10 = new cherie();
        addObject(cherie10,166,156);
        cherie cherie11 = new cherie();
        addObject(cherie11,469,337);
        cherie cherie12 = new cherie();
        addObject(cherie12,478,155);
        cherie cherie13 = new cherie();
        addObject(cherie13,467,75);
        aligator2.setLocation(455,284);
        aligator.setLocation(117,70);

        aligator.setLocation(95,37);
        aligator2.setLocation(499,357);
        addObject(cherie12,484,77);

    }
}
;