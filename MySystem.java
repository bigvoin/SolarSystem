public class MySystem
{
    private SolarSystem solar = new SolarSystem(1000,1000);
    private Sun mysun = new Sun("Sun",0,0,100,"yellow");
    private int numberPlanets = 5;
    private int numberMoons = 41;
    private int numberAsteroids = 360;
    private double y=100;
    private double x=50;
    private Asteroid[] a = new Asteroid[numberAsteroids];
    private Planets[] p = new Planets[numberPlanets];
    private Moon[] moons = new Moon[numberMoons];
    
    public MySystem()
    {
        this.action();
    }

    public void PlanetOrbitStar(Sun s, Planets p)
    {
        solar.drawSolarObject(s.getDistance(),s.getAngle(),s.getDiameter(),s.getColour());
        solar.drawSolarObject(p.getDistance(),p.getAngle(),p.getDiameter(),p.getColour());
    }

    public void MoonOrbitPlanet(Planets p, Moon m)
    {
        solar.drawSolarObjectAbout(m.getDistance(), m.getAngle(), m.getDiameter(), m.getColour(), p.getDistance(), p.getAngle());
    }

    public void MoonOrbitSun(Sun s, Asteroid a)
    {
        solar.drawSolarObjectAbout(s.getDistance(), s.getAngle(), s.getDiameter(), s.getColour(), a.getDistance(), a.getAngle());
    }

    public void drawAsteroid(Asteroid a)
    {
        solar.drawSolarObject(a.getDistance(), a.getAngle(), a.getDiameter(), a.getColour());
    }
    

    public void action()
    {
        p[0] = new Planets("Mercury",100,20,15,"cyan",0.20); 
        p[1] = new Planets("Venus",150,40,20,"white",0.20);
        p[2] = new Planets("Earth",250,20,30,"blue",0.20);
        p[3] = new Planets("Mars",300,40,30,"red",0.20);
        p[4] = new Planets("Jupiter",400,20,100,"orange",0.20);

        moons[0] = new Moon("The Moon",25,20,5,"white",0.50);


        for(int k=0; k<numberAsteroids; k++)
        {
            a[k] = new Asteroid("test", 470, y, 5, "white", 0.2);
            y=y+1;
        }

        for(int m=1; m<numberMoons; m++)
        {
            moons[m] = new Moon("Moon",60,x,5,"gray",0.3);
            x=x+15;
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