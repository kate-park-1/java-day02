package ex2;

import java.util.Scanner;

public class SimpleIfDemo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("숫자를 입력하세요 : ");
    int i = scanner.nextInt();
    int res = i % 2 ;
    if(res == 0) {
      System.out.printf("입력받은 숫자는 %d 이고 짝수입니다.\n", i);
    }
    if(res == 1) {
      System.out.printf("입력받은 숫자는 %d 이고 홀수입니다.\n", i);
    } // if
    System.out.println("프로그램 종료");
  } // main
} // class
