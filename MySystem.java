public class MySystem
{
    private SolarSystem solar = new SolarSystem(700,700);
    private Sun mysun = new Sun("Sun",0,0,50,"yellow");
    private Planets firstp = new Planets("Mercury",50,120,15,"cyan",1);
    private Planets secondp = new Planets("Venus",70,150,20,"white",1);
    private Planets thirdp = new Planets("Earth",90,180,30,"blue",1);
    private Planets fourthp = new Planets("Mars",120,210,30,"red",1);
    
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
        this.drawPlanetOrbitStar(mysun, firstp);
        firstp.move();
        this.drawPlanetOrbitStar(mysun, secondp);
        secondp.move();
        this.drawPlanetOrbitStar(mysun, thirdp);
        thirdp.move();
        this.drawPlanetOrbitStar(mysun, fourthp);
        fourthp.move();
        solar.finishedDrawing();
        }
    }

}