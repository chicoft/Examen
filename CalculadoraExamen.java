public class CalculadoraExamen {
	private int numero1;
	private int numero2;
	
	public CalculadoraExamen(int a, int b){
		numero1 = a;
		numero2 = b;
	}
	
	public int divideix(){
		int resul = numero1/numero2;
		return resul;
	}
	
	public double potencia(){
		double resul = Math.pow(numero1, numero2);
		return resul;
	}
	
	public boolean resta(){
		if(numero1%2>numero2%3){
			return true;
		}
		else{
			return false;
		}
	}
}
