package codingassignment;

public class week3codingassignment {

	//method for question 7, only prints hello one time
		public static String concatenateMe(String word, int n) {
			String newWord = "";
			for(int i = 1; i <= n; i++) {
				newWord += word;
			}
				return newWord;
		}
	
	//method for number 8, need values to pass thru, dont know how to write that
		public static String fullName(String firstName, String lastName) {
		String fullName = firstName.concat(" ").concat(lastName);
			return fullName;
		}
		
		/*method for number 9, why is it a class? and where do I put my array to
		 * be able to iterate thru? How do i get it to print true or false based
		 * on the conditions? 
		 */
		public static boolean sumAllNumbers(int[] numbers) {
		int sum = 0;
		for(int add : numbers) {
			sum += add; 
		} 
		
		return sum > 100;
		}
			
		//method for number 10, no problems
		public static double takeAverage(double[] array) {
			double sum = 0; 
			for(double number : array) {
				sum+=number;
			}
			return sum/array.length;
		}
		
		/*method for number 11, how to get average of each array
		 * and compare them to each other
		 */
		public static boolean isArrayGreaterThanOther(double[] a, double[] b) {
			double total1 = 0;
			double total2 = 0;
			for(double number : a) {
				total1 += number;
				}
			for (double number : b) {
				total2 += number;
			}
			if(total1/a.length > total2/b.length) {
			return true;
			} else {
				return false;
			}
		}
		//method for number 12, what do I put in the return
		public static boolean willBuyDrink(boolean a, double number) {
			
			if(a && number >= 10.50) {
				return true;
			}else {
				return false;
			}
		
		}
		
		/*method for number 13, this method checks to see if a string
		 * passed through this method is larger in length than a 
		 * number that is input. 
		 */
		public static boolean isStringLargerThanNumber(String string, int number) {
			if(string.length() > number) {
				return true;
			}else {
				return false;
			}
		}
	
	
	
	
	public static void main(String[] args) {
	
		//array for number 1
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 56};
	System.out.println("Question 1a: " + (ages[0] - ages[ages.length - 1]));
	System.out.println(""); //break
	
	int sum = 0;
	for(int number : ages) {
		sum+=number;
	}
		int averageAge = sum/ages.length;
		System.out.println("Question 1c: " + averageAge);
		
		System.out.println(""); //break
	//question 2, no problems
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	int total = 0; 
	for(int i = 0; i < names.length; i++) {
		total += names[i].length();
	}
	int average = total/names.length;
	System.out.println("Question 2a: " + average);
	
	System.out.println(""); //break
	
	System.out.println("Question 2b: ");
	for(String name : names) {
		System.out.print(name + " ");
	}
	System.out.println(""); //break
	System.out.println(""); //break
	
	//question 5
	int[] nameLengths = new int [names.length] ;
	System.out.println("Question 5: ");
	for(int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
		System.out.print(nameLengths[i] + ", ");
	}
	System.out.println(""); //break
	System.out.println(""); //break
	
	for(int i = 0; i < names.length; i++) {
		total += names[i].length(); 
	}
	System.out.println("Question 6: " + total);

	System.out.println(""); //break

	System.out.println("Question 7: " + concatenateMe("Hello",3)); //print screen for #7
	
	System.out.println(""); //break
	
	//Question 8 test
	System.out.println("Question 8: " + fullName("Thomas", "Smith"));
	 
	System.out.println(" "); //break
	
	//array for number 9, problems
	System.out.print("Question 9: ");
	int[] numberArray = {3, 6, 7, 5};
	System.out.println(sumAllNumbers(numberArray));
	
	System.out.println(""); //break
	
	//array for number 10, no problems
	double[] doubles = {34.6, 56.8, 11.9, 12.5};
	System.out.println("Question 10: " + takeAverage(doubles));
	
	System.out.println(""); //break
	
	//Question 11
	System.out.print("Question 11: ");
	double[] arrayForNumber11a = {3.6, 1.2, 6.7};
	double[] arrayForNumber11b = {6.6, 7.2, 2.7};
	
	System.out.println(isArrayGreaterThanOther(arrayForNumber11a, arrayForNumber11b));
	
	System.out.println(""); //break
	
	//variables for number 12
	System.out.print("Question 12: ");
		boolean isHotOutside = true;
		double moneyInPocket = 10.50;
	
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		System.out.println(""); //break
		
		
		//number 13
		System.out.println("Question 13: " + isStringLargerThanNumber("Hello World", 7));
	
	}
	
}
