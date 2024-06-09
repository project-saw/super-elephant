import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class level_3 extends World
{
    static Counter score = new Counter("score :");
    static Counter health = new Counter("health :");
    static Counter koin = new Counter("coin :");
    /**
     * Constructor for objects of class level_3.
     * 
     */
    public level_3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void act(){
        int j=0;
            if(Greenfoot.getRandomNumber(200)<5){
            addObject(new tikus(), 600, Greenfoot.getRandomNumber(400));
            j=j+1;
            }
           if(Greenfoot.getRandomNumber(2000)<3){
            addObject(new koin(), 600, Greenfoot.getRandomNumber(400));
            j=j+1;
            }
        naiklevel();
        lose();
    }
    public void naiklevel(){
         if(level_3.score.getValue() >= 350 && level_3.koin.getValue() >= 10){
            Greenfoot.setWorld(new level_4());
        }
    }
    public void lose(){
        if(level_3.health.getValue() == 0){
            Greenfoot.setWorld(new gameover());
        }
    }
    public void prepare(){
        selen selen = new selen();
        addObject(selen,69,90);
        addObject(score, 425, 369);
        score.setValue(0);
        addObject(health, 533, 369);
        health.setValue(5);
        addObject(koin, 320, 369);
        koin.setValue(0);
    }
}
