import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class level_1 extends World
{
    static Counter score1 = new Counter("score :");
    static Counter health = new Counter("health :");
    /**
     * Constructor for objects of class level_1.
     * 
     */
    public level_1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        selen selen = new selen();
        addObject(selen,69,90);
        addObject(score1, 425, 369);
        score1.setValue(0);
        addObject(health, 533, 369);
        health.setValue(5);
        act();
    }
    public void act(){
        int j=0;
            if(Greenfoot.getRandomNumber(500)<5){
            addObject(new tikus(), 600, Greenfoot.getRandomNumber(400));
            j=j+1;
            } 
        naiklevel();
        lose();
        //Greenfoot.playSound("playin level.mp3");
    }
    public void naiklevel(){
        if(level_1.score1.getValue() == 200){
            Greenfoot.setWorld(new level_2());
        }
    }
    public void lose(){
        if(level_1.health.getValue() == 0){
            Greenfoot.setWorld(new gameover());
        }
    }
    
}
