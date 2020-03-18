public class DogTest
{
public static void main(String[] args)
{
Dog dog = new Dog("Spike");
Labrador lab = new Labrador("Jerry", "chocolate");
Yorkshire york = new Yorkshire("dipshit");
System.out.println(dog.getName() + " says " + dog.speak());
System.out.println(lab.getName() + " says " + lab.speak());
System.out.println(york.getName() + " says " + york.speak());
}
}