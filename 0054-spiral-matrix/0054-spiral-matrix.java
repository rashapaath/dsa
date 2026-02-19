import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        //intution
        //here the opder
        //traversing
        //1)l->r top row ..top++
        //2)t->b right column..right--
        //3)r->l bottom row; ..bottom--;
        //4)b->t left column left++
        //step 1)set  boundaries
        //step 2)traverse through above steps.and after each step upadte boudaries by shrinking
        int r=matrix.length;
        int c=matrix[0].length;
        int top=0;
        int left=0;
        int bottom=r-1;
        int right=c-1;
        //2)
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);

            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;}
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;}
        }
        return list;
        
    }
}