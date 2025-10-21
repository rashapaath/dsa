
class Solution {
    public int smallestEvenMultiple(int n) {
       int g=Math.gcd(2,n);
       int r=(2*n)/g;
       return r;
    }
}