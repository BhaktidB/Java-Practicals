package algorithm;

import java.util.List;

/*	NON ARRAY APPROACH
 * for(int j = 0; j < numInputs; j++){
    for(int k = 0; k < numInputs; k++){
        cin >> curInput;
        if(j == k){
            leftD += curInput;
        }
        if(j+k == (numInputs-1)){
            rightD += curInput;
        }
    }
}
ans = abs(leftD-rightD);
 */
public class Diagonal_difference {
	/*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int leftdiagonal = 0, rightdiagonal = 0;
    for(int i = 0, j = arr.get(0).size()-1; i < arr.get(0).size(); i++, j--){
        leftdiagonal = leftdiagonal + arr.get(i).get(i);
        rightdiagonal = rightdiagonal + arr.get(i).get(j);
    }
    return Math.abs(leftdiagonal - rightdiagonal);
    }
}
