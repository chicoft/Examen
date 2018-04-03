public class CalculadoraExamen {
	private int num1;
	private int num2;
	
	public CalculadoraExamen(int a, int b){
		num1 = a;
		num2 = b;
	}
	
	public int divideix(){
		int resul = num1/num2;
		return resul;
	}
	
	public double potencia(){
		double resul = Math.pow(num1, num2);
		return resul;
	}
	
	public boolean resta(){
		if(num1%2>num2%3){
			return true;
		}
		else{
			return false;
		}
	}
}
