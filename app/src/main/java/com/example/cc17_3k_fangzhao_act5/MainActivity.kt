package com.example.cc17_3k_fangzhao_act5

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val picture = findViewById<ImageView>(R.id.imageView1)
        val picname = findViewById<TextView>(R.id.textView1)
        val picauthor = findViewById<TextView>(R.id.textView2)
        val buttonprevious = findViewById<Button>(R.id.button)
        val buttonnext = findViewById<Button>(R.id.button2)

        val images = listOf(
            R.drawable.kiss1,
            R.drawable.scream2,
            R.drawable.girlwithapearlearring3,
            R.drawable.monalisa4,
            R.drawable.sunflowers5
        )
        val names = listOf(
            "Kiss",
            "Scream",
            "Girl with a Pearl Earring",
            "Mona Lisa",
            "Sunflowers"
        )
        val authors = listOf(
            "Gustav Klimt",
            "Edvard Munch",
            "Johanne Vermeer",
            "Vincent Van Gogh",
            "Vincent Van Gogh"
        )
        var calindex : Int = 0

        buttonnext.setOnClickListener{
            if (0 <= calindex && calindex <= 4){
                picture.setImageResource(images[calindex])
                picname.setText(names[calindex])
                picauthor.setText(authors[calindex])
                calindex = calindex + 1
                return@setOnClickListener
            }else calindex = 0
        }

        buttonprevious.setOnClickListener{
            if(0 <= calindex && calindex <= 4){
                picture.setImageResource(images[calindex])
                picname.setText(names[calindex])
                picauthor.setText(authors[calindex])
                calindex = calindex - 1
                return@setOnClickListener
            }else calindex = 0
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}