package assignment18;


public class Question3 {
	public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static boolean isBadVersion(int version) {
       
        return false;
    }

    public static void main(String[] args) {
        int n = 10;
        int firstBad = firstBadVersion(n);
        System.out.println("First bad version: " + firstBad);
    }
}