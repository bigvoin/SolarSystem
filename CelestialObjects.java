public class CelestialObjects extends Point
{
    //String name, double distance, double angle, double diameter, String col
    private String ObjectName;
    private double ObjectDistance;
    private double ObjectAngle;
    private double ObjectDiameter;
    private String ObjectColour;
    
    /**
     * A constructor of the class CelestialObjects, which extends the Point class allowing to create objects such as planets, moons and asteroids
     * @param name name of the Object
     * @param distance the location of the Object
     * @param angle the angle, that the object will rotated
     * @param diameter the size of the object
     * @param colour the colour of the object
     */
    public CelestialObjects(String name, double distance, double angle, double diameter, String colour)
    {
        super(distance,angle);
        ObjectName = name;
        ObjectDistance = distance;
        ObjectAngle = angle;
        ObjectDiameter = diameter;
        ObjectColour = colour;
    }
    /**
     * get method 
     * @return the object's diameter
     */
    public double getDiameter()
    {
        return ObjectDiameter;
    }

    /**
     * a get colour method
     * @return the colour
     */
    public String getColour()
    {
        return ObjectColour;
    }

    /**
     * a get name method
     * @return the name
     */
    public String getName()
    {
        return ObjectName;
    }

    /**
     * a set method changing the object's diameter with the param
     * @param di a new diameter
     */
    public void setDiameter(double di)
    {
        ObjectDiameter = di;
    }

    /**
     * A set method changing the previous colour with the param
     * @param c the new colour of the object
     */
    public void setColour(String c)
    {
        ObjectColour = c;
    }

    /**
     * A set method changing the previous name with the param
     * @param n the new name of the object
     */
    public void setName(String n)
    {
        ObjectName = n;
    }
}