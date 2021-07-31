public class Toy extends Thread {

    Box box;

    public Toy(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        System.out.println("Игрушка включена");
        while (!interrupted()) {
            if (box.isTrigger()) {
                System.out.println("Зверёк выключает тумблер");
                box.push();
            }
        }
        System.out.println("Игрушка выключется");
    }

    public void play() {
        this.box.push();
    }

}
