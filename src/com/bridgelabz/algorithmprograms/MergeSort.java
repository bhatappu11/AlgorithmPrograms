package com.bridgelabz.algorithmprograms;

public class MergeSort<K extends Comparable<K>> {
	public void merge(K[] words, int start, int middle, int end)
    {
		K[] temp = (K[])new Comparable[end - start + 1];
		int i = start, j = middle+1, k = 0;

		while(i <= middle && j <= end) {
			if(words[i].compareTo(words[j])<=0) {
				temp[k] = words[i];
				k++;
				i++;
			}
			else {
				temp[k] = words[j];
				k++;
				j++;
			}
		}

		while(i <= middle) {
			temp[k] = words[i];
			k += 1; i += 1;
		}

		while(j <= end) {
			temp[k] = words[j];
			k += 1; j += 1;
		}

		for(i = start; i <= end; i += 1) {
			words[i] = temp[i - start];
		}
    }
	public void mergeSort(K[] words, int start, int end){
        if (start < end) {
            int middle =start+ (end-start)/2;

            mergeSort(words, start, middle);
            mergeSort(words, middle + 1, end);
 
            merge(words, start, middle, end);
        }
    }
 
    public void printArray(String words[]) {
        for (int index = 0; index < words.length; index++) {
            System.out.print(words[index] + " ");
        }
        System.out.println();
    }

	public static void main(String[] args) {
		MergeSort<String> sortObject = new MergeSort<String>();
		String sentence = "We feed our dog three times a day";
        String words[] = sentence.toLowerCase().split(" ");
 
        sortObject.mergeSort(words, 0, words.length - 1);
        sortObject.printArray(words);
	}

}
