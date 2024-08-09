import java.io.*;
import java.util.Date;

public class ProcessCollectorFile {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/resources/totalCollection.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("src/resources/collectors.txt"));
            writer.write("Report dated " + new Date());
            String inLine = reader.readLine();

            while (inLine != null) {
                String[] lineArray = inLine.split(";");
                String name = lineArray[0];
                String[] weights = lineArray[1].split(",");

                Collector collector = new Collector(name, weights);
                writer.write("\n" + collector.calculateTotal());
                inLine = reader.readLine();
            }
            reader.close();
            writer.flush();
            System.out.println("Calculations finished and recorded to totalCollection.txt");
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}
