package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		String num = String.valueOf(number);
		int result = 0;
		
		for( int i = 0; i < num.length(); i++ ) {
			if( num.substring(i, i+1).equals("3") || num.substring(i, i+1).equals("6") || num.substring(i, i+1).equals("9") ) {
				result++;
			}
		}
		
		return result;
	}
}