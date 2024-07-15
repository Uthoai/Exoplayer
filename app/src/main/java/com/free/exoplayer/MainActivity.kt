package com.free.exoplayer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.free.exoplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnVideo.setOnClickListener {
            val url = "https://storage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"
            gotoMediaExpo(url)
        }

        binding.btnAudio.setOnClickListener {
            val url = "https://github.com/rafaelreis-hotmart/Audio-Sample-files/raw/master/sample.mp3"
            gotoMediaExpo(url)
        }

    }


    fun gotoMediaExpo(url : String){
        val intent = Intent(this, MediaPlayerActivity::class.java)
        intent.putExtra("URL",url)
        startActivity(intent)
    }
}