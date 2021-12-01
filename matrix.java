/* helin ibrahim
GB  */

import java.util.Scanner;
public class matrix {
	public static void main(String[]args) {

		Scanner hel=new Scanner(System.in);
		System.out.println("plese enter no.of rows  respectively: ");
		int a1=hel.nextInt();

		System.out.println(" plese enter no.of colums respectively:");
		int b1=hel.nextInt();

		int h[][]=new int[a1][b1];

		System.out.println("plese enter elements: ");
		for(int i=0; i<h.length; i++) {
			for(int j=0; j<h[0].length; j++) {
				h[i][j]=hel.nextInt();
			}
		}

		System.out.println(" plese enter no.of rows  respectively:");
		int c=hel.nextInt();

		System.out.println("plese enter no.of colums respectively:");
		int d=hel.nextInt();

		int e[][]=new int[c][d];
		System.out.println("plese enter elements:");
		for(int i=0; i<e.length; i++) {
			for(int j=0; j<e[0].length; j++) {
				e[i][j]=hel.nextInt();
			}
		}

		if(h[0].length != e.length) {
			System.out.println(" multiplication under find");
		}else {
		int m[][]=multiplication(h,e);
			for(int i=0; i<m.length; i++) {
				for(int j=0; j<m[0].length; j++) {
					System.out.print(m[i][j]+"    ");
				}
				System.out.println();
			}
		}

	}
	public static int [][] multiplication(int h[][], int e[][]){
		int answer[][]=new int[h.length][e[0].length];

		for(int i=0; i<h.length; i++) {
			for(int j=0; j<e[0].length; j++) {
				for(int k=0; k<h[0].length; k++) {
					answer[i][j]=answer[i][j] + h[i][k]*e[k][j];
				}
			}
		}
		return answer;
	}

}