package refactoring;

import com.sun.tools.javac.util.Pair;

import java.util.List;

import static java.util.Arrays.asList;

public class AutomaticRefactoring01 {
	private PairList sutWith (final int input1, final int output1, final int input2, final int output2) {
		return new PairList(
				asList(
						pair(output1, input1),
						pair(output2, input2)));
	}

	private PairList sutWith (final int input, final int output) {
		return new PairList(
				asList(
						pair(output, input)));
	}

	private static class PairList {
		public PairList (List<Pair> pairs) {
		}
	}

	private Pair<Integer, Integer> pair (final int output2, final int input2) {
		return
				new Pair<>(output2, input2);
	}
}
