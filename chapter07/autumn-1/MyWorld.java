import greenfoot.*;

/**
 * Autumn. A world with some leaves.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class MyWorld extends World
{
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();
    }
    
    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);
        // Add 18 leafs object to the world
        // START KEEP GOING LONG AS THIS IS TRUE    CHANGE BY
        for (int i = 1; 1<=18; i+=1)
        {
            //Creat a leaf
            Leaf aLeaf = new Leaf();
            
            // Get a random location (use getwidth() instead 
            //of 600 to avoid a single constant)
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getWidth());
            // Add the Leaf object to the world
            addObject(aLeaf, x, y);
        }
    }
}
