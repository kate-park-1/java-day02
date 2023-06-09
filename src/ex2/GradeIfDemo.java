package ex2;

import java.util.Scanner;

public class GradeIfDemo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("점수를 입력하세요 : ");
    int i = scanner.nextInt();
    // 입력받은 점수가 유효한 범위 내에 있는지 검사
    if (validateScore(i)){
      String grade ;
      if(i >= 90) { // 90점 이상이면 (90 <= i <= 100)
        if(i >=95) {
          grade = "A+";
        } else {
          grade = "A0";
        }
      }else if(i >= 80){ // 80점 이상(80 <= i < 90)
        grade = "B";
      } else if(i >=70){ // 70점 이상(70 <= i < 80)
        grade = "C";
      } else {// 70점 미만 F(i < 70)
        grade = "D";
      }
      System.out.println("grade = " + grade);
    }
    System.out.println("프로그램 종료");
  } // main

  public static boolean validateScore(int i){
    //return (i < 0 || i > 100) ? false : true ;
    if(i < 0 || i > 100) return false;
    return true;
  }
} // class
