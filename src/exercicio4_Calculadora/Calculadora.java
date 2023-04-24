package exercicio4_Calculadora;

public class Calculadora {
	
		private double num1;
		private double num2;

	    public Calculadora(double a, double b) {
	        this.num1 = a;
	        this.num2 = b;
	    }

		public Calculadora() {
			
		}

		public double Soma(double a, double b) {
			return a + b;
		}

		public double Subtracao(double a, double b) {
			return a - b;
		}
		
		public double Divisao(double a, double b) {
			return a/b;
		}
		
		public double Multiplicacao(double a, double b) {
			return a*b;
		}
		
		public double Potenciacao(double a, double b) {
			return Math.pow(a, b);
		}

	}

