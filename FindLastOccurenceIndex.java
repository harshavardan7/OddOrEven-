import java.util.Scanner;

class FindLastOccurenceIndex {

    static int findLastIndex(int arr[], int A, int startIndex) {
        int n = arr.length;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == A) {
                ans = i;
            }
        }
        if (ans > 0) {

            return ans;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }

        int T = s.nextInt();
        System.out.println(findLastIndex(A, T, N - 1));
    }

}