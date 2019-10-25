public class MySystem
{
    private SolarSystem solar = new SolarSystem(700,700);
    private Sun mysun = new Sun("Sun",0,0,50,"yellow");
    private Planets[] p = new Planets[4];
    private Moon[] m = new Moon[3];
    
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

    public void action()
    {
        p[0] = new Planets("Mercury",50,120,15,"cyan",0.20); 
        p[1] = new Planets("Venus",70,150,20,"white",0.20);
        p[2] = new Planets("Earth",90,180,30,"blue",0.30);
        p[3] = new Planets("Mars",120,210,30,"red",0.20);

        m[0] = new Moon("The Moon",25,20,5,"white",0.50);
        while(true)
        {
            for(int i=0; i<4; i++)
            {
                this.PlanetOrbitStar(mysun, p[i]);
                p[i].move();
            }
                this.MoonOrbitPlanet(p[2], m[0]);
                m[0].move();

            solar.finishedDrawing();
        }
    }

}