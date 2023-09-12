package com.alphabet.webbrowser137

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.alphabet.webbrowser137.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //to search in web_view
        binding.imgSearch.setOnClickListener {
            val mQuery = binding.edtSearch.text.toString()

            if(mQuery!=""){
                binding.webView.loadUrl("https://www.google.com/search?q=$mQuery")
                binding.webView.webViewClient = WebViewClient()
            }

            //yahoo
        }

    }
}