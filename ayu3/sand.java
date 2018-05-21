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
        Buaya Buaya = new Buaya();
        addObject(Buaya,225,87);
        Buaya Buaya2 = new Buaya();
        cherie cherie10 = new cherie();
        addObject(cherie10,166,156);
        cherie cherie11 = new cherie();
        addObject(cherie11,469,337);
        cherie cherie12 = new cherie();
        addObject(cherie12,478,155);
        cherie cherie13 = new cherie();
        addObject(cherie13,467,75);

        cherie4.setLocation(41,121);
        cherie2.setLocation(243,131);
        cherie3.setLocation(248,207);
        cherie6.setLocation(311,123);
        cherie7.setLocation(325,199);
        cherie8.setLocation(395,116);
        cherie12.setLocation(482,110);
        cherie11.setLocation(239,268);
        cherie5.setLocation(322,271);
        cherie10.setLocation(318,321);
        addObject(cherie13,408,193);
        cherie cherie14 = new cherie();
        addObject(cherie14,487,186);
        cherie cherie15 = new cherie();
        addObject(cherie15,158,218);
        cherie4.setLocation(144,141);
        cherie13.setLocation(426,189);
        cherie13.setLocation(404,188);
        cherie4.setLocation(135,124);
        cherie14.setLocation(132,202);
        cherie2.setLocation(200,122);
        cherie3.setLocation(198,200);
        cherie10.setLocation(266,52);
        cherie5.setLocation(376,280);
        cherie13.setLocation(70,160);
        cherie14.setLocation(146,194);
        cherie3.setLocation(228,202);
        cherie14.setLocation(155,299);
        cherie7.setLocation(501,188);
        cherie3.setLocation(401,201);
        cherie10.setLocation(263,193);
        cherie5.setLocation(513,254);
        cherie.setLocation(336,256);
        cherie14.setLocation(192,255);

        Buaya.setLocation(219,59);
        Buaya buaya2 = new Buaya();
        addObject(buaya2,485,348);
        cherie15 = new cherie();
        addObject(cherie15,200,347);
        cherie cherie16 = new cherie();
        addObject(cherie16,319,349);
        cherie cherie17 = new cherie();
        addObject(cherie17,429,277);
    }
}
