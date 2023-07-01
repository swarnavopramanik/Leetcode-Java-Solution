342. Power of Four



  class Solution {
    public boolean isPowerOfFour(int num) {
        int count = 0;
        for(int i =0;i <32; i++){
               // check bit is on 
            if (((num >>> i) & 1) != 0){   
                count++; 
                if(i%2 == 1) return false; // if 4 th ka power odd then return false 
            }
        }
        if(count == 1) return true; // if 4 th ka power even then return true 
        else return false;
    }
}
