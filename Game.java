public class Game {
    public static void main(String[] args) throws InterruptedException {
        PowerGauge powerGauge = new PowerGauge();
        int powerGaugeScore = powerGauge.run();

        Circle circle = new Circle();
        int circleScore = circle.run();

        Pendulum pendulum = new Pendulum();
        int pendulumScore = pendulum.run();

        // 各スコアを0から9999の範囲で正規化
        int normalizedPowerGaugeScore = normalizeScore(powerGaugeScore);
        int normalizedCircleScore = normalizeScore(circleScore);
        int normalizedPendulumScore = normalizeScore(pendulumScore);

        int totalScore = normalizedPowerGaugeScore + normalizedCircleScore + normalizedPendulumScore;

        System.out.println("Normalized Power Gauge Score: " + normalizedPowerGaugeScore);
        System.out.println("Normalized Circle Score: " + normalizedCircleScore);
        System.out.println("Normalized Pendulum Score: " + normalizedPendulumScore);
        System.out.println("Total Score: " + totalScore);
    }

    private static int normalizeScore(int score) {
        // 現在のスコアを0から9999の範囲で正規化
        return (300 - score) * 9999 / 300;
    }
}
