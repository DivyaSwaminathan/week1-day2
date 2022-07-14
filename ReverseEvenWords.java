package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str="I love India and its nature as it is simply admiring";
		String[] strArr = str.split(" ");
		for (int i=0;i<strArr.length;i++) {
			if(i%2 != 0) {
				String temp="";
				char wordArr[]=strArr[i].toCharArray();
				for (int j=wordArr.length-1;j>=0;j--) {
					temp= temp+wordArr[j];
					strArr[i]=temp;}                   }

			System.out.print(strArr[i] + " ");	
		}
	}

}

