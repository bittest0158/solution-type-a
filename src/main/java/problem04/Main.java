package problem04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] randomNum = numbers();
		int[] userNum = new int[randomNum.length];
		String randomStr = new String();
		int randomInt = 0;
		int user = 0;
		Scanner scan = new Scanner(System.in);
		
		if( user < 100 || user > 999 ) {
			System.out.println("세 자리를 입력해주세요.");
		}
		
		String userStr = String.valueOf(user);	
		for( int i = 0; i < userStr.length(); i++ ) {
			randomStr += randomNum[i];
			userNum[i] = Integer.parseInt(userStr.substring(i, i+1));
		}
		
		randomInt = Integer.parseInt(randomStr);
		int index = 0;
		int numIndex = 0;
		int s=0, b=0, o=0;
		while( true ) {
			System.out.print("> ");
			user = scan.nextInt();
			
			if( randomNum[numIndex] == userNum[numIndex] ) {
				s++;
			}
			
			if( index == 0 ) {
				if( randomNum[numIndex] == userNum[numIndex+1] ) {
					b++;
				} else {
					o++;
				}
				if( randomNum[numIndex] == userNum[numIndex+2] ) {
					b++;
				} else {
					o++;
				}
			} else if( index == 1 ) {
				if( randomNum[numIndex] == userNum[numIndex+1] ) {
					b++;
				} else {
					o++;
				}
			}
			
			System.out.println((index+1) + " - " + "S:" + s +", " + "B:" + b + ", " + "O:" + o);
			
			for( int i = 0; i < randomNum.length; i++ ) {
				randomStr += String.valueOf(randomNum[i]);
				userStr += String.valueOf(userNum[i]);
			}
			
			randomInt = Integer.parseInt(randomStr);
			user = Integer.parseInt(userStr);
			
			if( randomInt == user ) {
				break;
			}
			
			index++;
			numIndex++;
			if( numIndex == 3 ) {
				numIndex = 0;
			}
		}
		
	}
	
	// 세 숫자 랜덤 받기
	public static int[] numbers() {
		int[] result = new int[3];
		
		for( int i = 0; i < result.length; i++ ) {
			result[i] = (int) (Math.random() * 9 + 1);
			
			if( i >= 1 ) {
				while( result[i-1] == result[i] ) {
					result[i] = (int) (Math.random() * 9 + 1);
				}
			} else if( i >= 2 ) {
				if( result[i-1] == result[i] ) {
					while( true ) {
						result[i] = result[i] = (int) (Math.random() * 9 + 1);
						if( result[i-1] != result[i] ) {
							break;
						}
					}
				}
				
				if( result[i-2] == result[i] ) {
					while( true ) {
						result[i] = result[i] = (int) (Math.random() * 9 + 1);
						if( result[i-2] != result[i] ) {
							break;
						}
					}
				}
			}
			
			System.out.print(result[i] + " ");
		}
		System.out.println();
		
		return result;
	}
}