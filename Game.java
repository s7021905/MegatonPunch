public class Game {
    // パワーゲージ (一段階目のゲーム)
    PowerGauge powerGauge = new PowerGauge(); 

    // 照準合わせ (二段階目のゲーム)
    Circle circle = new Circle();
        
    // 振り子 (三段階目のゲーム)
    Pendulum pendulum = new Pendulum();

    // スコアを0から9999の範囲で正規化
    private static int normalizeScore(int score) {
        return (300 - score) * 9999 / 300;
    }
    
    public int run() throws InterruptedException {
        int powerGaugeScore = powerGauge.run();
        int circleScore = circle.run();
        int pendulumScore = pendulum.run();

        // 各スコアを0から9999の範囲で正規化
        int normalizedPowerGaugeScore = normalizeScore(powerGaugeScore);
        int normalizedCircleScore = normalizeScore(circleScore);
        int normalizedPendulumScore = normalizeScore(pendulumScore);

        // 合計スコアを計算
        int totalScore = normalizedPowerGaugeScore + normalizedCircleScore + normalizedPendulumScore;

        // 各スコアを表示
        System.out.println("Power Gauge Score: " + normalizedPowerGaugeScore);
        System.out.println("Circle Score: " + normalizedCircleScore);
        System.out.println("Pendulum Score: " + normalizedPendulumScore);
        System.out.println("Total Score: " + totalScore);

        return totalScore;
    }
}