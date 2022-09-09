import com.sun.tools.javac.Main;
import java.util.Scanner;

public class SuperGreeker {

    Scanner scan = new Scanner(System.in);

    public void AskaboutAdress(){
        System.out.println("what is your adress?");
        String adress = scan.next();
    }

    public void Greek() {
        System.out.println("det virker");
        System.out.println("hva hedder du?");
        String name = scan.next();
        System.out.println("hej " + name + " hvor gammel er du?");
        double age = scan.nextDouble();
        System.out.println(age);
    }

    public void start() {
        Greek();
        AskaboutAdress();
    }

    public static void main(String[] args) {
        SuperGreeker superGreeker = new SuperGreeker();
        superGreeker.start();
    }
}