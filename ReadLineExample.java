package CodeExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadLineExample {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("data/hosts.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
			try {
				//StringTokenizer tokenizer = new StringTokenizer(line);
				//tokenizer.hasMoreTokens();
				//tokenizer.nextToken();
				//Conceptually an Iterable
				
				String[] tokens = line.split(" ");
				System.out.println(new HostDescription(tokens[0], Double.parseDouble(tokens[1]), Double
						.parseDouble(tokens[2])));
				StringTokenizer tokenizer = new StringTokenizer(line);
				System.out.println(new HostDescription(tokenizer.nextToken(),
						Double.parseDouble(tokenizer.nextToken()), Double.parseDouble(tokenizer.nextToken())));
			} catch (Exception e) {
				System.err.println("cannot correctly parse: " + line);
				e.printStackTrace();
			}
		}
		reader.close();
	}

	static class HostDescription {
		String hostName;
		double longitude;
		double latitude;

		HostDescription(String hostName, double longitude, double latitude) {
			this.hostName = hostName;
			this.longitude = longitude;
			this.latitude = latitude;
		}

		public String toString() {
			return hostName + " (" + longitude + ", " + latitude + ")";
		}
	}

}