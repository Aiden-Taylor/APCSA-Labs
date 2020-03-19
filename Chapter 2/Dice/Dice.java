
public class Dice{
    public static void main (String[] args){
        double rand1 = Math.random();
        double dice1 = Math.round(rand1 * 5);
        double rand2 = Math.random();
        double dice2 = Math.round(rand2 * 5);
        System.out.println("Dice 1: " + (dice1 + 1));
        System.out.println("Dice 2: " + (dice2 + 1));
        System.out.println("Sum: " + (dice1 + dice2 + 2));
    }
}