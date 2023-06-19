package org.example.A;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Prog1 {

    public static void main(String[] args){
        TreeSet<Character> charSet = new TreeSet<>();
        HashMap<Character, Integer> charMap = new HashMap<>();
        int maximum = 0;

            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()){
                char data[] = scanner.nextLine().toCharArray();
                for (int i=0;i<data.length;i++){
                    if (data[i] != ' '){
                        charSet.add(data[i]);
                        int tmp = 1 + charMap.getOrDefault(data[i],0);
                        if (tmp>maximum)
                            maximum=tmp;
                        charMap.put(data[i], tmp);
                    }
                }
            }
            scanner.close();

        for (int i=maximum;i>0;i--){
            for (char ch : charSet){
                if (charMap.get(ch) >= i )
                    System.out.print('#');
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
        for (char ch : charSet){
            System.out.print(ch);
        }

    }
}
