import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Scoreboards {
    
    public static void main(String[] args) {
        Scoreboards scoreboards = new Scoreboards();
        scoreboards.displayScoreBoard();
        scoreboards.backToMenu();
    }
    
    private DBHelper dbHelper = new DBHelper("database.csv");

    public void displayScoreBoard() {
        List<DBHelper.ScoreRecord> scores = dbHelper.readScores();

        // スコアの高い順にソート
        Collections.sort(scores, Comparator.comparingInt((DBHelper.ScoreRecord s) -> s.score).reversed());
        
        // スコアを表形式で表示
        System.out.println("スコアボード");
        System.out.println("----------");
        System.out.println("順位\tプレイヤー名\tスコア\t日付");
        System.out.println("----------");
        int rank = 1;
        for (DBHelper.ScoreRecord score : scores) {
            System.out.println(rank + "\t" + score.playerName + "\t" + score.score + "\t" + score.date);
            rank++;
        }
    }

    public void backToMenu() {
        System.out.println("メニューに戻る際は1と入力してください。");
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("1")) {
                // Menuクラスを呼び出すコード
                // Menu menu = new Menu();
                // menu.displayMenu();
            } else {
                System.out.println("無効な入力です。");
            }
        }
    }
}
