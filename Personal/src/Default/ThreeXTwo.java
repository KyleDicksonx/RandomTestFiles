package Default;
import java.io.FileWriter;
import java.io.IOException;

public class ThreeXTwo {
	public static void main(String[] args) throws IOException{
		
		FileWriter file = new FileWriter("output_number2.txt");
		
		long start = 359798904;//update when you end the program
		long loops = 0;
		long passedNum;
		StringBuilder  outString = new StringBuilder();
		
		while (loops<100000) {
			loops = 0;
			passedNum = start;
			
			while(passedNum != 4){
			if(passedNum % 2==1) {
				passedNum = (passedNum * 3) + 1;
			}
			else if(passedNum % 2 == 0) {
				passedNum = passedNum/2;
			}
			loops++;
			
			}
			
			outString.delete(0, outString.length());
			outString.append("Num Tested: " + start + "   Loops: " + loops + "\n");
			System.out.print(outString);
			file.write(outString.toString());
			
			start++;
		}
		file.close();
		
		
		
		
	}
}
