import java.io.*;

public class LineCount {
	private static final String errmsg = "Usage: java LineCount <in>";

	public static void main(String[] args) {
		if (args.length != 1) {
		System.err.println(errmsg);
		return;
		}
		String filename = args[0];
		int lineCount = 0;

		// ... Ihr Programmcode ...

		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(filename));
		}
		catch (FileNotFoundException e) {
			System.err.println("Datei '" + filename + "' wurde nicht gefunden!");
		}

		try {
			String line;
			/*
			lineCount--;
			do {
				line = in.readLine();
				lineCount++;
			}
			while (line != null);
			*/

			line = in.readLine();
			while (line != null) {
				lineCount++;
				line = in.readLine();
			}
		}
		catch (IOException e) {
			System.err.println("Fehler beim Lesen der Datei '" + filename + "'!");
		}

		try {
			in.close();
		}
		catch (IOException e) {
			System.err.println("Fehler beim Schließen der Datei '" + filename + "'!");
		}

		System.out.println(lineCount);
	}
}

