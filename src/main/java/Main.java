public class Main {

    public static void main(String[] args) {
        Toy toy = new Toy(new Box());
        toy.start();
        User user = new User(toy);
        user.start();
        try {
            user.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        toy.interrupt();
    }

}
