package id.co.cekpalindron

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


fun String.isPalindrome() : String{

    return  if(this.equals(this.reversed()))
        "${this} benar Palindrome"
    else
        "${this} bukan palindrome"

}


class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btn_palindrone.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

       hasil_parlindon.text = katapalindrone.text.toString().isPalindrome()
    }

}
