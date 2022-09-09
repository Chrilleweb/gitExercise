import com.sun.tools.javac.Main;
import java.util.Scanner;

public class SuperGreeker {




    public void Greek(){
        System.out.println("det virker");
        System.out.println("hva hedder du?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("hej " + name + " hvor gammel er du?");
        double age = scanner.nextDouble();
        System.out.println(age);
    }

    public void start(){
        Greek();
    }

    public static void main(String[] args){
        SuperGreeker superGreeker = new SuperGreeker();
        superGreeker.start();
    }
}