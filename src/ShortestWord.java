/*
 * Given a list of words and two words word1 and word2,
 * return the shortest distance between these two words in the list.                                            
 */

class ShortestWord{
	
	public static void main(String args[]){
		String input[]={"practice", "makes", "perfect", "coding", "makes"};
		ShortestWord object = new ShortestWord();
		String word1="makes";
		String word2="coding";
		int min=object.findDistance(word1,word2,input);
		System.out.println("Shortest distance between " + word1 + " and " + word2 + " is " + min);
	}
	
	public int findDistance(String word1,String word2,String input[]){
		int minimum = Integer.MAX_VALUE;
		int position1=-1;
		int position2=-1;
		for(int i=0;i<input.length;i++){
			if(word1.equals(input[i])){
				position1=i+1;
				if(position2!=-1)
					minimum=Math.min(minimum,Math.abs(position1-position2));
			}
			
			if(word2.equals(input[i])){
				position2=i+1;
				if(position1!=-1)
					minimum=Math.min(minimum,Math.abs(position1-position2));
			}
		}		
		return minimum;
	}
}