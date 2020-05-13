
/**
 * Write a description of class Part1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Part1
{
    //1a
    public int countElectronicsByMaker(String maker)
    {
        int count=0;
        for(int i=0; i<purchases.size(); i++)
        {
            Gizmo currentGizmo = purchases.get(i);
            if(currentGizmo.isElectronic()==true && currentGizmo.getMaker().equals(maker))
            { 
                count++;
            }
        }
        return count;
    }
    
    //1b
    public boolean hasAdjacentEqualPair()
    {
        for(int i=0; i<purchases.size()-1; i++)
        {
            Gizmo currentGizmo = purchases.get(i);
            Gizmo nextGizmo = purchases.get(i+1);
            if(currentGizmo.equals(nextGizmo))
            {
                return true;
            }
        }
        return false;
    }
    
    //1c
    /**
     * In order to add a method getCheapestGizmoByMaker,
     * which would have the method header
     * public Gizmo getCheapestGizmoByMaker(String maker),
     * I would add an instance field private int price to the gizmo class
     * and a public method getPrice() to the Gizmo class, which would 
     * return an integer.
     */
}
