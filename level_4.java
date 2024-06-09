import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class level_4 extends World
{
    static Counter score = new Counter("score :");
    static Counter health = new Counter("health :");
    static Counter peanut = new Counter("peanut :");
    static Counter koin = new Counter("koin :");
    /**
     * Constructor for objects of class level_4.
     * 
     */
    public level_4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void act(){
        int j=0;
            if(Greenfoot.getRandomNumber(100)<5){
            addObject(new tikus(), 600, Greenfoot.getRandomNumber(400));
            j=j+1;
            }
            if(Greenfoot.getRandomNumber(1000)<5){
            addObject(new kacang(), 600, Greenfoot.getRandomNumber(400));
            j=j+1;
        }
            if(Greenfoot.getRandomNumber(1000)<5){
            addObject(new koin(), 600, Greenfoot.getRandomNumber(400));
            j=j+1;
        }
        naiklevel();
        lose();
    }
    public void naiklevel(){
         if(level_4.score.getValue() >= 500 && level_4.peanut.getValue() >= 15 && level_4.koin.getValue() >= 20){
            Greenfoot.setWorld(new win());
        }
    }
    public void lose(){
        if(level_4.health.getValue() == 0){
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
        addObject(peanut, 220, 369);
        peanut.setValue(0);
    }
}
