import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Combination {

    public List<List<Integer>> generateCombinations(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        backtrack(combinations, n, k, new ArrayList<>(), 1);
        return combinations;
    }
    private void backtrack(List<List<Integer>> combinations, int n, int k,
                           List<Integer> combination, int start) {

        if (k == 0) {
            combinations.add(new ArrayList<>(combination));
            return;

        }
        for (int i = start; i <= n - k + 1; i++) {
            combination.add(i);
            backtrack(combinations, n, k - 1, combination, i + 1);
            combination.remove(combination.size() - 1);
        }
    }


    public static void main(String[] args) {
        Combination c = new Combination();
        System.out.println(c.generateCombinations(4, 2));


    }
}
