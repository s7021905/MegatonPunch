// 担当者 : 石倉龍 (7021905)

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
        final int screenWidth = 40, screenHeight = 20; // 画面サイズ

        int animationCharge = 0;  // アニメーション用のチャージ変数
        boolean isIncreasing = true;  // チャージが増加しているかどうか

        // ユーザーの入力を待つ
        Scanner scanner = new Scanner(System.in);

        // ユーザーの入力を待つスレッド
        Thread inputThread = new Thread(() -> {
            scanner.nextLine();
        });

        // ユーザーの入力を待つスレッドを開始
        inputThread.start();


        int countFilled = 0;  // 埋まっている▧の数
        
        // ユーザーの入力を待つ間、ゲージを描画し続ける
        while (inputThread.isAlive()) {
            clearConsole(); // clearConsole : 画面をクリアする (下に定義)
            countFilled = 0;  // ▧の数をリセット
            for (int y = 0; y < screenHeight; y++) { // 画面の高さの回数だけ繰り返す
                for (int x = 0; x < screenWidth; x++) { // 画面の幅の回数だけ繰り返す
                    // ゲージの枠線
                    if (x == gaugeX - 1 || x == gaugeX + 1) { // ゲージの左右の枠線
                        if (y == screenHeight - gaugeHeight - 1) { // ゲージの上端の枠線
                            System.out.print(x == gaugeX - 1 ? "┌" : "┐");
                        } else if (y == screenHeight) { // ゲージの下端の枠線
                            System.out.print(x == gaugeX - 1 ? "└" : "┘");
                        } else if (y > screenHeight - gaugeHeight - 1 && y < screenHeight) { // ゲージの縦の枠線
                            System.out.print("│");
                        }
                    } else if ((y == screenHeight - gaugeHeight - 1 || y == screenHeight) && x > gaugeX - 1 && x < gaugeX + 1) { // ゲージの横の枠線
                        System.out.print("─");
                    // ゲージの表示
                    } else if (x == gaugeX && screenHeight - y <= (animationCharge * gaugeHeight) / 99) { // ゲージの表示
                        System.out.print("▧");
                        countFilled++;  // 埋まっている▧の数をカウント
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            if (isIncreasing) { // チャージが増加している場合
                animationCharge++; // チャージを増加
                if (animationCharge == 99) { // チャージが99になった場合
                    isIncreasing = false; // 次からチャージを減少させる
                }
            } else {
                animationCharge--; // チャージを減少
                if (animationCharge == 0) { // チャージが0になった場合
                    isIncreasing = true; // 次からチャージを増加させる
                }
            }
            
            if(countFilled == 10) { // ゲージが満タンになった場合
                Thread.sleep(speed * 5); // ちょっと待つ (待たないと現実的に満タン時に入力できない)
            }

            Thread.sleep(speed);
        }

        // 対数正規化された値の計算
        // 100 - 埋まっている▧の数 * 10
        double normalizedCharge = 100.0 - countFilled * 10;

        return (int)normalizedCharge;
    }

    private static void clearConsole() {
        System.out.print("\033[H\033[2J"); // ANSIエスケープシーケンスを使って画面をクリア
        System.out.flush(); // バッファをフラッシュ
    }
}
