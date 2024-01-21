import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Scoreboards {
    private DBHelper dbHelper;

    public Scoreboards(DBHelper dbHelper) {
        this.dbHelper = dbHelper;
    }

    public void displayScoreBoard() {
        List<DBHelper.ScoreRecord> scores = dbHelper.readScores();

        // スコアの高い順にソート
        Collections.sort(scores, Comparator.comparingInt(DBHelper.ScoreRecord::getScore).reversed());

        // スコアを表形式で表示
        System.out.println("スコアボード");
        System.out.println("----------");
        System.out.println("順位\tスコア");
        System.out.println("----------");
        int rank = 1;
        for (DBHelper.ScoreRecord score : scores) {
            System.out.println(rank + "\t" + score.getScore());
            rank++;
        }
    }

    public void loadScores() {
        dbHelper.readScores();
    }

    public void backToMenu() {
        System.out.println("メニューに戻る際はMenuと入力");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Menu")) {
            // Menuクラスを呼び出すコード
            Menu menu = new Menu(); // 
            menu.displayMenu(); // 
        } else {
            System.out.println("無効な入力です。");
        }
    }
}