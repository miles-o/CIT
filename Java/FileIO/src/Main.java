import java.io.*;
import java.util.Arrays;
import java.time.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("collectors.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("totalCollection.txt"));
            bw.write("Report dated " + LocalDateTime.now() + "\n");
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                String name = data[0];
                String[] weights = data[1].split(",");
                Collector collector = new Collector(name, weights);
                bw.write(collector.calculateTotal());
            }
            bw.flush();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}