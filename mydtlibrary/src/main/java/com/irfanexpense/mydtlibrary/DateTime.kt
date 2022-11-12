package com.irfanexpense.mydtlibrary

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class DateTime {
    companion object {
        fun getDbFileNameToFullDateTime(strMyDateTime: String): String {
            var strDateTime = strMyDateTime
            try {
                val sdfSource = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault())
                val date = sdfSource.parse(strDateTime)
                val sdfDestination =
                    SimpleDateFormat("MMMM dd yyy, EEEE,        HH:mm:ss a", Locale.getDefault())
                strDateTime = sdfDestination.format(date)
            } catch (pe: ParseException) {
                println("Parse Exception : $pe")
            }

            return strDateTime
        }
        fun getDateTime(dFormat: String?): String? {
            // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            val dateFormat = SimpleDateFormat(dFormat, Locale.ENGLISH)
            val date = Date()
            return dateFormat.format(date)
        }
    }

}