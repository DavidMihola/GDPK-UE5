import java.io.*;

public class Intersect {
	private static final String errmsg = "Usage: java Intersect <in1> <in2> <out>";

	public static void main(String[] args) {
		if (args.length != 3) {
			System.err.println(errmsg);
			return;
		}

		String inFilename1 = args[0];
		String inFilename2 = args[1];
		String outFilename = args[2];

		BufferedReader in1 = null;
		try {
			in1 = new BufferedReader(new FileReader(inFilename1));
		}
		catch (FileNotFoundException e) {
			System.err.println("Datei '" + inFilename1 + "' wurde nicht gefunden!");
		}

		BufferedReader in2 = null;
		try {
			in2 = new BufferedReader(new FileReader(inFilename2));
		}
		catch (FileNotFoundException e) {
			System.err.println("Datei '" + inFilename2 + "' wurde nicht gefunden!");
		}

		BufferedWriter out = null;
		try {
            out = new BufferedWriter(new FileWriter(outFilename));
		}
		catch (IOException e) {
			System.err.println("In Datei '" + outFilename + "' kann nicht geschrieben!");
		}

		try {
			String line1;
			String line2;

			line1 = in1.readLine();
			line2 = in2.readLine();

			while ( (line1 != null) && (line2 != null) ) {
				if (line1.equals(line2)) {
					out.write(line1);
					out.newLine();
				}
				line1 = in1.readLine();
				line2 = in2.readLine();
			}
		}
		catch (IOException e) {
			System.err.println("Fehler beim Lesen!");
		}
		finally {
			try {
				in1.close();
				in2.close();
				out.close();
			}
			catch (IOException e) {
				System.err.println("Fehler beim Schließen der Datei!");
			}
		}

	}
}

