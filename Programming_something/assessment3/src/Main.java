import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String[]> clients = new ArrayList();
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader("resources/ClientIncomes.txt"));

            while ((line = br.readLine()) != null) {
                String[] splitLine = line.split(",");
                clients.add(splitLine);
            }

            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        double[] incomeThresholds = {18200,37000,80000,180000};
        double[] taxPercents = {0.19,0.325,0.37,0.45};

        for (String[] client : clients) {
            double income = Double.parseDouble(client[2]);

            double res = 0;
            for (int i = 0; i < incomeThresholds.length; i++) {
                if (income > incomeThresholds[i]) {
                    double taxableIncome;
                    if (i < incomeThresholds.length-1 && income > incomeThresholds[i+1]) {
                        taxableIncome = incomeThresholds[i + 1] - incomeThresholds[i];
                    } else {
                        taxableIncome = income - incomeThresholds[i];
                    }
                    res += taxableIncome * taxPercents[i];
                } else {
                    break;
                }
            }
            System.out.println(res);
        }
    }
}