class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i =0 ; i<9;i++){
            for(int j=0;j<9;j++){
                char nums = board[i][j];
                if(nums != '.'){
                    if(!set.add(nums+"at row" + i)||
                        !set.add(nums +"at col" + j)||
                        !set.add(nums +"atbox"+ i/3 + "-"+j/3)){
                            return false;
                        }
                }
            }
        }
        return true;
    }
}