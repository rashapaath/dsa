class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] count = new int[26];

        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int window = p.length();

        for (int i = 0; i < s.length(); i++) {

            count[s.charAt(i) - 'a']--;

            if (i >= window) {
                count[s.charAt(i - window) - 'a']++;
            }

            if (i >= window - 1 && isZero(count)) {
                ans.add(i - window + 1);
            }
        }

        return ans;
    }

    private boolean isZero(int[] count) {
        for (int x : count) {
            if (x != 0) {
                return false;
            }
        }
        return true;
    }
}