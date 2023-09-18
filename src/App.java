public class App {
    public static void main(String[] args) {
        int col = 100;
        double[] array = new double[col];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }

            avg += array[i]/array.length;
//            System.out.println(avg);
        }
        System.out.println(min + " " + max + " " + avg);
    }
}
