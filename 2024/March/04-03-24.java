public class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        Arrays.sort(tokens);
        Deque<Integer> deque = new LinkedList<>();

        for (int token : tokens) {
            deque.add(token);
        }

        while (!deque.isEmpty()) {
            // When we have enough power, play token face-up
            if (power >= deque.peekFirst()) {
                power -= deque.pollFirst();
                score++;
            // We don't have enough power to play a token face-up
            // When there is at least one token remaining,
            // and we have enough score, play token face-down
            } else if (deque.size() > 1 && score > 0) {
                power += deque.pollLast();
                score--;
            // We don't have enough score, power, or tokens 
            // to play face-up or down and increase our score
            } else {
                return score;
            }
        }
        return score;
    }
}
