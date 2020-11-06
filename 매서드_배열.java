package Portfolio;

class Test6 {
    void changeValueInArray(int[] arr) {
        arr[1] = 100;
    }
}

public class 매서드_배열 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Test6 t6 = new Test6();

        t6.changeValueInArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("===");

        int testArr[] = {10, 20, 30, 40, 50};
        int temp[] = testArr;
        temp[1] = 100;//여기에 100을 넣으면
        for (int i = 0; i < testArr.length; i++) {
            System.out.print(testArr[i]+" ");
            //***testArr과 temp는 같은 값이 나온다 왜냐하면 stack에 같은 주소를 공유하고 있기 때문이다!***
            //배열이름을 출력해서 주소값을 알아내면 이해하기 쉽다!
        }
        System.out.println();
    }
}
