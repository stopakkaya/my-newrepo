package com.clodrock;

import java.util.ArrayList;
import java.util.List;

public class Main {


    /**
     * | ascii code 124
     * * ascii code 42
     *  her | isareti bir açılışı her * işareti de bir ürünü temsil ediyor.
     *  iki adet array alıyoruz startpositions[1,5] ve end[1,3] gibi. Bunlar bakmak istediğimiz aralıkları belirtiyor.
     *  1 ve 1 arasında ürün var mı diye kontrol ediyoruz.
     *  5 ve 3 arasında ürün var mı diye kontrol ediyoruz.
     *  daha sonra döndüğümüz listede ise hangi aralıkta kaç ürün varsa onu yazıyoruz.
     */
    /*
    public static void main2(String[] args) {


        String controlString = "*|***|*|***|**|**|*|";
        List<Integer> startPosition = new ArrayList<>();
        startPosition.add(1);
        startPosition.add(1);
        List<Integer> endPosition = new ArrayList<>();
        endPosition.add(6);
        endPosition.add(15);

        List<Integer> resultList = new ArrayList<>();


        for(int i = 0; i<startPosition.size();i++){
            String sub = controlString.substring(startPosition.get(i), endPosition.get(i));
            String first = getSubString(sub);
            System.out.println("for 1 iteration first : " + first);

            String last = getSubString(first);
            System.out.println("for last iteration last : "+ last);

            int counter = 0;
            for (char c : last.toCharArray()) {
                if(c=='*') counter++;
            }
            resultList.add(counter);
        }

        for (int i = 0 ; i< startPosition.size();i++){
            System.out.println("Start Position : " + startPosition.get(i) + " end position : "+ endPosition.get(i) + " Sum * count : " + resultList.get(i));
        }
    }

    private static String getSubString(String str){
        char[] charList = str.toCharArray();
        for (int k = 0; k<charList.length; k++) {
            if(charList[k] == '|') {
                str = str.substring(k);
                StringBuilder s1 = new StringBuilder();
                s1.append(str);
                return s1.reverse().toString();
            }
        }
        return str;
    }
    */

    public static void main(String[] args) {

    }


}
