class Solution {
    public int findClosest(int x, int y, int z) {
        // int a = Math.abs(z-x);
        // int b = Math.abs(z-y);

        if(Math.abs(z-x)==Math.abs(z-y)){
            return 0;
        }
        else if(Math.abs(z-x)<Math.abs(z-y)){
            return 1;
        }
        return 2;
    }
}