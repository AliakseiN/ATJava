
public class Task9 {

	public static void main(String[] args) {
		
		// Определить сколько раз посторяется в тексет каждое слово, которое встречается в нем
		
		String text = "Hello, if you are reading this then you did a great job";
		String newText="";
		String[] onlyWords=text.split(" ");
		
		
        newText="";
		
		
		
		for(String word: onlyWords)
			
        {
            
            if(word.trim().length()>0)
                newText+=word+" ";
           
        }
		
		
	}

}
