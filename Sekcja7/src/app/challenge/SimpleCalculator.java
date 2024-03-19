package app.challenge;

public class SimpleCalculator {

	private double firstNumber;
	private double secondNumber;
	
	public SimpleCalculator() {
		System.out.println("Start SimpleCalculator");
	}
	
	public void setFirstNumber(double number) {
		firstNumber = number;
	}
	
	public void setSecondNumber(double number) {
		secondNumber = number;
	}
	
	public void getFirstNumber(double number) {
		firstNumber = number;
	}
	
	public void getSecondNumber(double number) {
		secondNumber = number;
	}
	
	public double getAddiotionResult() {
		double result = firstNumber + secondNumber;
		return result;
	}
	
	public double getSubstractionResult() {
		double result = firstNumber - secondNumber;
		return result;
	}
	
	public double getMultiplicationResult() {
		double result = firstNumber * secondNumber;
		return result;
	}
	
	public double getDivisionResult() {
	
		if(secondNumber == 0) {
			return 0;
		}
		double result = firstNumber / secondNumber;
		return result;
	}
	
	
	/*
	 * code form www
	 * 
	 * private double firstNumber;     // 0.0 by default
    private double secondNumber;    // 0.0 by default
 
    // == getters/setters ==
    public double getFirstNumber() {
        return firstNumber;
    }
 
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
 
    public double getSecondNumber() {
        return secondNumber;
    }
 
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
 
    // == public methods ==
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }
 
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }
 
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }
 
    public double getDivisionResult() {
        // 1. check if we can divide with secondNumber
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }
	 * 
	 * 
	 */
}
