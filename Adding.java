import java.util.ArrayList;
public class Adding
{
    private ArrayList<Planets> AddedPlanets = new ArrayList<Planets>();
    private ArrayList<Sun> AddedSun = new ArrayList<Sun>();
    private ArrayList<Moon> AddedMoon = new ArrayList<Moon>();
    public Adding()
    {

    }

    public void addPlanet(Planets p)
    {
        AddedPlanets.add(p);
    }

    public ArrayList<Planets> getPlanets()
    {
        return AddedPlanets;
    }

    public void addSun(Sun s)
    {
        AddedSun.add(s);
    }

    public ArrayList<Sun> getSun()
    {
        return AddedSun;
    }

    public void addMoon(Moon m)
    {
        AddedMoon.add(m);
    }

    public ArrayList<Moon> getMoon()
    {
        return AddedMoon;
    }

}