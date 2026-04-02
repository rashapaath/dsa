import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> outer=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> ls=pascalrow(i);
            outer.add(ls);
        }
        return outer;
    }
    static List<Integer> pascalrow(int n){
        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        for(int i=2;i<=n;i++){
            int elt=(ls.get(i-2)*(n-(i-1)))/(i-1);
            ls.add(elt);
        }
        return ls;
        
    }
}