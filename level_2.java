import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class level_2 extends World
{
    static Counter score = new Counter("score :");
    static Counter health = new Counter("health :");
    static Counter peanut = new Counter("peanut :");
    /**
     * Constructor for objects of class level_2.
     * 
     */
    public level_2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        act();
    }

    public void act(){
        int j=0;
        if(Greenfoot.getRandomNumber(500)<5){
            addObject(new tikus(), 600, Greenfoot.getRandomNumber(400));
            j=j+1;
        }
        if(Greenfoot.getRandomNumber(1000)<2){
        addObject(new kacang(), 600, Greenfoot.getRandomNumber(400));
        j=j+1;
        }
        naiklevel();
        lose();
    }
    public void naiklevel(){
         if(level_2.score.getValue() >= 250 && level_2.peanut.getValue() >= 5){
            Greenfoot.setWorld(new level_3());
        }
    }
    public void lose(){
        if(level_2.health.getValue() == 0){
            Greenfoot.setWorld(new gameover());
        }
    }
    
    private void prepare()
    {
        selen selen = new selen();
        addObject(selen,99,79);
        addObject(score, 425, 369);
        score.setValue(0);
        addObject(health, 533, 369);
        health.setValue(5);
        addObject(peanut, 320, 369);
        peanut.setValue(0);
    }
}
