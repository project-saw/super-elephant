import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class koin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class koin extends Actor
{
    /**
     * Act - do whatever the koin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        muncul();
        bullets c =(bullets)getOneIntersectingObject(bullets.class);
        if (c!=null){
            getWorld().removeObject(this);
            level_3.koin.add(1);
            level_4.koin.add(1);
        }
    }
    public void muncul(){
        setLocation(getX()-5, getY());
        if(isAtEdge()){
            setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
}
