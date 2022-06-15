import java.util.Arrays;

public class BubbleSort implements SortStrategy {

	@Override
	public void sort(int[] numbers) {
		int taille = numbers.length;  
        int tmp = 0;  
        for(int i=0; i < taille; i++) {
        	for(int j=1; j < (taille-i); j++) {  
        		if(numbers[j-1] > numbers[j]) {
	                //echanges des elements
	                tmp = numbers[j-1];  
	                numbers[j-1] = numbers[j];  
	                numbers[j] = tmp;  
                }
 
            }
        }
        System.out.println("\nSorted array :" + Arrays.toString(numbers) + "\n");
	}

}
