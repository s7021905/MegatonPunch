import java.io.IOException;
import java.util.Scanner;

public class Pendulum {
    public static void main(String[] args) throws InterruptedException, IOException {
        Pendulum pendulum = new Pendulum();
        int score = pendulum.run();
        System.out.println("対数正規化された距離: " + score);
    }

    public int run() throws InterruptedException {
        final int centerX = 20, centerY = 5; // 円の中心
        final double radius = 5.0; // 振り子の長さ
        final double adjustmentFactorX = 2.0; // x座標の調整係数
        final double adjustmentFactorY = 1.5; // y座標の調整係数
        final long speed = 10; // スピード（ミリ秒）
        final int screenWidth = 40, screenHeight = 20;

        double theta = 3 * Math.PI / 4; // 振り子の初期角度（3/4π）
        double deltaTheta = -0.02; // 角度の変化量

        double minDistance = 3.0; // 最近点の距離
        double maxDistance = 9.433981132056603; // 最遠点の距離

        Scanner scanner = new Scanner(System.in);

        Thread inputThread = new Thread(() -> {
            scanner.nextLine();
        });

        inputThread.start();
        
        int xPendulum = 0, yPendulum = 0;
        
        while (inputThread.isAlive()) {
            xPendulum = (int) (centerX + radius * Math.cos(theta) * adjustmentFactorX);
            yPendulum = (int) (centerY + radius * Math.sin(theta) * adjustmentFactorY);

            clearConsole();
            for (int y = 0; y < screenHeight; y++) {
                for (int x = 0; x < screenWidth; x++) {
                    if (x == xPendulum && y == yPendulum) {
                        System.out.print("●");
                    } else if (x == centerX && y == centerY + (int) (radius * adjustmentFactorY)) {
                        System.out.print("○"); // 最低点を1/2πの位置に描画
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            theta += deltaTheta;
            if (theta <= Math.PI / 4 || theta >= 3 * Math.PI / 4) {
                deltaTheta = -deltaTheta; // 角度の変化方向を逆にする
            }
            // System.out.println("theta: " + theta);
            // System.out.println("maxDistance: " + radius * Math.PI / 2 *
            // adjustmentFactorY);
            // System.out.println("distance: " + Math.sqrt(Math.pow(centerX - xPendulum, 2)
            // + Math.pow((centerY + radius) * adjustmentFactorY - yPendulum, 2)));

            Thread.sleep(speed);
        }

        // 距離計算時にy座標のスケーリングを考慮
        double currentDistance = Math.sqrt(
                Math.pow(centerX - xPendulum, 2) + Math.pow((centerY + radius) * adjustmentFactorY - yPendulum, 2));

        // 対数正規化された距離の計算
        double logDistance = Math.log(currentDistance + 1); // +1 はゼロ距離を防ぐため
        double logMaxDistance = Math.log(maxDistance + 1);
        double logMinDistance = Math.log(minDistance + 1);
        int logNormalizedDistance = (int) (((logDistance - logMinDistance) / (logMaxDistance - logMinDistance)) * 99);

        return logNormalizedDistance;
    }

    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
