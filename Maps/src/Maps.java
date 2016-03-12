import java.util.HashMap;


public class Maps {


	public static void main(String [] args){
		
		HashMap<String, String> map = new HashMap<String, String>(2,1f);
		
		map.put("B", "letraB");
		map.put("B", "letrab");
		map.put("A", "letraa");

		
		for(String key : map.keySet()){
			System.out.print(key);
			System.out.print(" - ");
			System.out.println(map.get(key));
		}
		
	}
	
}
