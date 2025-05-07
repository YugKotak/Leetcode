class Solution {
    public boolean isAnagram(String s, String t) {
        String s1[] = s.split("");
        String t1[] = t.split("");
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1, t1);
    }
}