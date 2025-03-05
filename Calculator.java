public class Calculator{
	public int add(int a,int b){
		return a+b;
	} 

	public int sub(int a, int b) {
        	return a - b;
    	}

	public int mul(int a, int b) {
        	return a * b;
    	}

	public double div (int a, int b) {
		if(b==0){
			System.out.println("ERROR:División entre cero no permitida");
			return 0;
		}
		return (double) a / b;
	}
	
}