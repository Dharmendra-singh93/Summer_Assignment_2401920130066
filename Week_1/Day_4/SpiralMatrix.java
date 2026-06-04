class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int top=0; int down = matrix.length-1;
        int left=0; int right=matrix[0].length-1;
        while(left<=right && top<=down){
            //top
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            //right col
            for(int j=top; j<=down; j++){
                list.add(matrix[j][right]);
            }
            right--;
            //down row
            if(top<=down){
            for(int i=right; i>=left; i--){
                list.add(matrix[down][i]);
            }
            down--;
            }
            //left col
            if(left<=right){
            for(int j=down; j>=top; j--){
                list.add(matrix[j][left]);
            }
            left++;
            }
        }
        return list;
    }
}