package com.example.convert_money

import android.content.ContentValues.TAG
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var edit_base: TextView;
    private lateinit var seek_bar: SeekBar;
    private lateinit var seek_txt: TextView;
    private lateinit var tip_result: TextView;
    private lateinit var total_result: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit_base = findViewById(R.id.base_editText);
        seek_bar = findViewById(R.id.seekBar);
        seek_txt = findViewById(R.id.txt_seekbar);
        tip_result = findViewById(R.id.tip_result);
        total_result = findViewById(R.id.total_result);


        seek_bar.progress = 20;
        seek_txt.text = "20%";

        seek_bar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                print("on progress change $p1");
                seek_txt.text = "$p1%";
                val tip = (edit_base.text.toString().toDouble() * p1) / 100;
                tip_result.text = "%.2f".format(tip);
                total_result.text=(tip+p1).toString();

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })
    }

}