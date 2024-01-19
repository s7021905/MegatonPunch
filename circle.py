import curses
import math
import time

def main(stdscr):
    # 円の半径と中心座標
    radius = 2.5
    center_o = (5, 10)
    center_x = (10, 5)

    # x座標の調整係数
    adjustment_factor = 2

    # 角度の初期値
    theta_o = math.pi / 4
    theta_x = 5 * math.pi / 4

    # アニメーションのスピード
    speed = 0.05

    curses.curs_set(0)  # カーソルを隠す
    stdscr.nodelay(True)  # キー入力を待たない

    while True:
        if stdscr.getch() != -1:  # キー入力があればループを抜ける
            break

        # 'o' の座標計算
        x_o = int(center_o[0] + radius * math.cos(theta_o) * adjustment_factor)
        y_o = int(center_o[1] + radius * math.sin(theta_o))

        # 'x' の座標計算
        x_x = int(center_x[0] + radius * math.cos(theta_x) * adjustment_factor)
        y_x = int(center_x[1] + radius * math.sin(theta_x))

        # 画面のクリア
        stdscr.clear()

        # カーソルの位置設定と表示
        if 0 <= y_o < curses.LINES and 0 <= x_o < curses.COLS:
            stdscr.addstr(y_o, x_o, "𐀏")
        if 0 <= y_x < curses.LINES and 0 <= x_x < curses.COLS:
            stdscr.addstr(y_x, x_x, "𐀏")

        stdscr.refresh()

        # 角度の更新
        theta_o += 0.1
        theta_x += 0.1

        # スピードに合わせて待機
        time.sleep(speed)

    # カーソル間の距離を計算
    distance = math.sqrt((x_x - x_o) ** 2 + (y_x - y_o) ** 2)
    stdscr.nodelay(False)  # キー入力を待つように設定
    stdscr.clear()
    stdscr.addstr(0, 0, f"カーソル間の距離: {distance:.2f}")
    stdscr.refresh()
    stdscr.getch()

curses.wrapper(main)
