import java.util.Scanner;

public class Menu {
    private String startGameButton;
    private String scoreBoardButton;
    private String exitButton;

    public Menu(String startGameButton, String scoreBoardButton, String exitButton) {
        this.startGameButton = startGameButton;
        this.scoreBoardButton = scoreBoardButton;
        this.exitButton = exitButton;
    }

    public void displayMenu() {
        System.out.println("メニュー:");
        System.out.println("1. " + startGameButton);
        System.out.println("2. " + scoreBoardButton);
        System.out.println("3. " + exitButton);
    }

    public void handleStartGame() {
        System.out.println("ゲームを開始します！");

        // ゲームの進行に関連する処理をここに追加

        System.out.println("ゲームが終了しました。");
    }

    public void handleScoreBoard() {
        System.out.println("スコアボードを表示します！");

        // ScoreBoard.javaを呼び出す処理
        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.displayScores();  // 仮のメソッド名です。実際のメソッド名に置き換えてください。

        // スコアボードに関する追加の処理をここに追加
    }

    public void handleExit() {
        System.out.println("ゲームを終了します。");

        // ゲーム終了処理をここに追加
        System.exit(0);
    }

    private void waitForButtonPress() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enterキーを押して次の処理に進んでください。");
        scanner.nextLine();
    }

    public static void main(String[] args) {
        Menu gameMenu = new Menu("ゲームを開始", "スコアボードを表示", "ゲームを終了");

        // メニュー表示
        gameMenu.displayMenu();

        // ユーザーの選択に基づいて処理を実行
        Scanner scanner = new Scanner(System.in);
        System.out.println("選択肢の番号を入力してください：");
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                gameMenu.handleStartGame();
                gameMenu.waitForButtonPress();
                break;
            case 2:
                gameMenu.handleScoreBoard();
                gameMenu.waitForButtonPress();
                break;
            case 3:
                gameMenu.handleExit();
                break;
            default:
                System.out.println("無効な選択です。");
        }
    }
}
