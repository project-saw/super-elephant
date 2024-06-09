import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tikus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tikus extends Actor
{
    int framekus = 0;
    static Counter score1 = new Counter("score :");
    static Counter health = new Counter("health :");
    private static final GreenfootImage puter2 = new GreenfootImage("t2 (1).png");
    private static final GreenfootImage puter3 = new GreenfootImage("t3.png");
    private static final GreenfootImage puter4 = new GreenfootImage("t4.png");
    /**
     * Act - do whatever the tikus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        spawn();
        putar();
        bullets c =(bullets)getOneIntersectingObject(bullets.class);
        if (c!=null){
            getWorld().removeObject(this);
            level_1.score1.add(10);
            level_2.score.add(10);
            level_3.score.add(10);
            level_4.score.add(10);
        }
    }
    public void spawn(){
        setLocation(getX()-5, getY());
        if(isAtEdge()){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
    public void putar(){
        if(framekus == 10)
        {
            setImage(puter2);
        }
        if(framekus == 20)
        {
            setImage(puter3);
        }
        if(framekus == 30)
        {
            setImage(puter4);
            framekus = 0;
        }
        if(framekus == 40)
        {
            
            framekus = 0;
        }
       
        framekus++;
    }
}
