import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * * Instance variable (can ve used anywhere below)
     */
     int frames;
     
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        // Star tracking frame
        frames = 0;
    }
    /**
     * * Act - called repeatably to create animation
     */
    public void act()
    {
        // Keep track of the frames 
        frames += 1;
        
        // Show correct frame
        showText("" + frames, 100, 100);
    }
}