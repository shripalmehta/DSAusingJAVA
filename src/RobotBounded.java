// LC 1041
public class RobotBounded {
    boolean isRobotBounded(String instructions) {
        int dirX = 0, dirY = 1;
        int posX = 0, posY = 0;

        for (char ch : instructions.toCharArray()) {
            if (ch == 'G') {
                posX += dirX;
                posY += dirY;
            } else if (ch == 'L') { // flip X & Y directions
                int temp = dirX;
                dirX = -1 * dirY;
                dirY = temp;
            } else {                // (ch == 'R')  // flip X & Y directions
                int temp = dirX;
                dirX = dirY;
                dirY = -1 * temp;
            }
        }

        return ((posX==0 && posY==0) || !(dirX==0 && dirY==1));
    }

    public static void main(String[] args) {
        RobotBounded robotBounded = new RobotBounded();
        System.out.println(robotBounded.isRobotBounded("GGLGGL"));
    }
}
