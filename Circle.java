import java.io.IOException;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) throws InterruptedException, IOException {
        Circle circle = new Circle();
        int score = circle.run();
        System.out.println("対数正規化されたカーソル間の距離: " + score);
    }

    // ゲームを実行して対数正規化されたカーソル間の距離を返す
    // InterruptedException はスレッドが割り込まれたときにスローされる例外
    public int run() throws InterruptedException {
        final double radius = 2.5; // 半径
        final int centerOX = 5, centerOY = 10; // 中心座標 (カーソル1)
        final int centerXX = 10, centerXY = 5; // 中心座標 (カーソル2)
        final double adjustmentFactor = 2.0; // 調整係数 (ターミナルの文字の縦横比が1:2の場合は2.0)
        final long speed = 25;  // スピード（ミリ秒）
        final int screenWidth = 40, screenHeight = 20;  // 画面サイズ

        double thetaO = Math.PI / 4; // 初期角度 (カーソル1)
        double thetaX = 5 * Math.PI / 4; // 初期角度 (カーソル2)

        int lastXO = 0, lastYO = 0; // 前回のカーソル1の座標
        int lastXX = 0, lastYX = 0; // 前回のカーソル2の座標

        // 最大距離の計算
        // 2つの円の中心間の距離 + 2 * 半径 * 調整係数
        double maxDistance = Math.sqrt(Math.pow(centerOX - centerXX, 2) + Math.pow(centerOY - centerXY, 2)) + 2 * radius * adjustmentFactor;

        // ユーザーの入力を待つ
        Scanner scanner = new Scanner(System.in);

        // ユーザーの入力を待つスレッド
        Thread inputThread = new Thread(() -> {
            scanner.nextLine(); 
        });

        // ユーザーの入力を待つスレッドを開始
        inputThread.start();

        // ユーザーの入力を待つ間、円を描画し続ける
        while (inputThread.isAlive()) {
            // カーソル1の座標を計算
            int xO = (int) (centerOX + radius * Math.cos(thetaO) * adjustmentFactor); // 円運動(極座標): x = r * cos(theta)
            int yO = (int) (centerOY + radius * Math.sin(thetaO)); // 円運動(極座標): y = r * sin(theta)

            // カーソル2の座標を計算
            int xX = (int) (centerXX + radius * Math.cos(thetaX) * adjustmentFactor);
            int yX = (int) (centerXY + radius * Math.sin(thetaX));

            // カーソル1の座標とカーソル2の座標を保存
            lastXO = xO; 
            lastYO = yO;
            lastXX = xX;
            lastYX = yX;

            // 画面をクリアして円を描画
            clearConsole(); // clearConsole : 画面をクリアする (下に定義)
            for (int y = 0; y < screenHeight; y++) { // 画面の高さの回数だけ繰り返す
                for (int x = 0; x < screenWidth; x++) { // 画面の幅の回数だけ繰り返す
                    if (x == xO && y == yO) { // カーソル1の座標の場合
                        System.out.print("𐀏");
                    } else if (x == xX && y == yX) { // カーソル2の座標の場合
                        System.out.print("𐀏");
                    } else {
                        System.out.print(" "); // それ以外の場合は空白を表示
                    }
                }
                System.out.println();
            }

            // カーソル1の角度とカーソル2の角度を更新
            thetaO += 0.1;
            thetaX += 0.1;

            Thread.sleep(speed);
        }

        // 対数正規化された距離の計算
        double distance = Math.sqrt(Math.pow(lastXO - lastXX, 2) + Math.pow(lastYO - lastYX, 2)); // 2つの円の中心間の距離 + 2 * 半径 * 調整係数
        double logDistance = Math.log(distance + 1);  // 距離の対数を計算 (+1 はlog(0)を防ぐため)
        double logMaxDistance = Math.log(maxDistance + 1); // 正規化のための最大距離の対数を計算 (+1 はlog(0)を防ぐため)
        int logNormalizedDistance = (int) (((logDistance - logMaxDistance) / logMaxDistance) * 99 + 99);// 対数正規化された距離を計算

        return logNormalizedDistance;
    }

    private static void clearConsole() {
        System.out.print("\033[H\033[2J"); // ANSIエスケープシーケンスを使って画面をクリア
        System.out.flush(); // バッファをフラッシュ
    }
}
