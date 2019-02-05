package createaliens;

/**
 *
 * @author sethd
 */
public class CreateAliens {

    public static void main(String[] args) {
        Martian newAlien1 = new Martian(2, 4, 2);
        Jupiterian newAlien2 = new Jupiterian(8, 2, 8);
        
        System.out.println(newAlien1.toString());
        System.out.println(newAlien2.toString());
        
    }
    public static void michaelWasHere(){
        System.out.println("Michael was here");
    }
}
