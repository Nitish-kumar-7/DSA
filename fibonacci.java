class Solution {
    public int fib(int n) {

        if(n==0 || n==1){
            return n;
        }

        // int fnm1 = n-1;
        // int fnm2 = n-2;
        // int fn = fnm1+fnm2;
        return fib(n-1)+fib(n-2);
        
    }
}
