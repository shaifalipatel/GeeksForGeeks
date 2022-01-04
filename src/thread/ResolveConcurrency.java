package thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ResolveConcurrency extends Thread {

    public static int amount = 0;
    public static void main(String[] args) {
       /* ResolveConcurrency thread = new ResolveConcurrency();
        thread.start();
        while (thread.isAlive()){
            System.out.println("Waiting thread to complete");
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);

        ArrayList arrayList = new ArrayList<>();
        arrayList.add(new Employee());
        arrayList.add(1);
        arrayList.add("Hello");

        System.out.print(arrayList);*/

        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);

        List<String> names = Arrays.asList("Reflection","Sollection","Stream");
        Long result = names.stream().filter(s->s.startsWith("S")).count();
        System.out.println(result);

        Employee e1= new Employee();
        e1.name="hello";
        Employee e2= e1;
        System.out.println(e1.name.equals(e2.name));
        System.out.println(e1==e2);
    }

    public void run() {
        amount++;
        System.out.println(amount);
        System.out.println("Inside Thread 1");
    }
}
