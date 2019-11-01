public class Asteroid extends CelestialObjects
{
    private double velocity;
    /**
     * A constructor of an object of Asteroid inheritance the CelestialObjects class
     * @param name name of the Asteroid
     * @param distance the location of the Asteroid
     * @param angle the angle, that the object will rotated
     * @param diameter the size of the object
     * @param colour the colour of the object
     * @param vel the velocity
     */
    public Asteroid(String name, double distance, double angle, double diameter, String colour, double v)
    {
        super(name,distance,angle,diameter,colour);
        velocity=v;
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