package aaa.bivizul.a28project.android

import aaa.bivizul.a28project.data.draftutil.checkDraftnet
import aaa.bivizul.a28project.data.draftutil.getDraftdlg
import aaa.bivizul.a28project.ui.root.Root
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            if (checkDraftnet(this)) {
                Root()
            } else {
                getDraftdlg(this, this)
            }

        }
    }
}
