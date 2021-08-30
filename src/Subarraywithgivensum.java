import java.util.ArrayList;

public class Subarraywithgivensum {

    public static void main(String args[]){
        int[] arr={1};
        int n=1;
        int s=15;
        ArrayList<Integer> result= subarraySum(arr, n, s);
        System.out.println(result);
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> result= new ArrayList<Integer>();

        int sum=0;
        for(int i=0; i<n; i++)
        {
            for(int j =i; j<n; j++){
                sum+=arr[j];

                if(sum > s){
                    result.clear();
                    sum=0;
                    break;
                }
                else if(sum==s){
                    result.add(i+1);
                    result.add(j+1);
                    return result;
                }
            }
        }
        if(result.size()==0){
            result.add(-1);
        }
        return result;
    }
}
