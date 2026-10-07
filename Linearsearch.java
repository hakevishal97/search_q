public class Linearsearch{
    public static void main (String args[]){
        int arr[]={10,20,30,40};
        int Target=30;
        boolean found =false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==Target){
               System.out.println(i);
                found = true;
            }
        }
        System.out.println(found);
        if(!found){
            System.out.println("Element not found");
        }

    }
}