package basic;

import java.util.Random;
import java.util.Scanner;

public class Random02 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);


		int[][] A = new int[5][5];
		int[] B = new int[25];
		int x = 0;
		int n = -1;

		for (int i = 0; i < 25; i++) {
			n = rd.nextInt(25) + 1;
			B[i] = n;

			for (int j = 0; j < i; j++) {
				if (B[j] == n) {
					i--;
				}
			}
		}

		for (int m = 0; m < 5; m++) {
			for (int k = 0; k < 5; k++) {
				A[m][k] = B[x];
				x++;
			}
		}
		
		for(int m = 0; m < 5; m++) {   // 맨처음 빙고판 출력함!
			for(int k = 0; k < 5; k++) {
				System.out.print(A[m][k]+" ");
			}
			System.out.println();
		}
		
		int cnt = 0;
		int mango = 0;

		while(cnt < 3) {
			
			System.out.println("숫자를 입력하세요!");
			int num = sc.nextInt();
			mango=0 ;cnt =0 ;	
			for (int m = 0; m < 5; m++) {
				for (int k = 0; k < 5; k++) {
					if(num == A[m][k]) {
						A[m][k] = 0 ;
						
					}
				}	
			}
			mango=0 ;		
			for (int m = 0; m < 5; m++) {
				for (int k = 0; k < 5; k++) {
					if(m==n) {
						mango++ ;
						if(mango==5) {
							cnt=cnt+1 ;
						}
					}
				}
			}
				mango=0;
			for (int  m = 0; m < 5; m++) {
				for (int k = 0; k < 5; k++) {
					if( m+k==4 && A[m][k]==0) {
						mango++ ;
						
						if(mango==5) {
							cnt=cnt+1 ;
							}	
						}
					}
			}
			mango=0 ;							
			for (int  m = 0; m < 5; m++) {
				for (int  k = 0; k < 5; k++) {
					if(A[m][k]==0) {
						mango++ ;
						if(mango==5) {
							cnt=cnt+1 ;
							}	
						}
					}
				}
			mango=0 ;	
			for (int  m = 0; m < 5; m++) {
				for (int  k = 0; k < 5; k++) {
					if(A[k][m]==0) {
						mango++ ;
						if(mango==5) {
							cnt=cnt+1 ;
							}	
						}
					}
				}	
			for(int m = 0; m < 5; m++) {
				for(int k = 0; k < 5; k++) {
					System.out.print(A[m][k]+" ");
				}
				System.out.println();
			
			}
			System.out.println(cnt+"번 빙고입니다");
		}
		
	}

}