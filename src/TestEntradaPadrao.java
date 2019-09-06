import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class TestEntradaPadrao {

	public static void main(String[] args) throws IOException {

		// InputStream in = System.in;
		// InputStream in = new FileInputStream("arquivo.txt");
		// InputStreamReader isr = new InputStreamReader(in);
		// BufferedReader br = new BufferedReader(isr);

		//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));

		InputStream is = new FileInputStream("arquivo.txt");
		//InputStream is = System.in;
		Scanner br = new Scanner(is);
		
		System.out.println("Digite sua msg:");

		//String palavra = br.readLine();
		//String palavra = br.nextLine();
		//while (palavra != null) {
		//while (br.hasNextLine()) {
			//String palavra = br.nextLine();
			//System.out.println(palavra);
			//palavra = br.nextLine();
			//palavra = br.readLine();
		//}
		
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		while (br.hasNextLine()) {
			bw.write(br.nextLine());
			bw.newLine();
		}

		br.close();
		bw.close();

	}

}
