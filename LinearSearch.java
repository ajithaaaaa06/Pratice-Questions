public class LinearSearch{
    public static int ls(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[]={2,3,4,5,67,8,12,34,65,23};
        int key = 12;
        int index = ls(numbers,key);
        if(index==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is at index : " + index);
        }
    }
}