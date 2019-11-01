public class Point
{
    private double distance;
    private double angel;
    /**
     * A consturctor providing the location of the objects
     * @param d the distance
     * @param a the angle
     */
    public Point(double d, double a)
    {
        distance = d;
        angel = a;
    }

    /**
     * A get method for Distance
     * @return the distance of the object
     */
    public double getDistance()
    {
        return distance;
    }

    /**
     * A get method for Angle
     * @return the angle of the object
     */
    public double getAngle()
    {
        return angel;
    }

    /**
     * A set method changing the previous distance with the param
     * @param d the new distance of the object
     */
    public void setDistance(double d)
    {
        distance = d;
    }

    /**
     * A set method changing the previous angle with the param
     * @param a the new angle of the object
     */
    public void setAngle(double a)
    {
        angel = a;
    }
}