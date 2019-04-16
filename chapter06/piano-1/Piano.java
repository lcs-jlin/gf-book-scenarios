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
    //primitive data type
    int frames;
    // Object data type... square brackets [] indicate an array ( a list)
    String[] studentNames = { 
            "Sara", "Chelsea", "Jack", "Maxwell", "Gavin" , 
            "Minah", "Brandon", "Jeewoo", "Peter", "Justy" 
        };

        // Track the white keys and notes
        String[] whiteKeys = {"a", "s", "d", "f", "g", "h", "j", "k", "l",
            "i", "'", "\\"};
            String[] whiteNotes = {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c",
            "4e", "4f", "4g"};
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        // Star tracking frame
        frames = 0;
        // Initialize the array of student nmaes

        prepare();
    }

    /**
     * * Act - called repeatably to create animation
     */
    public void act()
    {
        // Every second say hello to the nest person in the list
        // Use a Boolean AND to track both conditions
        // The shwotext statement only runs when BOTH conditions are true
        //NOTE:white
        if ((frames % 60 == 0) && (frames % 60 < whiteKeys.length)) 
        {
            if ( frames / 60 < 10 )
            {
                showText("Hello " + studentNames [ frames / 60 ], 400, 170);
            }
        }
        // Keep track of the frames 
        frames += 1;

        // Show correct frame
        showText("" + frames, 100, 100);

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        
    }
}