public class Collector {
    private String name;
    private final int MAX_WEEKS = 4;
    private double[] weights = new double[MAX_WEEKS];

    public Collector(String inName, String[] inWeights) {
        name = inName;
        for (int i = 0; i < MAX_WEEKS; i++) {
            weights[i] = Double.parseDouble(inWeights[i]);
        }
    }

    public Collector(String inName, double[] inWeights) {
        name = inName;
        weights = inWeights;
    }

    public String calculateTotal() {
        double totalWeight = 0;
        for (double weight: weights) {
            totalWeight += weight;
        }
        return name + "," + totalWeight;
    }
}
