import java.util.Random;

 public class RandomValues {

 	public int[] generate4DigitRandomArray(int size) {
     	Random random = new Random();
     	int[] randomNumbers = new int[size];
     	for (int i = 0; i < size; i++) {
         	randomNumbers[i] = 1000 + random.nextInt(9000);
     	}
     	return randomNumbers;
 	}

 	public double[] findAverageMinMax(int[] numbers) {
     	double sum = 0;
     	int min = numbers[0];
     	int max = numbers[0];
     	for (int number : numbers) {
         	sum += number;
         	min = Math.min(min, number);
         	max = Math.max(max, number);
     	}
     	double average = sum / numbers.length;
     	return new double[]{average, min, max};
 	}

 	public static void main(String[] args) {
     	RandomValues rv = new RandomValues();
     	int[] randomNumbers = rv.generate4DigitRandomArray(5);
     	double[] results = rv.findAverageMinMax(randomNumbers);

     	System.out.println("Random Numbers: ");
     	for (int number : randomNumbers) {
         	System.out.println(number);
     	}
     	System.out.println("Average: " + results[0]);
     	System.out.println("Minimum: " + results[1]);
     	System.out.println("Maximum: " + results[2]);
 	}
 }




