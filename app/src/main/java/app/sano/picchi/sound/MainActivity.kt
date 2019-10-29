package app.sano.picchi.sound

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaPlayer = MediaPlayer.create(this,R.raw.guitar)

        //画像がタップされたら{}(ブロック)内のコードが実行される
        imageView.setOnClickListener{

            mediaPlayer.start()


        }

    }
}
