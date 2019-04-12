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
        if ((frames % 60 == 0) && (frames % 60 < 10)) 
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
        Key key = new Key();
        addObject(key,47,159);
        Key key2 = new Key();
        addObject(key2,116,159);
        Key key3 = new Key();
        addObject(key3,185,159);
        Key key4 = new Key();
        addObject(key4,254,159);
        Key key5 = new Key();
        addObject(key5,323,159);
        Key key6 = new Key();
        addObject(key6,392,159);
        Key key7 = new Key();
        addObject(key7,461,159);
        Key key8 = new Key();
        addObject(key8,530,159);
        Key key9 = new Key();
        addObject(key9,599,159);
        Key key10 = new Key();
        addObject(key10,668,159);
        Key key11 = new Key();
        addObject(key11,737,159);
    }
}