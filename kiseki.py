import math
import os

# 円の半径
radius = 6

# 各円の中心座標
center_o = (10, 20)
center_x = (20, 10)

# x座標の調整係数
adjustment_factor = 2

# 角度のステップサイズ
step = 0.1

# 画面のクリア
os.system('cls' if os.name == 'nt' else 'clear')

# 空の画面を生成
screen_height = 30
screen_width = 60
screen = [[" " for _ in range(screen_width)] for _ in range(screen_height)]

# 'o' の軌跡を計算し、画面に点を追加
theta = 0
while theta <= 2 * math.pi:
    x_o = int(center_o[0] + radius * math.cos(theta) * adjustment_factor)
    y_o = int(center_o[1] + radius * math.sin(theta))

    if 0 <= x_o < screen_width and 0 <= y_o < screen_height:
        screen[y_o][x_o] = "o"

    theta += step

# 'x' の軌跡を計算し、画面に点を追加
theta = 0
while theta <= 2 * math.pi:
    x_x = int(center_x[0] + radius * math.cos(theta) * adjustment_factor)
    y_x = int(center_x[1] + radius * math.sin(theta))

    if 0 <= x_x < screen_width and 0 <= y_x < screen_height:
        screen[y_x][x_x] = "x"

    theta += step

# 画面を表示
for row in screen:
    print("".join(row))
