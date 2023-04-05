package ex2;

public class SumMethodDemo {
  public static void main(String[] args) {
    int tot = sum(1,10);
    System.out.println("sum = " + tot); // 1 부터 10 까지의 합

    int tot1 = sum(11,20);
    System.out.println("sum = " + tot1); // 11 부터 20 까지의 합

    int tot2 = sum(21,30);
    System.out.println("sum = " + tot2); // 21 부터 30 까지의 합

    int tot3 = sum();
    System.out.println("sum = " + tot3); // 1 부터 10 까지의 합
    return;
  }

  public static int sum(){ // 메서드의 선언
    int total = 0;
    for(int i = 1; i<=10; i++){ // 55
      total += i;
    }
    return total;
  }

  public static int sum(int from, int to, int last){
    return 0;
  }

  public static int sum(long from, int to, int last){
    return 0;
  }

  public static int sum(int from, int to){ // 메서드의 선언
    int total = 0;
    for(int i = from; i<=to; i++){
      total += i;
    }
    return total;
  }
}
