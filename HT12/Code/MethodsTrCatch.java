
public class MethodsTrCatch {

	

		public int a = 10;
		public int b = 0;

		public String[] mas = new String[2];

		
		
		
		public void MethodToCallFromMain () {
		try

		{
			System.out.println(mas[4]);
			System.out.println(a / b);

		}

		catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
			System.out.println("Словили " + ex);

		}

		finally 
		{
		System.out.println("Выполняется всегда 'finally' ");
		}
	}
}


	
