import java.util.Scanner;

public class Menu {
    private String startGameButton;
    private String scoreBoardButton;
    private String exitButton;
    private Scanner scanner;
    private String userName;
    
    public Menu() {
        this.startGameButton = "ゲームを開始する";
        this.scoreBoardButton = "スコアボードを見る";
        this.exitButton = "終了する";
        this.scanner = new Scanner(System.in);
        this.userName = ""; // ユーザー名は必要に応じて設定
    }

    public void displayMenu() {
        System.out.print("\033[H\033[2J"); // ANSIエスケープシーケンスを使って画面をクリア
        System.out.flush(); // バッファをフラッシュ
        System.out.println("メニュー:");
        System.out.println("1. " + startGameButton);
        System.out.println("2. " + scoreBoardButton);
        System.out.println("3. " + exitButton);
    }

    public void handleStartGame() throws InterruptedException {
        // ユーザー名を受け取る
        scanner.nextLine(); // 以前の入力が残っている場合にそれをクリアする
        System.out.println("ユーザー名を入力してください：");
        this.userName = scanner.nextLine();
    
        // ゲームの実行
        Game game = new Game();
        int score = game.run();
        Result result = new Result(score);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        result.displayAnimation();
    
        // スコアを保存
        saveScore(this.userName, score);
    }
    
    private void saveScore(String playerName, int score) {
        DBHelper dbHelper = new DBHelper("database.csv"); // ファイルパスを適切に設定
        dbHelper.writeScore(playerName, score);
    }

    public void handleScoreBoard() throws InterruptedException {
        // Scoreboardsインスタンスの生成とスコアボードの表示
        Scoreboards scoreboards = new Scoreboards(scanner);
        scoreboards.displayScoreBoard();
    
        System.out.println("メニューに戻るにはEnterキーを押してください。");
    
        // 以前の入力が残っている場合にそれをクリアする
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    
        // ユーザーがEnterキーを押すのを待つ
        scanner.nextLine();
    }
    

    public void handleExit() throws InterruptedException {
        System.out.println("ゲームを終了します。");
        // ゲーム終了処理をここに追加
        System.exit(0);
    }

    private int getUserChoice() throws InterruptedException {
        int choice;
        do {
            System.out.println("1, 2, 3のいずれかを入力してください：");
            while (!scanner.hasNextInt()) {
                System.out.println("無効な入力です。数字を入力してください：");
                scanner.next(); // 不正な入力を読み捨てる
            }
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 3);
        return choice;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in); // mainメソッドでScannerを生成
        try {
            Menu gameMenu = new Menu();

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

            }
        } finally {
            scanner.close(); // プログラム終了時にScannerを閉じる
        }
    }
}
