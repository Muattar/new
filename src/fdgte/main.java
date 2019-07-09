package fdgte;

 class main {

	 
	 public static void main(String[] args) 
		{
			String[] arr = {"hey","yolo","hi","this is long"};
			System.out.println(minVowels(arr));
			//should print "hi"
		}
		public static String minVowels(String[] words)
		{
			
		String 	minvol = words[0];
			
			for (int i = 0; i < words.length; i++) {
			          
			}
			
			if (isVowel (words [i]) == isVowel (minvol)) { 
				minvol = words[i]; 
				}else if (words[i].isVowel()== minvol.isVowel()){ 
				if(words[i].length() < minvol.length()){ 
				minvol = words[i]; 
				} 
				return minvol; 
				} 
				return minvol; 
				} 
				
			
			
		
		public static int countVowels(String s)
		{
			
		}
		public static boolean isVowel(char words)
		{
			return words == 'a' ||
				   words == 'e' ||
				   words == 'i' ||
				   words == 'o' ||
				   words == 'u';
		}
	}
	 
	 
}
