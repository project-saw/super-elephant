import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class play extends World
{

    /**
     * Constructor for objects of class play.
     * 
     */
    public play()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(601, 400, 1); 
        prepare();
        act();
    }
    
    public void prepare(){
        button button = new button();
        addObject(button,295,200);
        info info = new info();
        addObject(info, 53, 358);
    }
    public void act(){
        //Greenfoot.playSound("menu utama.mp3");
    }
}
