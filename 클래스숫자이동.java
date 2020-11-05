package Portfolio;

import java.util.Scanner;

class Ex08 {
    int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}

public class 클래스숫자이동 {
    public static void main(String[] args) {
        /*
         * # 숫자이동[3단계] : 클래스 + 변수
         * 1. 숫자2는 캐릭터이다.
         * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
         * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
         * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
         * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
         * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
         * 예)
         *  0 0 0 0 0 0 0 2
         *  왼쪽(1) 오른쪽(2) : 2
         *
         *  2 0 0 0 0 0 0 0
         */
        Ex08 e = new Ex08();
        Scanner scan = new Scanner(System.in);
        int idx = 0;

        while (true) {


            for (int i = 0; i < e.game.length; i++) {
                if (e.game[i] == 2) {
                    idx = i;
                    System.out.print("옷 ");
                } else if (e.game[i] == 1) {
                    System.out.print("벽 ");
                } else {
                    System.out.print(e.game[i]+" ");
                }
            }

            System.out.println("[1]왼쪽 [2]오른쪽:");
            int sel = scan.nextInt();

            if (sel == 1) {
                if (idx > 0) {
                    int temp = e.game[idx - 1];
                    e.game[idx - 1] = e.game[idx];
                    e.game[idx] = temp;
                    if (e.game[idx] == 1) {
                        System.out.println("벽을 부수겠습니까?[Y/N]");
                        String punch = scan.next();
                        if (punch.equals("y")) {
                            e.game[idx] = 0;
                        } else if (punch.equals("n")) {
                            break;
                        }
                    }
                } else if (idx < 0) {
                    idx = 0;
                }
            } else if (sel == 2) {
                if (idx < e.game.length - 1) {
                    int temp = e.game[idx + 1];
                    e.game[idx + 1] = e.game[idx];
                    e.game[idx] = temp;
                    if (e.game[idx] == 1) {
                        System.out.println("벽을 부수겠습니까?[Y/N]");
                        String punch = scan.next();
                        if (punch.equals("y")) {
                            e.game[idx] = 0;
                        } else if (punch.equals("n")) {
                            break;
                        }
                    }
                } else if (idx > e.game.length - 1) {
                    idx = e.game.length - 1;
                }
            }
        }
    }
}
