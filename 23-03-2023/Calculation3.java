//Write a java program. create a class Calculation add method addition,substraction,multiplication and division to it.create a object and
//access thosemethods.

class Calculation{//Class Declaration 
	int addition(int k,int l){
		return k+l;
	}
	 int substraction(int k,int l){
		return k-l;
	}
	 int multiplication(int k,int l){
		return k*l;
	}
	 float division(int k,int l){
		return k/l;
	}
}
class Calculation3{
	public static void main(String[] args) {
		Calculation k=new Calculation();
		System.out.println("Addition="+k.addition(50,20));
		System.out.println("Subtraction="+k.substraction(50,20));
		System.out.println("Multiplication="+k.multiplication(50,20));
		System.out.println("Division="+k.division(25,5));
	}
}