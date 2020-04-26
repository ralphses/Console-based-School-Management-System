package studentRecord2;

import java.util.Random;
import java.util.Scanner;
public class MatricNumber {
	private Random rand = new Random();
	
	private int matNum;
	
	public int [] matricNumber = new int[100];
	
	public int insertMatricNumber() {
		return checkMat();
	}
	
	private int checkMat() {
		int i;
		boolean checker = true;
		boolean check = true;
		while(check) {
			int mat = setMatricNo();
			while(checker) {		
				for (i = 0; i < matricNumber.length; i++) {
					if (mat == matricNumber[i])
						checker = false;
					if (matricNumber[i] == 0) {
						matricNumber[i] = mat;
						this.matNum = mat;
						check = false;
					}
				
				}
			}
		}
		return this.matNum;
	}
	
	private int setMatricNo() {
		boolean count = true;
		while (count) {
		matNum = rand.nextInt(50000000);
		if (matNum > 9999999) {
			count = false;
			}
		}
		
		return matNum;
	}
	
}
