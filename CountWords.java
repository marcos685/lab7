import java.util.*;

public class CountWords{

	public void palavras(String str){
		String[] vetPalavras = str.split(" ");
		List<String> comRepeticao = new ArrayList<String>();
		Set<String> semRepeticao = new HashSet<String>();

		for (String s : vetPalavras){
			comRepeticao.add(s);
			semRepeticao.add(s);
		}

		System.out.println("Total de palavras: " + comRepeticao.size() + 
							"\nTotal de palavras distintas: " + semRepeticao.size());
	}

	public static void main(String[] args) {
		String str = "hello hello world";
		CountWords contador = new CountWords();

		contador.palavras(str);

	}
}
