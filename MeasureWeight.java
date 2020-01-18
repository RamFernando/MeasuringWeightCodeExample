public class MeasureWeight {

    public static void main(String[] args) {
        measureWeight(60);
    }

    private static void measureWeight(int weight) {

        int weights[] = {10, 5, 2, 1};
        int measuredWeights[] = new int[weights.length];

        while (weight > 0) {
            for (int j = 0; j < weights.length; j++) {
                if (weight >= weights[j]) {
                    measuredWeights[j] += 1;
                    weight -= weights[j];
                }
            }
        }

        for (int i = 0; i < measuredWeights.length; i++) {
            int measuredWeight = measuredWeights[i];
            if (measuredWeight != 0) {
                if (measuredWeight == 1) {
                    System.out.println(measuredWeight + " weight of " + weights[i] + " kg");
                } else {
                    System.out.println(measuredWeight + " weights of " + weights[i] + " kg");
                }
            }
        }
    }
}