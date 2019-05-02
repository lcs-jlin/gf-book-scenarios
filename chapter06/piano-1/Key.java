import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variable
     */
    // Tracks whether is "piano key down" image has already been set or not
    // (isDown is a primitive data type - shows in red, type is lowercaes)
    private boolean isDown;
    // Track what key is  being played ABND what sounf file to play
    // (key and sound are object stata types - shows in black, type is Capitalized)
    private String key;
    private String sound;
    private boolean keyWhite;
    
    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile, boolean isKeyWhite)
    {
        // Key begins in the "up" position
        isDown = false;
        // Initialize the key and sound instance variables
        key = keyName;
        sound = soundFile;
        keyWhite = isKeyWhite;
        
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        if (isDown == false && Greenfoot.isKeyDown(key))
        {
            setImage("white-key-down.png");
            isDown = true;
            play();
        }
        if (isDown == true && Greenfoot.isKeyDown (key) == false)
        {
            setImage("white-key.png");
        }
        if (isDown == false && Greenfoot.isKeyDown(key))
        {
            setImage("black-key-down.png");
            isDown = true;
            play();
        }
        if (isDown == true && Greenfoot.isKeyDown (key) == false)
        {
            setImage("black-key.png");
        }
    }
    /**
     * Play the note of this key.
     */
    public void play()
    {
        Greenfoot.playSound(sound + ".wav");
    }
}

