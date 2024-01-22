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
        Game game = new Game();
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("1, 2, 3のいずれかを入力してください：");
        while (!scanner.hasNextInt()) {
            System.out.println("無効な入力です。数字を入力してください：");
            scanner.next(); // 不正な入力を読み捨てる
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Menu gameMenu = new Menu("ゲームを開始", "スコアボードを表示", "ゲームを終了");

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
    }
}
