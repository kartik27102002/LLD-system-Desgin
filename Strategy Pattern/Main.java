import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           int[] arr={1,3,5,7,2,4,6,8};

           sortStrategy o= new BubbleSort();
           sortContext sortContext= new sortContext(o);
           sortContext.getStrategy(arr);
           System.out.println(Arrays.toString(arr));

           sortContext sortContext2= new sortContext(new MergeSort());
           sortContext.getStrategy(arr);
           System.out.println(Arrays.toString(arr));



        }

}