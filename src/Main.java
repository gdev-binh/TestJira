public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
        sayHello();
    }
    public static void sayHello(){
        System.out.println("Hello Con Cho");
    }
    public static void swap(float a, float b){
        float temp = b;
        b = a;
        a = temp;
    }
    public static void bubbleSort(float[] a){
        for (int i = 0; i < a.length - 1; i++)
            for(int j = 0; j< a.length - 1; j ++ ){
                if (a[i] > a[j]){
                    swap(a[i],a[j]);
                }
            }
    }
}