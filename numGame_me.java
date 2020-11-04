package Portfolio;

import java.util.Scanner;

public class numGame_me {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int game[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,0}
        };
        int yx [][] = new int[10000][2];

        //문제1) 0 이 플레이어이다
        // 1) left 2)right 3)up 4)down 5)되감기
        //번호를 입력받고 해당위치로 이동 ==> 이동할때 값을 서로 교환한다.
        // 예) 1 ==>
		/*
		    {1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,0,15}
		 */
        int xx = 0;
        int yy = 0;
        int cnt = 0;

        while (true) {

            System.out.println();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(game[i][j]+"\t");
                    if (game[i][j] == 0) {
                        yy = i;
                        xx = j;
                    }
                }
                System.out.println("\n");
            }
            System.out.println("1) left 2)right 3)up 4)down 5)되감기");
            int move = scan.nextInt();

            int temp = 0;

            if (move == 1) {
                if (xx > 0) {
                    temp = game[yy][xx - 1];
                    game[yy][xx - 1] = game[yy][xx];
                    game[yy][xx] = temp;
                    cnt += 1;
                    yx[cnt][0] = yy;
                    yx[cnt][1] = xx;
                    System.out.println("저장 완료");

                } else {
                    xx = 0;
                }
            } else if (move == 2) {
                if (xx < 3) {
                    temp = game[yy][xx + 1];
                    game[yy][xx + 1] = game[yy][xx];
                    game[yy][xx] = temp;
                    cnt += 1;
                    yx[cnt][0] = yy;
                    yx[cnt][1] = xx;
                    System.out.println("저장 완료");

                } else {
                    xx = 3;
                }
            } else if (move == 3) {
                if (yy > 0) {
                    temp = game[yy - 1][xx];
                    game[yy - 1][xx] = game[yy][xx];
                    game[yy][xx] = temp;
                    cnt += 1;
                    yx[cnt][0] = yy;
                    yx[cnt][1] = xx;
                    System.out.println("저장 완료");

                } else {
                    yy = 0;
                }
            } else if (move == 4) {
                if (yy < 3) {
                    temp = game[yy + 1][xx];
                    game[yy + 1][xx] = game[yy][xx];
                    game[yy][xx] = temp;
                    cnt += 1;
                    yx[cnt][0] = yy;
                    yx[cnt][1] = xx;
                    System.out.println("저장 완료");

                } else {
                    yy = 3;
                }
            }
             else if (move == 5) {
                temp = game[yx[cnt][0]][yx[cnt][1]];
                game[yx[cnt][0]][yx[cnt][1]] = game[yy][xx];
                game[yy][xx] = temp;

                cnt -= 1;
                if (cnt == 0) {
                    System.out.println("되감기 좌표값이 없습니다.");
                    continue;
                }
            }
        }

        //문제2) 심화  ==> 한칸한칸이동할때마다 yx 에 배열에 이동한경로를 저장했다가
        // 5번입력시 ==> 왔던길로 되돌아가기 한다.
    }
}
