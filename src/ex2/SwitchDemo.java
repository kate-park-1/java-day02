package ex2;

import java.util.Scanner;

public class SwitchDemo {
  public static void main(String[] args) {
    // 자판기
    // A : 콜라, B : 사이다 , C : 환타
    Scanner in = new Scanner(System.in);
    char button;
    String product;
    while(true){
      button = in.nextLine().charAt(0);
      if (button == 'X' || button == 'x')
        break;
      switch(button){
        case 'A' :
        case 'a' :
          product = "콜라";
          break;
        case 'B' :
        case 'b' :
          product = "사이다";
          break;
        case 'C' :
        case 'c' :
          product = "환타";
          break;
        default:
          product = "없음";
      }
      System.out.println(product);
    }
  }
}
