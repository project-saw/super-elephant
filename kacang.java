import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kacang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kacang extends Actor
{
    static Counter peanut = new Counter("peanut :");
    /**
     * Act - do whatever the kacang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        muncul();
        bullets c =(bullets)getOneIntersectingObject(bullets.class);
        if (c!=null){
            getWorld().removeObject(this);
            level_2.peanut.add(1);
            level_4.peanut.add(1);
        }
    }
    public void muncul(){
        setLocation(getX()-5, getY());
        if(isAtEdge()){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
    
}
