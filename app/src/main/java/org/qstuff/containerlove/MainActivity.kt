package org.qstuff.containerlove

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

/*
 * Created by claus on 25.10.17.
 */

class MainActivity : AppCompatActivity() {

    @BindView(R.id.button_show_map)
    lateinit var buttonShowMap: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        ButterKnife.bind(this)
    }

    @OnClick(R.id.button_show_map)
    internal fun onShowMapButtonClick() {

        startMapActivity()
    }

    internal fun startMapActivity() {

        val intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)
    }
}