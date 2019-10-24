public class Moon extends CelestialObjects
{
    private double velocity;

    public Moon(String name, double distance, double angle, double diameter, String colour, double vel)
    {
        super(name,distance,angle,diameter,colour);
        velocity = vel;
    }

    public void move()
    {
        this.setAngle(this.getAngle() + velocity);
    }
}