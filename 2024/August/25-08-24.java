class Solution {
    // Function to count number of pairs such that x^y is greater than y^x.
    public long countPairs(int x[], int y[], int M, int N) {
        // code here
        double logVal[]=new double[N];
        for(int i=0;i<N;i++){
            logVal[i]=logarithm(y[i]);
        }
        Arrays.sort(logVal);
        long cnt=0L;
        for(int i=0;i<M;i++){
            double val=logarithm(x[i]);
            int l=0,h=N-1;
            while(l<=h){
                int mid=(l+h)/2;
                if(logVal[mid]>val){
                    h=mid-1;
                }else if(logVal[mid]<=val){
                    l=mid+1;
                    // pairs=mid+1;
                }
            }
            cnt+=N-l;
        }
        return cnt;
        
    }
    public double logarithm(int x){
        return x/(double)Math.log(x);
    }
}
