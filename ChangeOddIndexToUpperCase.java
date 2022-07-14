package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="changeme";
		char[] charArr=str.toCharArray();
		for (int i=0;i<charArr.length;i++) {
			if (i%2!=0)
			{
				char oddcase=charArr[i];
				char uppercase=Character.toUpperCase(oddcase);
				charArr[i]=uppercase;
			}

		}
		System.out.println(charArr);
	}

}
