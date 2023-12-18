package test;

public class quiz {
	private String firsTwotLetter,lastTwoLetter;
	private int count = 0;
	
	// 1. Square Area
	public int square(int x){
		return x*x;
	}
	
	public quiz (String firs, String last) {
		this.firsTwotLetter = firs;
		this.lastTwoLetter = last;
		
	}
	
	public quiz (int count) {
		this.count = count;
		
	}
	// 2. Number of "a" and "A" letters
	public int countLetterA(String word){
		
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)=='a'|| word.charAt(i)=='A'){
				count++;
				System.out.print(count);
			}
		}
		return count;
	}
	//3. Two Letters are the same
	public boolean checkTwoLetter(String letter){
		
		if(letter.length()<=1){
			return false;
		}
		else if(letter.length()==2){
			return true;
		}
		firsTwotLetter = letter.substring(0,2);
		lastTwoLetter = letter.substring(letter.length()-2);
		
		return firsTwotLetter.equals(lastTwoLetter);	
	}
	

}
