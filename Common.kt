package com.nganu.rofiul.Sepatu.Common

import android.graphics.Color
import com.nganu.rofiul.Sepatu.Model.Shoe
import com.nganu.rofiul.SepatuList

object Common {
    fun findShoeByNum(num: String?): Shoe? {
        for(shoe in Common.shoeList)
            if(shoe.num.equals(num))
                return shoe
        return null

    }

    fun getColorBySize(size: String): Int {
        when (size) {

            "31" -> return Color.parseColor("#A4A27A")


            "32" -> return Color.parseColor("#743BFB")


            "33" -> return Color.parseColor("#F15B85")


            "34" -> return Color.parseColor("#E9CA3C")


            "35" -> return Color.parseColor("#D9BF6C")


            "36" -> return Color.parseColor("#81C85B")

            "37" -> return Color.parseColor("#A441A3")

            "38" -> return Color.parseColor("#BAB7D2")


            "39" -> return Color.parseColor("#DDA2DF")


            "40" -> return Color.parseColor("#F48130")


            "41" -> return Color.parseColor("#BE3027")


            "42" -> return Color.parseColor("#A8B822")


            "43" -> return Color.parseColor("#705693")


            "44" -> return Color.parseColor("#745945")


            "45" -> return Color.parseColor("#9BD8D8")


            "46" -> return Color.parseColor("#658FF1")
            else -> return Color.parseColor("#658FA0")
        }
    }

    var shoeList:List<Shoe> = ArrayList()
    val KEY_ENABLE_HOME = "position"
}