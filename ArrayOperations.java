public class ArrayOperations {

    public static void main(String[] args) {
       int[] a = {1,6,3,5,6,11,44,6,2,6,6,1,10,6};
       int n = a.length-1;
       System.out.println("Length ="+(a.length));
       for (int i = 0; i < a.length; i++) {
         for (int j = a.length-1; j >= 0; j--) {
           System.out.println(i+"="+a[i]+"  j ="+a[j]);
             if(a[i] == 6)
             {
           
              if(a[i] == 6)
              {
                 if(a[i] == a[j])
                 {
                    a[i] = a[j-1];
                    a[j-1] = 6;

                 }
              }
           }
          }
      }
      for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
      }
    }
}