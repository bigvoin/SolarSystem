public class MySystem
{
    private SolarSystem solar = new SolarSystem(700,700);
    private Sun mysun = new Sun("Sun",0,0,50,"yellow");
    private Planets[] p = new Planets[4];
    public void create(){
    
    }
    
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
        p[0] = new Planets("Mercury",50,120,15,"cyan",1); 
        p[1] = new Planets("Venus",70,150,20,"white",1);
        p[2] = new Planets("Earth",90,180,30,"blue",1);
        p[3] = new Planets("Mars",120,210,30,"red",1);
        while(true)
        {
            for(int i=0; i<4; i++)
            {
                this.drawPlanetOrbitStar(mysun, p[i]);
                p[i].move();
            }
            solar.finishedDrawing();
        }
    }

}