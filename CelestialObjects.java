public class CelestialObjects
{
    //double distance, double angle, double diameter, String col
    private String ObjectName;
    private double ObjectDistance;
    private double ObjectAngle;
    private double ObjectDiameter;
    private String ObjectColour;

    public CelestialObjects(String name, double distance, double angle, double diameter, String colour)
    {
        ObjectName = name;
        ObjectDistance = distance;
        ObjectAngle = angle;
        ObjectDiameter = diameter;
        ObjectColour = colour;
    }

    public double getDistance()
    {
        return ObjectDistance;
    }

    public double getAngle()
    {
        return ObjectAngle;
    }

    public double getDiameter()
    {
        return ObjectDiameter;
    }

    public String getColour()
    {
        return ObjectColour;
    }

    public String getName()
    {
        return ObjectName;
    }

    public void setDistance(double d)
    {
        ObjectDistance = d;
    }

    public void setAngle(double a)
    {
        ObjectAngle = a;
    }

    public void setDiameter(double di)
    {
        ObjectDiameter = di;
    }

    public void setColour(String c)
    {
        ObjectColour = c;
    }

    public void setName(String n)
    {
        ObjectName = n;
    }
}