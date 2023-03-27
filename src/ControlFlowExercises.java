public class ControlFlowExercises {
    public static void main(String[] args){
       int i = 2;
       do {
           System.out.printf("%s%n",i);
           i*=i;
        }while (i<65536);
        System.out.printf("%s%n",i);
    }
}
