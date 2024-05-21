package org.rajalakshmi.speechtotext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity import android.os.Bundle
import android.speech. RecognizerIntent
import android.widget. ImageView
import android.widget.TextView
import java.util.*

class MainActivity: AppCompatActivity() {
lateinit var tvText: TextView
private val REQUEST CODE SPEECH INPUT = 1000 override fun onCreate(savedInstanceState: Bundle?) (
super.onCreate(savedInstanceState)
setContentView(R.layout.activity main)

var imgMic: ImageView = findViewById(R.id.imgMic)
tvText = findViewById(R.id.tvText) imgMic.setOnClickListener {

val intent Intent (RecognizerIntent.ACTION RECOGNIZE SPEECH)
intent.putExtra (Recognizer Intent.EXTRA LANGUAGE MODEL, RecognizerIntent.LANGUAGE MODEL FREE FORM)
intent.putExtra (RecognizerIntent.EXTRA LANGUAGE,
Locale.getDefault())
intent.putExtra (RecognizerIntent.EXTRA PROMPT, "Speak...!") startActivityForResult (intent, REQUEST CODE SPEECH INPUT)

override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) (
super.onActivityResult(requestCode, resultCode, data)

if (requestCode && data != null) { = REQUEST_CODE_SPEECH INPUT && resultCode == RESULT OK
var res: ArrayList<String> = data.getStringArrayListExtra (RecognizerIntent.EXTRA RESULTS) as
ArrayList<String>
tvText.setText(Objects.requireNonNull (res) [0])
}
}
}
