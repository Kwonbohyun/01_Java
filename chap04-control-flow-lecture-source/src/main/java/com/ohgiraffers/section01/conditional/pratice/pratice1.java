import java.util.Scanner;

public static void practice1 () {


    int =

    Scanner sc = new Scanner(System.in);
    System.out.println("나이를 입력해주세요 : ");
    int age = sc.nextInt();

    System.out.println("키를 입력해주세요 : ");
    int height = sc.nextInt();

    if (age >= 9) {
        if (height >= 110) {
            System.out.println("놀이기구를 탑승하실수 있습니다.");
        } else {
            System.out.println("키가 110cm 미만이라 탑승 하실 수 없습니다.");
        }
    } else if (height >= 110) {
        System.out.println("나이가 9살 미만이라 탑승하실수 없습니다.");
    } else {
        System.out.println("나이가 9살 미만이고, 키가 110cm 미만이라 탑승하실 수 없습니다.");
    }
}
