package com.xiaoyingbo.lib_util_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xiaoyingbo.lib_util.BlueToothUtils
import com.xiaoyingbo.lib_util.LogUtils

class MainActivity : AppCompatActivity() {
    private val tag=this::class.simpleName;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}