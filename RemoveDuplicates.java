package week1.day2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1 java setup  ";
		int counter=0;
		//String stroutput=" ";
		String stringArr[]=text.split(" ");
		System.out.println(Arrays.toString(stringArr));
		for (int i=0;i<stringArr.length;i++) {
			for(int j=i+1;j<stringArr.length;j++) {
				//stroutput = stroutput + stringArr[j];
				if (stringArr[i].equals(stringArr[j])) {
					counter=counter+1;
					if (counter>=1) {
						stringArr[j]=" ";

					}

				}

			}
			System.out.print(stringArr[i] + " ");
		}	
		//System.out.println(stroutput);
		//System.out.println(stringArr);
		//System.out.println(Arrays.toString(stringArr));

	}


}



