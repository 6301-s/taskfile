package Sample;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileDemo {
	public static void main(String []args) throws Exception {
		File f = new File("first.txt");
			if (f.createNewFile()) {
				System.out.println("File successfully created.");
			}else {
				System.out.println("File already exist.");
			}
		FileWriter w= new FileWriter(f);
		w.write("add text\n");
		String str = "This is file";
		w.write(str);
		w.close();
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}
		File test = new File("unique.txt");
		FileWriter filewriter = new FileWriter(test);
		BufferedWriter bufferedFileWriter = new BufferedWriter(filewriter);
		filewriter.append("This line is appended to the already existing test file.");
		bufferedFileWriter.close();
		File rename = new File("unique.txt");
		test.renameTo(rename);
		File deletefile = new File("unique.txt");
		if (deletefile.delete()) {
			System.out.println("File deleted Successfully");
		}else {
			System.out.println("No such File.");

		}

	}
}
