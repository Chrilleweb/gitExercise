public class Main {

    private SuperGreeter superGreeter = new SuperGreeter();

    public void start(){
        superGreeter.detVirker();
    }



    public static void main(String[] args) {
        Main program = new Main();
        program.start();
    }
}