package gitbranch2;

public class main {
  public static void main(String[] args) {
	  //leader
	  System.out.println("12");
	  //leader add
	  bighit hit = new bighit();
	  System.out.println();
	  System.out.println(hit.add(10,20));
  }

}
class bighit{
	int add(int a , int b) {
		return a+b;
	}
}