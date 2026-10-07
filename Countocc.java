public class Countocc {
    
    public static int countOccurence(int[]arr,int target){
        int count =0;
for(int i=0;i<arr.length;i++){
    if(arr[i]==target){
        count++;
    }
}
return count;
    }
    public static void main(String[] args) {
int arr[]={11,22,33,22,333,33,33};
int target=33;
System.out.println(countOccurence(arr,target));


    }
}