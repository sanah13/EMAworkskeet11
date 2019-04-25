package uk.ac.solent.emaworkskeet11

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt1?.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:${et1.text}")
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
            }
        }

        bt2?.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://${et2.text}"))
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
            }
        }
    }
}
