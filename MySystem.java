/**
 * This class provides a graphical model of the solar system
 * @author Nikolay Gachev
 */
public class MySystem
{
    /**Declared and Initialized variables and instances of classes */
    private SolarSystem solar = new SolarSystem(1000,1000);
    private Sun mysun = new Sun("Sun",0,0,100,"yellow");
    private int numberPlanets = 5;
    private int numberMoons = 41;
    private int numberAsteroids = 360;
    private double jupiterMoonAngle=50;
    private int asteroidDistance = (int)(Math.random()*(350-310))+310;
    private double asteroidAngle=100;
    private Asteroid[] a = new Asteroid[numberAsteroids];
    private Planets[] p = new Planets[numberPlanets];
    private Moon[] moons = new Moon[numberMoons];
    
    /** Start the main method of the program*/
    public MySystem()
    {
        this.action();
    }

    /**
     * A method using the methods of the SolarSystem class drawing planets orbiting around the sun
     */
    public void PlanetOrbitStar(Sun s, Planets p)
    {
        solar.drawSolarObject(s.getDistance(),s.getAngle(),s.getDiameter(),s.getColour());
        solar.drawSolarObject(p.getDistance(),p.getAngle(),p.getDiameter(),p.getColour());
    }

    /**
     * A method using the SolarSystem class method enable to draw a moon orbiting around a planet
     * @param p is a instance of a planets class
     * @param m is a instance of a moon class
     */
    public void MoonOrbitPlanet(Planets p, Moon m)
    {
        solar.drawSolarObjectAbout(m.getDistance(), m.getAngle(), m.getDiameter(), m.getColour(), p.getDistance(), p.getAngle());
    }

    /**
     * Method drawing an asteroid orbiting around the sun
     * @param s a sun class
     * @param a a asetroid class
     */
    public void MoonOrbitSun(Sun s, Asteroid a)
    {
        solar.drawSolarObjectAbout(s.getDistance(), s.getAngle(), s.getDiameter(), s.getColour(), a.getDistance(), a.getAngle());
    }

    /**
     * Method drawing a single asteroid
     * @param a Instance of the Asterdoid class
     */
    public void drawAsteroid(Asteroid a)
    {
        solar.drawSolarObject(a.getDistance(), a.getAngle(), a.getDiameter(), a.getColour());
    }
    
    /**
     * This method is creating the instances of the classes and initializing the objects
     * With a infinity while loop the program enable the planets to orbit around other objects
     * Using the previous methods, the onjects are drawn on the JFrame.
     * The method move is moving the objects
     * Using finishedDrawing to reset the JFrame allowing to see the movement of the objects
     */
    public void action()
    {
        p[0] = new Planets("Mercury",85,20,15,"gray",0.20); 
        p[1] = new Planets("Venus",150,40,40,"orange",0.25);
        p[2] = new Planets("Earth",230,20,30,"blue",0.30);
        p[3] = new Planets("Mars",280,40,20,"red",0.20);
        p[4] = new Planets("Jupiter",410,20,100,"orange",0.30);

        moons[0] = new Moon("The Moon",25,20,5,"white",0.40);


        for(int k=0; k<numberAsteroids; k++)
        {
            a[k] = new Asteroid("test", asteroidDistance, asteroidAngle, 5, "white", 0.3);
            asteroidAngle++;
            asteroidDistance = (int)(Math.random()*(340-320))+320;
        }

        for(int m=1; m<numberMoons; m++)
        {
            moons[m] = new Moon("JupiterMoons",60,jupiterMoonAngle,5,"gray",0.3);
            jupiterMoonAngle=jupiterMoonAngle+15;
        }

        while(true)
        {
            for(int i=0; i<numberPlanets; i++)
            {
                this.PlanetOrbitStar(mysun, p[i]);
                p[i].move();
            }
                this.MoonOrbitPlanet(p[2], moons[0]);
                moons[0].move();

                for(int j=1; j<numberMoons; j++)
                {
                    
                    this.MoonOrbitPlanet(p[4], moons[j]);
                    moons[j].move();
                }
            for(int i=0; i<numberAsteroids; i++)
        {
            this.drawAsteroid(a[i]);
            a[i].move();
         }
            solar.finishedDrawing();
        }
    }
    

}