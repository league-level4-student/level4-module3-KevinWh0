package _02_gotta_catchem_all;

public class ExceptionMethods {
	long div(long numb1, long numb2) throws Exception {
		
		try {
			return numb1/numb2;
		
		}catch (Exception e) {
			// TODO: handle exception
			throw new Exception();
		}
	}
	
	String revString(String input) throws Exception {
		
		if(input.equals("") || input.equals(null)) {
			throw new Exception();
		}
		
		StringBuilder b = new StringBuilder();
		b.append(input);
		b.reverse();
		
		return b.toString();
	}
}
