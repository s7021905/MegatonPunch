import java.io.IOException;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) throws InterruptedException, IOException {
        Circle circle = new Circle();
        int score = circle.run();
        System.out.println("対数正規化されたカーソル間の距離: " + score);
    }

    public int run() throws InterruptedException {
        final double radius = 2.5;
        final int centerOX = 5, centerOY = 10;
        final int centerXX = 10, centerXY = 5;
        final double adjustmentFactor = 2.0;
        final long speed = 25;  // スピード（ミリ秒）
        final int screenWidth = 40, screenHeight = 20;

        double thetaO = Math.PI / 4;
        double thetaX = 5 * Math.PI / 4;

        int lastXO = 0, lastYO = 0;
        int lastXX = 0, lastYX = 0;

        // 最大距離の計算
        double maxDistance = Math.sqrt(Math.pow(centerOX - centerXX, 2) + Math.pow(centerOY - centerXY, 2)) + 2 * radius * adjustmentFactor;

        Scanner scanner = new Scanner(System.in);

        Thread inputThread = new Thread(() -> {
            scanner.nextLine();
        });

        inputThread.start();

        while (inputThread.isAlive()) {
            int xO = (int) (centerOX + radius * Math.cos(thetaO) * adjustmentFactor);
            int yO = (int) (centerOY + radius * Math.sin(thetaO));

            int xX = (int) (centerXX + radius * Math.cos(thetaX) * adjustmentFactor);
            int yX = (int) (centerXY + radius * Math.sin(thetaX));

            lastXO = xO;
            lastYO = yO;
            lastXX = xX;
            lastYX = yX;

            clearConsole();
            for (int y = 0; y < screenHeight; y++) {
                for (int x = 0; x < screenWidth; x++) {
                    if (x == xO && y == yO) {
                        System.out.print("𐀏");
                    } else if (x == xX && y == yX) {
                        System.out.print("𐀏");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            thetaO += 0.1;
            thetaX += 0.1;

            Thread.sleep(speed);
        }

        // 対数正規化された距離の計算
        double distance = Math.sqrt(Math.pow(lastXO - lastXX, 2) + Math.pow(lastYO - lastYX, 2));
        double logDistance = Math.log(distance + 1);  // +1 はゼロ距離を防ぐため
        double logMaxDistance = Math.log(maxDistance + 1);
        int logNormalizedDistance = (int) (((logDistance - logMaxDistance) / logMaxDistance) * 99 + 99);

        return logNormalizedDistance;
    }

    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
