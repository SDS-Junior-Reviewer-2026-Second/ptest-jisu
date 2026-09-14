public class Calculator {
  
  private int result;

  public void plus(int a, int b){
    result = a + b;
  }

  public void minus(int a, int b){
    result = a - b;
  }

  public void divide(int a, int b){
    if (b == 0){
      System.out.println("Cannot divide by 0, please try again");
      return;
    }
    result = a / b;
  }

  public void multiple(int a, int b){
    result = a * b;
  }

  public void printResult(){
    System.out.println(result);
  }
}
