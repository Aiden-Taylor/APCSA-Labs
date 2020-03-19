public class BandBooster{
    String name;
    int boxesSold;
    public BandBooster(String boostername){
        name = boostername;
        boxesSold = 0;
    }
    public String getName(){
        return name;
    }
    public void updateSales(int yeet){
        boxesSold += yeet;
    }
    public String toString(){
        return (name + ":   " + boxesSold + " boxes.");
    }
}