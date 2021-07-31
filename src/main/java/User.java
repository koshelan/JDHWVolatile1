public class User extends Thread {

    public static final int TIME_DELAY = 1000;
    public static final int TIMES_REPEAT = 4;

    Toy toy;

    public User(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void run() {
        System.out.println("Начинаем играть");
        playing();
        System.out.println("Наскучило. Заканчиваю игру");
    }

    private void playing() {
        for (int i = 0; i < TIMES_REPEAT; i++) {
            try {
                Thread.sleep(TIME_DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Включаю тумблер");
            this.toy.play();
        }
    }

}
