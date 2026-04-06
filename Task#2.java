class HospitalTemperature {

    public static void main(String[] args) {

                double[][] temp = {
            {98.6, 99.1, 100.5, 97.8, 101.2, 98.4, 99.0},
            {97.5, 98.2, 99.0, 100.2, 101.5, 98.9, 97.6},
            {96.0, 97.2, 98.0, 95, 100.0, 101.1, 98.7},
            {95.5, 96.4, 97.8, 98.9, 99.6, 100.4, 101.0},
            {94.0, 95.8, 96.9, 90, 99.2, 100.3, 101.6}
        };

        int feverCount = 0;
        double highestAvg = 0;
        int highestPatient = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (temp[i][j] < 95) {
                    temp[i][j] = 95;
                }
            }
        }


        for (int i = 0; i < 5; i++) {

            double sum = 0;

            for (int j = 0; j < 7; j++) {
                sum += temp[i][j];
                if (temp[i][j] > 100) {
                    feverCount++;
                }
            }

            double avg = sum / 7;
            System.out.println("Average temperature of Patient " + (i + 1) + " = " + avg);

       
            if (avg > highestAvg) {
                highestAvg = avg;
                highestPatient = i + 1;
            }
        }

        System.out.println("Patient with highest weekly average: Patient " + highestPatient);
        System.out.println("Temperature exceeded 100°F " + feverCount + " times");
    }
}