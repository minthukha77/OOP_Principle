public class Test2 {

    public static void main(String[] args) {
        int [] array = {};
        int result = f(array);
        System.out.println(result);  // Print the result


        char [] d = {'a','b','c','d','e'};
        char[] result4 = f(d, 0, 6);
        System.out.println(result4);

    }

    public static int f(int a[]){

        int sumOdd = 0;
        int sumEven = 0;

        for(int i=0; i< a.length;i++){
            if (a[i]%2 == 0) {
                sumEven+=a[i];
            }else{
                sumOdd+=a[i];
            }
        }
        return sumOdd - sumEven;
        
    }

    public static char[] f(char[] a,int start,int len){
       
        if (start >= a.length || len > a.length || start < 0 || len < 0) {
            return null;
        }

        try {
            char[] result = new char[len];
            for(int i=start;i<len;i++){
                result[i] = a[i];
            }
            return result;
            
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }

                

        
    }
    
}
