public class Asteroid extends CelestialObjects
{
    private double velocity;
    public Asteroid(String name, double distance, double angle, double diameter, String colour, double v)
    {
        super(name,distance,angle,diameter,colour);
        velocity=v;
    }

    public void move()
    {
        this.setAngle(this.getAngle()+velocity);
    }
}