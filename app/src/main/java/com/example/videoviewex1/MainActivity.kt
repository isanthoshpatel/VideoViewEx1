package com.example.videoviewex1

import android.content.Context
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var path = "android.resource://"+packageName+"/"+R.raw.video1
        videoview.setVideoPath(path)

        var uri = Uri.parse(path)
        //videoview.setVideoURI(uri)

        var mediaController = MediaController(this)
        videoview.setMediaController(mediaController)
        mediaController.setAnchorView(videoview)
    }
}
