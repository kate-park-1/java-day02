package ex2;

public class MethodDemo {
  public static void main(String[] args) {
    //System.out.println(plus(2_000_000_000,2_000_000_000));
    plus(2_000_000_000,2_000_000_000);
  }

//  public static long plus(long i1, long i2){  // 두개의 값을 더해서 반환
//    return i1+i2;
//  }

  public static void plus(long i1, long i2){  // 반환 없이 두개의 값을 더해서 출력하고 종료
    System.out.println("i1 + i2 = " + (i1 + i2));
  }
}
