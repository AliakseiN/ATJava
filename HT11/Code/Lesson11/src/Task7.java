
public class Task7 {

	public static void main(String[] args) {
		// Из текста удалить все символы, кроме пробелов, не являющиеся буквами. Между последовательностями подряд идущих букв оставить хотя бы один пробел
	   
		String text ="Hello 5s, i3f yo55u are read2342ing thi123s th5345en you d234id a gre11at j234()6@!@$ob";
		System.out.println();
		
		        String newText="";
		  
		        
		        char[] masCharacter=text.toCharArray();
		        
		        for(char charect: masCharacter)
		        {
		            
		            if(Character.isLetter(charect) || Character.isWhitespace(charect))
		                newText+=charect;
		        }
		        System.out.print(newText );
		       
		        String[] onlyWords=text.split(" ");
		        newText="";
		        for(String word: onlyWords)
		        {
		            
		            if(word.trim().length()>0)
		                newText+=word+" ";
		           
		        }
		
		}
 
	}


