package com.ohgiraffers.section07.practice;

import javax.management.ObjectName;

public class Application1 {
    public static void main(String[] args) {

        int numa=10;
        int numb=4;

        System.out.println("numa / numb = " + (numa / numb));

        int num1=8;
        int num2=3;

        System.out.println("num1 + num2 = " + (numa + numb));
        System.out.println("num1 - num2 = " + (numa - numb));
        System.out.println("num1 * num2 = " + (numa * numb));
        System.out.println("num1 / num2 = " + (numa / numb));
        System.out.println("num1 % num2 = " + (numa % numb));


        int numx=10;
        numx += 5;
        System.out.println("numx += 5 : = " + (numx));

        int numy=20;
        numx /= 4;
        System.out.println(" numx /= 4 : = " + (numx));


        int z = 8;
        int resulte6 = z %= 3;
        System.out.println("resulte6 = " + resulte6);
        System.out.println("z의 값은? " + z);

        System.out.println();

        System.out.println("========== 증감 연산자 ==========");
        int i = 0;
        i++;
        System.out.println("i의 값은? " + i);
        int j = 10;
        --j;
        System.out.println("j의 값은? " + j);
        int k = 5;
        k++;
        System.out.println("k의 값은? " + k);
        System.out.println();





        int wam1=10;
        int wam2=20;

        System.out.println("wam1 == wam2");

        double dum1= 15;
        double dum2= 20;

        System.out.println("dum1이 dum2보다 큰지 비교 : " + (dum1 > dum2));


        System.out.println();
        boolean a1 = true;
        boolean b1 = false;
        System.out.println(a1 && b1);

        int age1 = 20;
        System.out.println("age가 18 이상이고 65 미만이다 : " + (age1 >=18 && age1 < 65));

        int x1 = 10;
        int y1 = 20;
        System.out.println("x1이 10이 아니거나 y1이 25이상이다 : " + (x1 != 10 || y1 >= 25));




    }
}
