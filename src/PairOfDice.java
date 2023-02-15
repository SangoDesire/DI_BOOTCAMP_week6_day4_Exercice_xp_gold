import java.util.Random;

public class PairOfDice {
    private int diet1;
    private int diet2;

    public int getDiet1() {
        return diet1;
    }

    public void setDiet1(int diet1) {
        this.diet1 = diet1;
    }

    public int getDiet2() {
        return diet2;
    }

    public void setDiet2(int diet2) {
        this.diet2 = diet2;
    }

    public int dietSum() {
        return diet1 + diet2;
    }

    public void throwDiet() {
        diet1 = new Random().nextInt(6);
        diet2 = new Random().nextInt(6);
    }

    @Override
    public String toString() {
        return "PairOfDice{" +
                "diet1=" + diet1 +
                ", diet2=" + diet2 +
                '}';
    }
}
