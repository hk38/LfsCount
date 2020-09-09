package lit.amida.lfscount

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setText()


        buttonAdd.setOnClickListener {
            count++
            setText()
        }

        buttonMinus.setOnClickListener {
            count--
            setText()
        }

        buttonClear.setOnClickListener {
            count = 0
            setText()

        }
    }

    private fun setText(){
        textView.text = "$count"

        if(count % 3 == 0 && count != 0) textView.setTextColor(Color.GREEN)
        else textView.setTextColor(Color.BLACK)
    }
}