public class Planets extends CelestialObjects
{
    private double velocity;
    /**
     * A constructor of the class Planets, wich exteds the CelestialObjects and creating a planet with: 
     * @param name  name of the planet
     * @param distance  the location
     * @param angle     the angle of rotation
     * @param diameter  the size
     * @param colour    the colour
     * @param v         velocity, or with what speed will the planet rotate
     */
    public Planets(String name, double distance, double angle, double diameter, String colour, double v)
    {
        super(name,distance,angle,diameter,colour);
        velocity = v;
    }

    /**
     * A method allowing to move the object, changing the angle with the velocity of the object
     * Using a Method from the super class setAngle
     */
    public void move()
    {
        this.setAngle(this.getAngle()+velocity);
    }
}
