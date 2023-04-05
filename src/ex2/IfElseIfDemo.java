package ex2;

import java.util.Scanner;

public class IfElseIfDemo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("숫자를 입력하세요 : ");
    int i = scanner.nextInt();
    if(i > 0) {
      System.out.printf("입력받은 숫자는 %d 이고 양수입니다.\n", i);
    }else if(i < 0){
      System.out.printf("입력받은 숫자는 %d 이고 음수입니다.\n", i);
    } else {
      System.out.printf("입력받은 숫자는 %d 입니다.\n", i);
    }
    System.out.println("프로그램 종료");
  } // main
} // class
