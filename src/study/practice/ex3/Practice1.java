package study.practice.ex3;

/**
 * 1,2,3,4를 이용하여 세자리 자연수를 만드는 방법 (순서 O, 증복 X )의 각 결과를 출력하시오.
 *
 * //방법 1
 *
 */
public class Practice1 {
    public static void permutation(int[] arr, int depth, int n , int r){
       //탈출조건
        if (depth==r){
            for (int i = 0; i<r; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }
        for (int i = depth;i<n;i++){

            //자리를 바꿔주고
            swap(arr,depth,i);
            permutation(arr, depth+1, n, r);
            //원상복귀
            swap(arr,depth,i);
        }
    }
    static void swap(int[] arr, int dept , int idx){
        int temp = arr[dept];
        arr[dept] = arr[idx];
        arr[idx] = temp;
    }

    public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    permutation(arr,0,4,3);


    }
}
