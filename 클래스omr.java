package Portfolio;

import java.util.Random;

class Ex06 {
    int[] answer = {1, 3, 4, 2, 5,};
    int[] hgd = new int[5];

    int cnt = 0;
    int score = 0;
}

public class 클래스omr {
    public static void main(String[] args) {
        Random ran = new Random();
        Ex06 a = new Ex06();

        int[] j = new int[5];

        for (int i = 0; i < 5; i++) {
            a.hgd[i] = ran.nextInt(5) + 1;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(a.answer[i] +"\t");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(a.hgd[i] + "\t");
        }

        for (int i = 0; i <5; i++) {
            if (a.answer[i] == a.hgd[i]) {
                j[i] = 1;
                a.cnt += 1;
            } else if (a.answer[i] == a.hgd[i]) {
                j[i] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (j[i] == 1) {
                System.out.print("O" + "\t");
            } else {
                System.out.print("X" + "\t");
            }
        }
        System.out.println("성적:" + (a.cnt * 20));
    }
}
