package test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class testclass {

	public static void main(String[] args) {
		// generateReport();

		String filePath = System.getProperty("user.dir");

		try (Stream<Path> paths = Files.walk(Paths.get(filePath + "\\Reports"))) {
			File totalReport = new File("TotalReports.txt");
			totalReport.createNewFile();
			paths.filter(Files::isRegularFile).forEach(file -> generateReport(file.toString(), totalReport));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void generateReport(String filePath, File totalReport) {
		try (LineNumberReader br = new LineNumberReader(new FileReader((filePath)))) {

			// CSV file delimiter
			String DELIMITER = ",";

			// read the file line by line
			String line;
			double total = 0;
			double tax = 0;
			double highestPrice = 0;
			String highestPriceProduct = "";
			double lowestPrice = Double.MAX_VALUE;
			String lowestPriceProduct = "";
			String fromDate = "";
			String toDate = "";
			String[] columns = null;
			;
			while ((line = br.readLine()) != null) {
				if (br.getLineNumber() == 1)
					continue;
				columns = line.split(DELIMITER);
				if (br.getLineNumber() == 2)
					fromDate = columns[0];
				double amount = Double.parseDouble(columns[2])
						- (Double.parseDouble(columns[2]) * (Double.parseDouble(columns[3]) / 100));

				if (highestPrice < amount) {
					highestPrice = amount;
					highestPriceProduct = columns[1];
				}
				if (lowestPrice > amount) {
					lowestPrice = amount;
					lowestPriceProduct = columns[1];
				}

				total = total + amount;

			}
			toDate = columns[0];

			tax = total * 0.0875;

			FileWriter myWriter = new FileWriter(totalReport, true);
			myWriter.write("Report from " + fromDate + " to " + toDate + "\n");
			myWriter.write("The total is " + total + "\n");
			myWriter.write("The tax is " + tax + "\n");
			;
			myWriter.write("The highest price item is #" + highestPriceProduct + " at " + highestPrice + "\n");
			myWriter.write("The lowest price item is #" + lowestPriceProduct + " at " + lowestPrice + "\n");
			myWriter.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Report has been written to file:  " + totalReport.getName());
		}
	}

}
