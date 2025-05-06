package randomTestFiles;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
public class FibonacciSequencePrinter {
	public static void main(String[] args) throws IOException{
		Scanner kb = new Scanner(System.in);
		FileWriter outputFile = new FileWriter("FibonacciSequence.txt");
		long num1 = 1;
		long num2 = 0;
		long outputNum;
		int loops = 0;
		
		
		do {
		System.out.print("How many Fibonacci sequence numbers do you want (0-91): ");
		loops = kb.nextInt();
		} while (loops > 91 || loops < 0);
		
		while (loops > 0) {
			
			outputNum = num1 + num2;
			outputFile.write(Long.toString(outputNum) + "\n");
			
			num2 = num1;
			num1 = outputNum;
			
			System.out.println(outputNum);
			
			loops--;
		}
		kb.close();
		outputFile.close();
	}
}
