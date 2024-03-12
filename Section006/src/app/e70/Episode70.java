package app.e70;

public class Episode70 {

	private int currentYear = 2024;
	private String userDateOfBirth = "1999";
	
	public Episode70(int currentYear, String userDateOfBirth) {
		this.currentYear = currentYear;
		this.userDateOfBirth = userDateOfBirth;
		
		int dateOfBirth = Integer.parseInt(userDateOfBirth);
		
		System.out.println("Age = " + (currentYear - dateOfBirth));
		String userAgeWithPartialYear = "22.5";
		double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
		System.out.println("The user says he's " + ageWithPartialYear);
		
		// 2 parts
		System.out.println("2 part add the 2 methods");
		
		System.out.println(getInputFromConsole(currentYear));
		System.out.println(getInputFromScanner(currentYear));
		
	}
	
	public static String getInputFromConsole(int currentYear) {
		String name = System.console().readLine("Hi, whats is Ypu name");
		System.out.println("Hi " + name + ", Thanks for taking the cours");
		
		String dateOfBirth = System.console().readLine("What year were you born");
		int age = currentYear - Integer.parseInt(dateOfBirth);
		return "So you are " + age + "years old";
	}
	
	public static String getInputFromScanner(int currentYear) {
		return "";
	}
}
