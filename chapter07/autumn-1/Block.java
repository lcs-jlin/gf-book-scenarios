import greenfoot.*;

/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Block extends Actor
{
    private int delta = 2;
    
    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkMouseClick();
    }
    
    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
    }
    
    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
        if (isAtEdge()) 
        {
            delta = -delta;  // reverse direction
        }
    }
    
    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    private void checkMouseClick()
    {
        // When "null" is passed as an argument to mouseClicked, this mthos, 
        // mouseClicked returns true ANY TIME the mouse is clicked
        // If you pass a specific object refrence, this method returns true 
        // ONLY when that object is clicked
        if (Greenfoot.mouseClicked(null)) 
        {
            // Get an object refrence to the world
            World myWorld = getWorld();
            
            // Show some text on the screen
            myWorld.showText("clicked mouse", 200, 200);
        }
    }
    
}
