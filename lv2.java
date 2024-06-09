import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2 extends level
{

    /**
     * Constructor for objects of class lv2.
     * 
     */
    public lv2()
    {
        act();
        tikus();
    }
    public void act()
    {
        int j=0;
            if(Greenfoot.getRandomNumber(500)<5){
            addObject(new kacang(), 600, Greenfoot.getRandomNumber(400));
            j=j+1;
            }
    }
    public void tikus(){
        int j=0;
            if(Greenfoot.getRandomNumber(500)<5){
            addObject(new tikus(), 600, Greenfoot.getRandomNumber(400));
            j=j+1;
            }
    }
    }
