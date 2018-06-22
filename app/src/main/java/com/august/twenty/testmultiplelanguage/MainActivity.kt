package com.august.twenty.testmultiplelanguage

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import com.akexorcist.localizationactivity.ui.LocalizationActivity;


class MainActivity : LocalizationActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEn.setOnClickListener {
           setLanguage("en")
        }

        btnJa.setOnClickListener {
            setLanguage(Locale.JAPAN)
        }

        btnTh.setOnClickListener {
            setLanguage("th")
        }
    }

}
