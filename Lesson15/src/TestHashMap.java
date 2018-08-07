import java.util.*;

public class TestHashMap {

	public static void main(String[] args) {

		Map <Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(0, "Belarus");
		map1.put(1, "Ukraine");
		
		Map <Integer, String> map = new HashMap<Integer, String>(map1);
		
		map.put(2, "Canada");
		map.put(3, "Usa");
		System.out.println(map);
		
		map.remove(0);
		map.get(1);
		for (Map.Entry<Integer, String> country : map.entrySet()) {
		
			System.out.println(country.getKey() +  " " + country.getValue());
			
			map.containsKey(2);
			
			
		}
	}

}
