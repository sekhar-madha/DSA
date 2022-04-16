class Solution {
    public int trap(int[] h) {
        int n=h.length;
        int[] prfx=new int[n];
        int[] sufx=new int[n];
        prfx[0]=h[0];
        sufx[n-1]=h[n-1];
        for(int i=1;i<n;i++){
            if(h[i]<prfx[i-1]) prfx[i]=prfx[i-1];
            else prfx[i]=h[i];
        }
        for(int i=n-2;i>=0;i--){
            if(h[i]>sufx[i+1]) sufx[i]=h[i];
            else sufx[i]=sufx[i+1];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.min(sufx[i],prfx[i])-h[i];
        }
        return sum;
    }
}
