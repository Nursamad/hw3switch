package com.geektech;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String[] name = new String[3];

        name[0] = "Искен";
        name[1] = "Нур";
        name[2] = "Ислам"; // 1 массив = 3

        System.out.println(Arrays.toString(name));
        // доп дз
        String[] name2 = new String[name.length +1];//0000
        String name4= "Арген";
        int k= 0;
        for ( String n:name){
            name2[k]= n; k++;
        }
        name2[k++]= name4;
        name = name2;
        System.out.println(Arrays.toString(name2));
        for (int i = 0; i < name.length; i++)     // 2 массив 3+1=4

        {
            switch (i){
                case 0:
                    System.out.println(name[0]+" Доброе утро!");
                    break;
                case 1:
                    System.out.println(name[1]+" Доброго дня!");
                    break;
                case 2:
                    System.out.println(name[2]+" Добрый вечер!");
                    break;
                case 3:
                    System.out.println(name[3] + " Удачи!");
            }

        }


    }
}
