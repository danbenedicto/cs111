public class LongestRun {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		String s = IO.readString();

		int runStart = 0;
		int maxRunLength = 0;
		int maxRunStart = 0;

		for (int i = 1; i <= s.length(); i++) {
			if (i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
				// aabbbbcc
				// 012345678

				int runLength = i - runStart;
				if (runLength > maxRunLength) {
					maxRunLength = runLength;
					maxRunStart = runStart;
				}

				runStart = i; // prepare for next run
			} 
		}
	}
}
