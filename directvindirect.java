import java.awt.Point;
import java.util.*;


public class directvindirect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        directvindirect p = new directvindirect();
        p.addpointtograph(scan.nextInt(),scan.nextInt()); 

        for (int i=0; i<p.yes.size();i++){
            System.out.println(p.yes.get(i));
        }


    }
    ArrayList<Point> yes;
    public directvindirect(){
        yes = new ArrayList<Point>();
    }
    
    public void addpointtograph(int x, int y){
        
        yes.add(new Point(x,y));
        x++;
        square(x);
    
        
    }
    public void square(int xx){
        if (xx<=10) {
            addpointtograph(xx, xx*xx);
        }

        
    }
}