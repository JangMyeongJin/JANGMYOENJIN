package chapter09;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder();

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		
		powderPrinter.setMeterial(powder);
		
		Powder p = powderPrinter.getMeterial(); //Generic을 사용하면 자료형 변환이 필요없음
		
		
	}

}
