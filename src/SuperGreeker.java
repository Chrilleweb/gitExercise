import com.sun.tools.javac.Main;

public class SuperGreeker {
    public void start(){
        System.out.println("det virker");
    }

    public static void main(String[] args){
        SuperGreeker superGreeker = new SuperGreeker();
        superGreeker.start();
    }
}