package LambdaTwo;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Lista destynacji: port_wylotu port_przylotu cena_EUR
        List<String> dest = Arrays.asList(
                "bleble bleble 2000",
                "WAW HAV 1200",
                "xxx yyy 789",
                "WAW DPS 2000",
                "WAW HKT 1000"
        );
        double ratePLNvsEUR = 4.30;

        List<String> result = dest.stream()
                .filter(i -> i.split(" ")[0].matches("WAW"))
                .map(i ->   "to " + i.split(" ")[1] + " - price in PLN: " + (int)(Integer.parseInt(i.split(" ")[2])*ratePLNvsEUR))
                .collect(Collectors.toList());


        /*<-- tu należy dopisać fragment
         * przy czym nie wolno używać żadnych własnych klas, jak np. ListCreator
         * ani też żadnych własnych interfejsów
         */

        for (String r : result) System.out.println(r);
    }
}
