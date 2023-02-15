public class SimpleRobot {
    private int left;
    private int right;
    private int forward;
    private int back;

    public SimpleRobot() {
        left = 0;
        right = 0;
        forward = 0;
        back = 0;
    }

    public SimpleRobot(int left, int right, int forward, int back) {
        this.left = left;
        this.right = right;
        this.forward = forward;
        this.back = back;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getForward() {
        return forward;
    }

    public void setForward(int forward) {
        this.forward = forward;
    }

    public int getBack() {
        return back;
    }

    public void setBack(int back) {
        this.back = back;
    }

    public void forward() {
        forward++;
    }

    public void right() {
        right++;
    }

    @Override
    public String toString() {
        return "SimpleRobot{" +
                "left=" + left +
                ", right=" + right +
                ", forward=" + forward +
                ", back=" + back +
                '}';
    }
}
