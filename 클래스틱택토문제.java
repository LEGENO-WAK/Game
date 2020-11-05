package Portfolio;
/*
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 *
 */

import java.util.Scanner;

class Ex10 {
    String[][] game = new String[3][3];

    int turn = 0;
    int win = 0;
}

public class 클래스틱택토문제 {
    public static void main(String[] args) {
        Ex10 e = new Ex10();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < e.game.length; i++) {//문자열에 0으로 초기화
            for (int j = 0; j < e.game[i].length; j++) {
                e.game[i][j] = "0";
            }
        }
        boolean run = true;
        while (run) {

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (e.game[i][j].equals("0")) {
                        System.out.print("[ ]" + "\t");
                    } else if (e.game[i][j].equals("1")) {
                        System.out.print("[O]" + "\t");
                    } else if (e.game[i][j].equals("2")) {
                        System.out.print("[X]" + "\t");
                    }
                }
                System.out.println();
            }
            if (e.win == 1) {
                System.out.println("[P1]승리");
                break;
            } else if (e.win == 2) {
                System.out.println("[P2]승리");
                break;
            }

            if (e.win == 0 && e.turn == 9) {
                System.out.println("비겼다.");
                break;
            }

            if (e.turn % 2 == 0) {
                System.out.println("[P1]y좌표 값:");
                int y1 = scan.nextInt();
                System.out.println("[P1]x좌표 값:");
                int x1 = scan.nextInt();
                if (e.game[y1][x1] == "0") {//0일때만 넘어가도록
                    e.game[y1][x1] = "1";
                    e.turn += 1;
                }
            } else if (e.turn % 2 == 1) {
                System.out.println("[P2]y좌표 값:");
                int y2 = scan.nextInt();
                System.out.println("[P2]x좌표 값:");
                int x2 = scan.nextInt();
                if (e.game[y2][x2] == "0") {//0일때만 넘어가도록
                    e.game[y2][x2] = "2";
                    e.turn += 1;
                }
            }

            for (int i = 0; i < e.game.length; i++) {//가로 확인
                if (e.game[i][0].equals("1") && e.game[i][1].equals("1") && e.game[i][2].equals("1")) {
                    e.win = 1;
                }
                if (e.game[i][0].equals("2") && e.game[i][1].equals("2") && e.game[i][2].equals("2")) {
                    e.win = 2;
                }
            }

            for (int i = 0; i < e.game.length; i++) {//세로 확인
                if (e.game[0][i].equals("1") && e.game[1][i].equals("1") && e.game[2][i].equals("1")) {
                    e.win = 1;
                }
                if (e.game[0][i].equals("2") && e.game[1][i].equals("2") && e.game[2][i].equals("2")) {
                    e.win = 2;
                }
            }

            //대각선 확인
            if (e.game[0][2].equals("1") && e.game[1][1].equals("1") && e.game[2][0].equals("1")) {
                e.win = 1;
            }
            if (e.game[0][2].equals("2") && e.game[1][1].equals("2") && e.game[2][0].equals("2")) {
                e.win = 2;
            }
            if (e.game[0][0].equals("1") && e.game[1][1].equals("1") && e.game[2][2].equals("1")) {
                e.win = 1;
            }
            if (e.game[0][0].equals("2") && e.game[1][1].equals("2") && e.game[2][2].equals("2")) {
                e.win = 2;
            }
        }
    }
}
