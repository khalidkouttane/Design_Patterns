import java.util.Arrays;

public class SelectionSort implements SortStrategy {
	
	@Override
	public void sort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++)  
        {
             int index = i;  
             for (int j = i + 1; j < numbers.length; j++) {
                  if (numbers[j] < numbers[index]){ 
                       index = j;
                  }
             }

             int min = numbers[index];
             numbers[index] = numbers[i]; 
             numbers[i] = min;
        }
		System.out.println("\nSorted array :" + Arrays.toString(numbers) + "\n");
	}
}
