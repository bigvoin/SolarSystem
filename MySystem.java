public class MySystem
{
    private SolarSystem solar = new SolarSystem(700,700);
    private Sun mysun = new Sun("Sun",0,0,50,"yellow");
    private Planets myplanet = new Planets("Earth",64,180,20,"blue",0.29);
    
    public MySystem()
    {
        this.action();
    }

    public void drawPlanetOrbitStar(Sun s, Planets p)
    {
        solar.drawSolarObject(s.getDistance(),s.getAngle(),s.getDiameter(),s.getColour());
        solar.drawSolarObject(p.getDistance(),p.getAngle(),p.getDiameter(),p.getColour());
    }

    public void action()
    {
        while(true)
        {
        this.drawPlanetOrbitStar(mysun, myplanet);
        myplanet.move();
        solar.finishedDrawing();
        }
    }

}