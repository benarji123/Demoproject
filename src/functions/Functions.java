package functions;


public class Functions {
	int sum=0;
	String name="alekh";
	String age="27";
	//this is for functions
	//this is new comment
	//this is third comment
	public static void main(String args[]) {
		int[] r= {1,3,5,7,9,04};
		Functions obj=new Functions();
		obj.method(r);
		Alekh obj1=new Alekh();
		obj1.methodA(obj);
		
	}
	public void method(int [] temp) {
		for(int t:temp) {
			sum=sum+t;
			System.out.println(sum);
		}
	}

}
class Alekh{
	public void methodA( Functions g) {
		System.out.println(g.name);
		System.out.println(g.age);
		
	}
}
