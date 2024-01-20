import java.util.Scanner;

public class Menu {
    private String startGameButton;
    private String scoreBoardButton;
    private String exitButton;
    private Scanner scanner;

    public Menu(String startGameButton, String scoreBoardButton, String exitButton, Scanner scanner) {
        this.startGameButton = startGameButton;
        this.scoreBoardButton = scoreBoardButton;
        this.exitButton = exitButton;
        this.scanner = scanner;
    }

    public void displayMenu() {
        System.out.println("メニュー:");
        System.out.println("1. " + startGameButton);
        System.out.println("2. " + scoreBoardButton);
        System.out.println("3. " + exitButton);
    }

    public void handleStartGame() {
        Game game = new Game();
        int score = game.run();
        Result result = new Result(score);
        result.displayAnimation();
        // ゲームの進行に関連する処理をここに追加
        System.out.println("ゲームが終了しました。");
    }

    public void handleScoreBoard() {
        // Scoreboards.javaを呼び出す処理
        Scoreboards scoreboards = new Scoreboards();
        // スコアボードに関する追加の処理をここに追加
    }

    public void handleExit() {
        System.out.println("ゲームを終了します。");
        // ゲーム終了処理をここに追加
        System.exit(0);
    }

    private int getUserChoice() {
        System.out.println("1, 2, 3のいずれかを入力してください：");
        while (!scanner.hasNextInt()) {
            System.out.println("無効な入力です。数字を入力してください：");
            scanner.next(); // 不正な入力を読み捨てる
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // mainメソッドでScannerを生成
        try {
            Menu gameMenu = new Menu("ゲームを開始", "スコアボードを表示", "ゲームを終了", scanner);

            while (true) {
                // メニュー表示
                gameMenu.displayMenu();

                // ユーザーの選択に基づいて処理を実行
                int userChoice = gameMenu.getUserChoice();

                switch (userChoice) {
                    case 1:
                        gameMenu.handleStartGame();
                        break;
                    case 2:
                        gameMenu.handleScoreBoard();
                        break;
                    case 3:
                        gameMenu.handleExit();
                        break;
                    default:
                        System.out.println("無効な選択です。");
                }
                try {
                    Thread.sleep(1000); // 10秒(1万ミリ秒)間だけ処理を止める
                } catch (InterruptedException e) {
                }

            }
        } finally
        {
            scanner.close(); // プログラム終了時にScannerを閉じる
        }
    }
}
