public class Yorkshire extends Dog
{
private int breedWeight = 15;
public Yorkshire(String name)
{
super(name);
}
// ------------------------------------------------------------
// Small bark -- overrides speak method in Dog
// ------------------------------------------------------------
public String speak()
{
return "yap yap";
}
public int avgBreedWeight(){
    return breedWeight;
}
}