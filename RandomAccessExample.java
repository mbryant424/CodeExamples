package CodeExamples;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessExample {

	public static void main(String[] args) throws IOException {
		RandomAccessFile f = new RandomAccessFile("test.dat", "rw");
		byte[] msg = "Hello World!".getBytes();
		f.seek(200);
		f.write(msg);

		byte[] buffer = new byte[msg.length];
		f.seek(200);
		f.read(buffer);
		System.out.println(new String(buffer));
		f.close();
	}
}
