package com.nganu.rofiul.Sepatu.Common;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

import com.nganu.rofiul.Sepatu.Model.Shoe;

public class Common {
    public static List<Shoe> commonShoeList = new ArrayList<>();
    public static final String KEY_ENABLE_HOME = "position";

    public static int getColorBySize(String size) {
        switch(size)
        {

            case "31":
                return Color.parseColor("#A4A27A");


            case "32":
                return Color.parseColor("#743BFB");



            case "33":
                return Color.parseColor("#F15B85");


            case "34":
                return Color.parseColor("#E9CA3C");


            case "35":
                return Color.parseColor("#D9BF6C");


            case "36":
                return Color.parseColor("#81C85B");

            case "37":
                return Color.parseColor("#A441A3");

            case "38":
                return Color.parseColor("#BAB7D2");


            case "39":
                return Color.parseColor("#DDA2DF");


            case "40":
                return Color.parseColor("#F48130");


            case "41":
                return Color.parseColor("#BE3027");


            case "42":
                return Color.parseColor("#A8B822");


            case "43":
                return Color.parseColor("#705693");


            case "44":
                return Color.parseColor("#745945");


            case "45":
                return Color.parseColor("#9BD8D8");


            case "46":
                return Color.parseColor("#658FF1");
            default:
                return Color.parseColor("#658FA0");
        }
    }

    public static Shoe findShoeByNum(String num) {
        for(Shoe shoe : commonShoeList)
        {
            if(shoe.getNum().equals(num))
                return shoe;
        }
        return null;
    }

    public static List<Shoe> findShoeBySize(String size) {
        List<Shoe> result = new ArrayList<>();
        for(Shoe shoe : commonShoeList)
        {
            if(shoe.getType().contains(size))
                result.add(shoe);
        }
        return result;
    }
}


