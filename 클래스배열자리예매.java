package Portfolio;

import java.util.Scanner;

class Seat {
    boolean check;

    void showData() {
        if (check == true) {
            System.out.print("■ ");
        } else {
            System.out.print("□ ");
        }
    }
}

public class 클래스배열자리예매 {
    public static void main(String[] args) {
        boolean run = true;
        int cnt = 0;
        Seat[] seatList = new Seat[8];
        for (int i = 0; i < seatList.length; i++) {
            seatList[i] = new Seat();
        }
        Scanner scan = new Scanner(System.in);

        while (run) {
            for (int i = 0; i < seatList.length; i++) {
                seatList[i].showData();
            }
            System.out.println();
            System.out.println("번호를 입력하세요>>");
            int sel = scan.nextInt() - 1;
            if (seatList[sel].check == false) {
                seatList[sel].check = true;
                cnt += 1;
            } else {
                System.out.println("이미 예메된 자리입니다.");
            }
            if (cnt == seatList.length) {
                System.out.println("만석");
                run = false;
            }
        }
    }
}
