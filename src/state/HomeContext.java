package state;

public class HomeContext {
    private State state;

    public void setState(State state) {
        System.out.println("修改状态：");
        this.state = state;

        this.state.handle();
    }
}
