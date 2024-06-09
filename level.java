import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level extends World
{
    static Counter score = new Counter("score :");
    static Counter health = new Counter("health :");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public level()
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
        selen selen = new selen();
        addObject(selen,69,90);
        addObject(score, 425, 369);
        score.setValue(0);
        addObject(health, 533, 369);
        health.setValue(5);
        
        
    }
    public void act(){
            int j=0;
            if(Greenfoot.getRandomNumber(500)<5){
            addObject(new tikus(), 600, Greenfoot.getRandomNumber(400));
            j=j+1;
            }
    }
}
