public class Box {

    volatile boolean trigger = false;

    public boolean isTrigger() {
        return trigger;
    }

    public void push() {
        this.trigger = !this.trigger;
    }

}
