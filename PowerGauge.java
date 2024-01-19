import java.io.IOException;
import java.util.Scanner;

public class PowerGauge {
    public static void main(String[] args) throws InterruptedException, IOException {
        PowerGauge powerGauge = new PowerGauge();
        int score = powerGauge.run();
        System.out.println("対数正規化された値: " + score);
    }

    public int run() throws InterruptedException {
        final int gaugeHeight = 10;  // ゲージの高さ
        final int gaugeX = 20;  // ゲージのX座標
        final long speed = 10;  // 更新スピード（ミリ秒）
        final int screenWidth = 40, screenHeight = 20;

        int animationCharge = 0;  // アニメーション用のチャージ変数
        boolean isIncreasing = true;  // チャージが増加しているかどうか

        Scanner scanner = new Scanner(System.in);

        Thread inputThread = new Thread(() -> {
            scanner.nextLine();
        });

        inputThread.start();


        int countFilled = 0;  // 埋まっている▧の数
        while (inputThread.isAlive()) {
            clearConsole();
            countFilled = 0;  // ▧の数をリセット
            for (int y = 0; y < screenHeight; y++) {
                for (int x = 0; x < screenWidth; x++) {
                    // ゲージの枠線
                    if (x == gaugeX - 1 || x == gaugeX + 1) {
                        if (y == screenHeight - gaugeHeight - 1) {
                            System.out.print(x == gaugeX - 1 ? "┌" : "┐");
                        } else if (y == screenHeight) {
                            System.out.print(x == gaugeX - 1 ? "└" : "┘");
                        } else if (y > screenHeight - gaugeHeight - 1 && y < screenHeight) {
                            System.out.print("│");
                        }
                    } else if ((y == screenHeight - gaugeHeight - 1 || y == screenHeight) && x > gaugeX - 1 && x < gaugeX + 1) {
                        System.out.print("─");
                    // ゲージの表示
                    } else if (x == gaugeX && screenHeight - y <= (animationCharge * gaugeHeight) / 99) {
                        System.out.print("▧");
                        countFilled++;  // 埋まっている▧の数をカウント
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            if (isIncreasing) {
                animationCharge++;
                if (animationCharge == 99) {
                    isIncreasing = false;
                }
            } else {
                animationCharge--;
                if (animationCharge == 0) {
                    isIncreasing = true;
                }
            }
            
            if(countFilled == 10) {
                Thread.sleep(speed * 5);
            }

            Thread.sleep(speed);
        }

        // 対数正規化された値の計算
        double normalizedCharge = 100.0 - countFilled * 10;

        return (int)normalizedCharge;
    }

    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
