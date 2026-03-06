public class Euclidean{
  public static void main(String[] args){
    System.out.println(euclidean(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
  }

  public static int euclidean(int a, int b){
    int temp = 0;
    while(b != 0){
      temp = a % b;
      a = b;
      b = temp;
    }
    return a;
  }
}
