package aaa.bivizul.a28project.data.draftutil

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.net.ConnectivityManager
import android.telephony.TelephonyManager
import com.onesignal.OneSignal
import java.text.SimpleDateFormat
import java.util.*

actual fun getDraftmm(): String {
    val manufactured = android.os.Build.MANUFACTURER
    val model = android.os.Build.MODEL
    return "$manufactured $model"
}

actual fun getDraftsim(draftcon: Any): String {
    val context = draftcon as Context
    val telephonyManager = context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
    return telephonyManager.simCountryIso
}

actual fun getDraftid(draftcon: Any): String {
    val context = draftcon as Context
    val pref = context.getSharedPreferences("apppref", Context.MODE_PRIVATE)
    var levegesid = pref.getString("leveges_key", "noleveges") ?: "noleveges"
    if (levegesid == "noleveges") {
        val dateNow = Date()
        val simpleDateFormat = SimpleDateFormat("yyMMddhhmmssMs")
        val datetime = simpleDateFormat.format(dateNow)
        val randomNum = (10000 until 100000).random()
        levegesid = datetime + randomNum
        pref.edit().putString("leveges_key", levegesid).apply()
    }
    return levegesid
}

actual fun getDraftl(): String {
    return Locale.getDefault().language
}

actual fun getDraftt(): String {
    val timeZone = TimeZone.getDefault().getDisplayName(false, TimeZone.SHORT)
    var zone = "00:00"
    if (timeZone.length > 3) {
        zone = timeZone.substring(3)
    }
    return zone
}

actual fun getDraftdlg(draftcon: Any, draftact: Any) {
    val context = draftcon as Context
    val activity = draftact as Activity
    AlertDialog.Builder(context).apply {
        setTitle("Error, Oops ")
        setMessage("Please exit the app and try again later")
        setPositiveButton("Exit the app") { _, _ ->
            activity.finish()
            System.exit(0)
        }
        setCancelable(true)
    }.create().show()
}

actual fun checkDraftnet(draftcon: Any): Boolean {
    val context = draftcon as Context
    val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val networkInfo = connectivityManager.activeNetworkInfo
    return networkInfo != null && networkInfo.isConnected
}

actual fun sigDraftOff() {
    OneSignal.disablePush(true)
}

actual fun screenDraftExit(draftact: Any) {
    val activity = draftact as Activity
    activity.finish()
    System.exit(0)
}
