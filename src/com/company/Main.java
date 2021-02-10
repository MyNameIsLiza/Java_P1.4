package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        boolean t;
        String text;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                System.out.println("Введіть рядок");
                String str = reader.readLine();
                int c_count = consonant(str);
                int v_count = vowels(str);
                System.out.println("Кількість голосних = " + v_count);
                System.out.println("Кількість приголосних = " + c_count);
                System.out.println(v_count>c_count?"TRUE":"FALSE");
                System.out.println("Введіть 0, щоб зупинити, інакще, будь-що");
                t = reader.readLine().equals(0) ? false : true;

            } while (t);
        } catch (IOException e) {
            System.out.println("QoQ: Проблема з BufferedReader");
        }
    }
    public static int vowels(String text){
        int count = 0;
        for(int leo = 0; leo<text.length(); leo++) {
            char c = text.charAt(leo);
            int i = (int)c;
            if(i == 65 || i == 69 || i == 73 || i == 79 || i == 85 || i == 89 || i == 97
                    || i == 101 || i == 105 || i == 111 || i == 117 || i == 121
                    || i == 1024 || i == 1025|| i == 1028
                    || i == 1030 || i == 1031|| i == 1040
                    || i == 1045 || i == 1048 || i == 1054 || i == 1059 || i == 1067 || (i >=1069 && i<=1072)
                    || i == 1077 || i == 1080 || i == 1086 || i == 1091 || i == 1099 || (i >=1101 && i<=1108) || i == 1110
                    || i == 1111)count++;
        }
        return count;
    }
    public static int consonant(String text){
        int count = 0;
        for(int leo = 0; leo<text.length(); leo++) {
            char c = text.charAt(leo);
            int i = (int)c;
            if(!(i == 65 || i == 69 || i == 73 || i == 79 || i == 85 || i == 89 || i == 97
                    || i == 101 || i == 105 || i == 111 || i == 117 || i == 121
                    || i == 1024 || i == 1025|| i == 1028
                    || i == 1030 || i == 1031|| i == 1040
                    || i == 1045 || i == 1048 || i == 1054 || i == 1059 || i == 1067 || (i >=1069 && i<=1072)
                    || i == 1077 || i == 1080 || i == 1086 || i == 1091 || i == 1099 || (i >=1101 && i<=1108) || i == 1110
                    || i == 1111)&&(i >= 65 && i <= 90 || i >= 97 && i <= 122 || i >= 1040 && i <= 1105 || i >= 1108 && i <= 1111))count++;
        }
        return count;
    }
}
