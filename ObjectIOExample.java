package CodeExamples;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOExample {

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.dat"));
		out.writeObject(new Integer(1));
		out.writeObject(new Car("123", Car.ExteriorColor.BLUE));
		out.flush();
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.dat"));
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		out.close();
		in.close();
	}

}