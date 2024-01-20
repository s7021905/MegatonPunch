public class Game {
    public static void main(String[] args) throws InterruptedException {
        // パワーゲージ (一段階目のゲーム)
        PowerGauge powerGauge = new PowerGauge(); 
        int powerGaugeScore = powerGauge.run();

        // 照準合わせ (二段階目のゲーム)
        Circle circle = new Circle();
        int circleScore = circle.run();
        
        // 振り子 (三段階目のゲーム)
        Pendulum pendulum = new Pendulum();
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
    }

    // スコアを0から9999の範囲で正規化
    private static int normalizeScore(int score) {
        return (300 - score) * 9999 / 300;
    }
    
    public int run(){
        return 4000;
    }
}
