
public class Task9 {

	public static void main(String[] args) {
		
		
		String text = "Hello, if you are reading this then you did a great job";
		
char [] charact = text.toCharArray();
int count = 0;
for(int i = 0; i < charact.length; ++i) {
if(charact[i] == 'Hello')
      ++count;
System.out.println(count);
		
	}}}