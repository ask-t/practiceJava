import java.util.ArrayList;

public class Array {

    public static void main(String[]args){
        String[] arr = new String[10];
        ArrayList<String> list = new ArrayList<>();

        list.add("index1");
        list.add("index2");

        System.out.println(list);
        System.out.println(list.get(0));

        list.set(1,"index1.5");
        System.out.println(list);

    }
}
