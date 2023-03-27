public class ControlFlowExercises {
    public static void main(String[] args){
        for(int i = 2; i<10000;i*=i){
              System.out.printf("%s ",i);
              if(i==256){
                  System.out.print(i*i);
              }
          }
        }

    }
