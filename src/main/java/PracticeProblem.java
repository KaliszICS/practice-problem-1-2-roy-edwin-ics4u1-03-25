public class PracticeProblem {

	public static void main(String args[]) {

	}
	
	public static boolean validIndex(int[] intArray, int num1){
		
		try {
			int num2 = intArray[num1];
			return true;
			}
			catch (ArrayIndexOutOfBoundsException e){
				return false;
		}
	}
	
	public static int divide(int firstnum, int secondnum) {
       
	    try {
        	return firstnum / secondnum;
        		} catch (ArithmeticException e) {
            		return 0;
        }
    }
	
	public static int safeConvertStringtoInt(String string1){
		
		try{
			return Integer.parseInt(string1);
			}
				catch(NumberFormatException e){
					return 0;
		}
	}
}
