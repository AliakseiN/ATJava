//решить задачу: 
//
//с консоли считывается текст. 
//Каждую n- ю букву каждого слова (n также вводится с консоли) заменить символом “%”. 
//Использовать классы Слово, Предложение, Абзац.
//Предусмотреть неверный ввод и всевозможные проверки.
//Залить результат работы в гит-репозиторий, ссылку скинуть в скайп в личку.

//Цель - показать все возможности и знания, а также умение их применять. Чем больше - тем лучше.

public class Taks8MianClass {
	

	public static void main(String[] args) {
		
		
		  
		readFromConsole read = new readFromConsole();
	
		Paragraph par = new Paragraph(); 
		
		  par.getInfo(); //visible from anywhere
		  par.getInfoFromAnyWhere();////visible from anywhere
		  par.infoOnlyInClass();// if show in another package it will be an error due to visible in package
		  par.getParapraph();//visible from anywhere
		  par.getInfoOnlyInPackage(); //Only visible in class Paragraph		  
		  
		  
//		  
//		  String tempVariable;
//
//			String[] text = variantChoose.split(" "); // "Разделяет строку на слова")
//			
//			
//			for (int l = 0; l < text.length; l++) /*определяем длинну массива*/ {
//				
//				if (k < text[l].length()) /*проверяем если введённое число больше чем длинна*/ {
//					
//					tempVariable = "";
//					tempVariable += text[l].substring(0, k - 1);
//					tempVariable += '%';
//					tempVariable += text[l].substring(k, text[l].length());
//					text[l] = tempVariable;
//				}
//
//				System.out.print(" " + text[l]);
//
//			}
//	}
	
}
}
