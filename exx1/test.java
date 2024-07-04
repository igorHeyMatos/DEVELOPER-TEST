package exx1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<String> listString = Arrays.asList("Ana", "ana", "amanda", "ana paula", "ano", "maria", "Amo", "ama");

        listMethod(listString);

    }

    public static List<String> listMethod(List<String> listString) {
        List<String> newList = new ArrayList<>();
        for (String string : listString) {
            if (string.startsWith("a") && string.length() == 3) {
                newList.add(string);
            }
        }

        for (String string : newList) {
            System.out.println(string);
        }
        return newList;
    }
}
