/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class Room 
{
    public String description;
    public Room northExit;
    public Room southExit;
    public Room eastExit;
    public Room westExit;
    public Room southEastExit;
    public Room northWestExit;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     * @params southeast The west exit.
     */
    public void setExits(Room norte, Room este, Room sur, Room oeste, Room suroeste, Room noroeste) 
    {
        if(norte != null)
            northExit = norte;
        if(este != null)
            eastExit = este;
        if(sur != null)
            southExit = sur;
        if(oeste != null)
            westExit = oeste;
        if(suroeste != null)
            southEastExit = suroeste;
            if(suroeste != null)
            northWestExit = noroeste;
    }
    
    public Room getExit(String coordenada)
    {
        Room direccion = null;
        if (coordenada.equals("norte"))
        {
            direccion = northExit;  
        }
        else  if (coordenada.equals("este"))
        {
            direccion = southExit;  
        }
        else  if (coordenada.equals("sur"))
        {
            direccion = southExit;  
        }
        else  if (coordenada.equals("oeste"))
        {
            direccion = westExit;  
        }
        else  if (coordenada.equals("suroeste"))
        {
            direccion = southEastExit;  
        }
        else  if (coordenada.equals("noroeste"))
        {
            direccion = northWestExit;  
        }
        return direccion;
    }
   

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}
