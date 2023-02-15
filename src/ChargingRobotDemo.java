public class ChargingRobotDemo {

    private static int mur = 5; //On suppose que le mur se trouve à la position 10

    public static void charge(SimpleRobot r, int maxDist) {
        // you write this part
        while (r.getForward()!=maxDist && !blocked(r)){
            r.forward();
            System.out.println(r); //Affichage de la position à chaque fois
        }
    }

    public static void main(String args[]) {
        SimpleRobot r = new SimpleRobot();
        r.forward();
        r.right();
        charge(r, 3);
    }

    private static boolean blocked(SimpleRobot robot) {
        return robot.getForward() == mur;
    }
}
