public class CountingSort {

    // Fungsi utama Counting Sort
    public static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        // Cari nilai maksimum dalam array
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Buat array count untuk menyimpan frekuensi elemen
        int[] count = new int[max + 1];

        // Hitung kemunculan tiap elemen
        for (int num : arr) {
            count[num]++;
        }

        // Bangun kembali array yang terurut dari count[]
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    // Fungsi utama (main)
    public static void main(String[] args) {
        int[] data = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Array sebelum sorting:");
        printArray(data);

        countingSort(data);

        System.out.println("\nArray setelah Counting Sort:");
        printArray(data);
    }

    // Fungsi bantu untuk mencetak array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
