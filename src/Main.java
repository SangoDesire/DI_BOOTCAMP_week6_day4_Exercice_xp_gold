public class Main {
    public static void main(String[] args) {
        //Test Exercice 1
        Dog dog = new Dog();
        dog.setDrinkTime(2);
        System.out.println("Promenade possible ? " + dog.needsToGo());
        dog.setDrinkTime(5);
        System.out.println("Promenade possible ? " + dog.needsToGo());

        //Test Exercice 2
        PairOfDice pairOfDice = new PairOfDice();
        pairOfDice.throwDiet();
        int nbLance = 0;
        int totalDiet = 0;
        do {
            pairOfDice.throwDiet();
            totalDiet++;
        } while (pairOfDice.dietSum() != 2);

        System.out.println("Total lancé: " + totalDiet);
    }
}