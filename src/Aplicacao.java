import java.util.Map;
import java.util.TreeMap;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> votos = new TreeMap<>();

		votos.put("Alex Blue", 15);
		votos.put("Maria Green", 22);
		votos.put("Bob Brown", 21);

		// contagem segunda seção

		votos.put("Alex Blue", votos.get("Alex Blue") + 30);
		votos.put("Bob Brown", votos.get("Bob Brown") + 15);
		votos.put("Maria Green", votos.get("Maria Green") + 27);

		// contagem terceira seção

		votos.put("Alex Blue", votos.get("Alex Blue") + 31);
		votos.put("Bob Brown", votos.get("Bob Brown") + 25);
		votos.put("Maria Green", votos.get("Maria Green") + 22);
		
		
		for(String key : votos.keySet()){
			System.out.println(key + " " + votos.get(key));
		}
	}

}
