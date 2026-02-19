class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        //1)transpose
        for(int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //2)reverse
        for(int i=0;i<r;i++){
            //for each row we have to do reverse;
            //for each roow iteration we have to set inin and end (which will be column index)
            int ini=0;
            int end=r-1;
            //reversing
            while(ini<end){
                int temp=matrix[i][ini];
                matrix[i][ini]=matrix[i][end];
                matrix[i][end]=temp;
                ini++;
                end--;
            }
        }

        
    }
}