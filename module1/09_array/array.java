public class array{
  public static void main(String[] args) {
      int[] arr = {3,5,6,7};

      for(int a = 0; a < 4; a++){
        System.out.print(arr[a] + " ");
      }

      for(int i = 0; i < 4; i++){
        if(arr[i] > arr[1]){
          System.out.println(arr[i]);
        }
      }
  }
}