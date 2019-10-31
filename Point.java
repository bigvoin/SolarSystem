public class Point
{
    private double distance;
    private double angel;
    public Point(double d, double a)
    {
        distance = d;
        angel = a;
    }

    public double getDistance()
    {
        return distance;
    }

    public double getAngle()
    {
        return angel;
    }

    public void setDistance(double d)
    {
        distance = d;
    }

    public void setAngle(double a)
    {
        angel = a;
    }
}