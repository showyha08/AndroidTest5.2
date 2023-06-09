package com.websarva.wings.android.listviewsample2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ListViewオブジェクトを取得
        val lvMenu = findViewById<ListView>(R.id.lvMenu)
        //リストビューに表示するデータを作成
        var menuList = mutableListOf("唐揚げ定食", "ハンバーグ定食", "生姜焼き定食")
        //アダプタオブジェクトを生成
        val adapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, menuList)
        //リストビューにアダプタオブジェクトを設定
        lvMenu.adapter = adapter
    }
}