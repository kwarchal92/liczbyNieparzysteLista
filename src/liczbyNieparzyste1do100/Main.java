package liczbyNieparzyste1do100;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> liczby = IntStream.rangeClosed(1,100)
                .filter(n -> n%2 == 1) //filtruje liczby nieparzyste
                .boxed() //opakowanie
                .collect(Collectors.toList()); //umieszcza liczby na liscie

        System.out.println(liczby); //wydruk klisty
    }
}
