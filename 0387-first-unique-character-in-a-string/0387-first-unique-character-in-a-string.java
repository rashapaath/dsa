class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int[] freqarr=new int[26];
        for(int i=0;i<26;i++){
            freqarr[i]=-1;
        }
        for(int i=0;i<n;i++) {
            int index = s.charAt(i) - 'a';
            if (freqarr[index] == -1) {
                freqarr[index] = i;
            } else {
                freqarr[index] = -2;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freqarr[i]>=0){
                min=Math.min(min,freqarr[i]);
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}