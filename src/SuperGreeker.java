import com.sun.tools.javac.Main;

import java.util.Scanner;

public class SuperGreeker {
    public void start(){
        System.out.println("det virker");
        System.out.println("hva hedder du?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("hej " + name + " hvor gammel er du?");
    }

    public static void main(String[] args){
        SuperGreeker superGreeker = new SuperGreeker();
        superGreeker.start();
    }
}