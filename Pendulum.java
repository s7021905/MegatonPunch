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
        final int screenWidth = 40, screenHeight = 20; // 画面サイズ

        double theta = 3 * Math.PI / 4; // 振り子の初期角度（3/4π）
        double deltaTheta = -0.02; // 角度の変化量

        double minDistance = 3.0; // 最近点の距離 (正規化で使用)
        double maxDistance = 9.433981132056603; // 最遠点の距離 (正規化で使用)

        Scanner scanner = new Scanner(System.in);

        Thread inputThread = new Thread(() -> {
            scanner.nextLine();
        });

        inputThread.start();
        
        int xPendulum = 0, yPendulum = 0; // 振り子の座標
        
        while (inputThread.isAlive()) { // ユーザーの入力を待つ間、振り子を描画し続ける
            xPendulum = (int) (centerX + radius * Math.cos(theta) * adjustmentFactorX); // 円運動(極座標): x = r * cos(theta) 
            yPendulum = (int) (centerY + radius * Math.sin(theta) * adjustmentFactorY); // 円運動(極座標): y = r * sin(theta)

            clearConsole(); // clearConsole : 画面をクリアする (下に定義)
            for (int y = 0; y < screenHeight; y++) { // 画面の高さの回数だけ繰り返す
                for (int x = 0; x < screenWidth; x++) { // 画面の幅の回数だけ繰り返す
                    if (x == xPendulum && y == yPendulum) { // 振り子の位置に描画
                        System.out.print("●");
                    } else if (x == centerX && y == centerY + (int) (radius * adjustmentFactorY)) { // 最低点を描画
                        System.out.print("○"); // 最低点を1/2πの位置に描画
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            theta += deltaTheta; // 角度を変化させる
            if (theta <= Math.PI / 4 || theta >= 3 * Math.PI / 4) { // 角度が最小値または最大値に達したら
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
        double logDistance = Math.log(currentDistance + 1); // +1 はlog(0)を防ぐため
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
