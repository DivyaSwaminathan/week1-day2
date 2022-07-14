package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Refer";
		String rev="";
		for (int i=str.length()-1;i>=0;i--)	{
			//System.out.println(str.charAt(i));
			rev=rev+str.charAt(i);
			//System.out.println(rev);
		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("The string " + str + " is a palindrom");
		}
		else {
			System.out.println("The string " + str + " is not a palindrom");
		}

	}
}

