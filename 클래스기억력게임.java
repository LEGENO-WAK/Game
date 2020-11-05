package Portfolio;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다.
 */
class Ex09 {
    int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
    int[] back = new int[5];

    int cnt = 0;
}

public class 클래스기억력게임 {
    public static void main(String[] args) {
        Ex09 e = new Ex09();
        int[] n = new int[e.front.length];
        int[] l = new int[e.front.length];

        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        for (int i = 0; i < e.front.length; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();
        for (int i = 0; i < l.length; i++) {
            if (l[i] == 0) {
                System.out.print("|\t");
            }
        }

        System.out.println();
        for (int i = 0; i < 1000; i++) {
            int r = ran.nextInt(e.front.length);
            int temp = e.front[0];
            e.front[0] = e.front[r];
            e.front[r] = temp;
        }


        while (true) {

            for (int i = 0; i < e.front.length; i++) {
                if (e.front[i] == 9) {
                    System.out.print("*\t");
                } else {
                    System.out.print(e.front[i]+"\t");
                }
            }
            System.out.println();
            for (int i = 0; i < e.back.length; i++) {
                System.out.print(e.back[i]+"\t");
            }
            int sel1 = 0;
            int sel2 = 0;
            System.out.println();
            System.out.println("같은 숫자의 첫번째 위치를 입력:");
            int choice1 = scan.nextInt();
            System.out.println("같은 숫자의 두번째 위치를 입력:");
            int choice2 = scan.nextInt();

            if (e.front[choice1] == e.front[choice2]) {
                sel1 = e.front[choice1];
                sel2 = e.front[choice2];
                e.back[sel1 - 1] = sel1;
                e.front[choice1] = 9;
                e.front[choice2] = 9;

                e.cnt += 1;

            }
            if (e.cnt == 5) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
