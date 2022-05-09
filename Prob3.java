package problem;
import java.util.ArrayList;
import java.util.Scanner;

public class Prob3 {
	
	private double Number;
	

	public Prob3(double number) {
		super();
		Number = number;
	}
	
	boolean isZero() {
		if(this.Number==0) {
			return true;
		}
		else
			return false;
	}

	boolean isPositive() {
		if (Number>0) {
			return true;
		}
		else return false;
	}
	
	boolean isNegative() {
		if (Number<0) {
			return true;
		}
		else return false;
	}
	
	boolean isOdd() {
		if(Number%2==0) {
			return false;
		}
		else return true;
	}

	boolean isEven() {
		if(Number%2==0) {
			return true;
		}
		else return false;
	}
	
	boolean isPrime() {

		int i1=0;
		for(int i=(int) (Number-1);i>=2;i--) {
			if((int)Number%i==0) {
				i1=1;
				break;
			}
		}
		if(i1==0) {
			return true;
		}
		else 
			return false;
		
	}

	boolean isAmstrong() {
		String num = Integer.toString((int)Number);
        double f = 0;
		for (int i = 0; i < num.length(); i++){
			String y="";
			y+=num.charAt(i);
		    double x=Integer.parseInt(y);
		    f+=x*x*x; 
		}
		if(f==Number) {
			return true;
		}
		else
			return false;
		    
	}
	
	int getFactorial(int Number){    
		  if (Number == 0)    
		    return 1;    
		  else    
		    return(Number * getFactorial(Number-1));    
		 }
	 
    double getSqrt() {
    	return Math.sqrt(Number);
    }
	 
    double getSqr() {
    	return Number*Number;
    }
    
    double sumDigits() {
    	String num = Integer.toString((int)Number);
        double f = 0;
		for (int i = 0; i < num.length(); i++){
			String y="";
			y+=num.charAt(i);
		    double x=Integer.parseInt(y);
		    f+=x; 
		}
		return f;
    }
    
    String getReverse() {
    	String num = Integer.toString((int)Number);
    	String y="";
		for (int i = 0; i < num.length(); i++){
			y=num.charAt(i)+y; 
		}
		return y;
    }

    void listFactor() {
    	ArrayList<Integer> fact = new ArrayList<>();
    	for(int i=1; i<=Number ; i++) {
    		if(Number%i==0) {
    			fact.add(i);
    		}
    	}
    	System.out.println(fact);
    }
    
    void dispBinary() {
    	System.out.println(Integer.toBinaryString((int)Number));
    }
    		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");
		int num = sc.nextInt();
		Prob3 obj = new Prob3(num);
		boolean b=true;
		while(b==true) {
			System.out.println("Select the method u want to check \n   1) isZero( )   2) isPositive()   3) isNegative( )   4) isOdd( )   5) isEven( ) ");
			System.out.println("   6) isPrime()   7) isAmstrong()   8) getFactorial()   9) getSqrt()   10)  getSqr()");
			System.out.println("   11) sumDigits()   12)  getReverse()   13) listFactor()   14) dispBinary()");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:System.out.println(obj.isZero()); break;
			case 2:System.out.println(obj.isPositive()); break;   
			case 3:System.out.println(obj.isNegative()); break;
			case 4:System.out.println(obj.isOdd()); break;
			case 5:System.out.println(obj.isEven()); break;
			case 6:System.out.println(obj.isPrime()); break;
			case 7:System.out.println(obj.isAmstrong()); break;
			case 8:System.out.println(obj.getFactorial(num)); break;
			case 9:System.out.println(obj.getSqrt()); break;
			case 10:System.out.println(obj.getSqr()); break;
			case 11:System.out.println(obj.sumDigits()); break;
			case 12:System.out.println(obj.getReverse()); break;
			case 13:obj.listFactor(); break;
			case 14:obj.dispBinary(); break;
			case 15:b= false ; break;
			}
		}

	}

}