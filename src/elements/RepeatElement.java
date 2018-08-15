package elements;

class RepeatElement {
	void printRepeating(int arr[], int size) {
		int i, j;
		System.out.println("Repeated Elements are :");
		for (i = 0; i < size; i++) {
			for (j = i + 1; j < size; j++) {
				if (arr[i] == arr[j])
					System.out.print(arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		RepeatElement repeat = new RepeatElement();
		int arr[] = { 10, 20, 20, 10, 20, 301 };
		int arr_size = arr.length;
		repeat.printRepeating(arr, arr_size);
	}
}