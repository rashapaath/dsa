import java.util.TreeMap;
class Solution {
    public int firstUniqChar(String s) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            if(map.get(ch)==1){
                return i;
            }
        }
        return -1;
        
    }
}