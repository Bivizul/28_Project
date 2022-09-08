package aaa.bivizul.a28project.android

//import aaa.bivizul.a28project.draftutil.Drafcon.ONESIGNAL_APP_ID
import android.app.Application
import com.onesignal.OneSignal

class A28PApp: Application() {

    override fun onCreate() {
        super.onCreate()

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
//        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }

}