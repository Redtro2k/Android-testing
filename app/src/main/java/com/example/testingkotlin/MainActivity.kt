package com.example.testingkotlin   

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab: View = findViewById<View>(R.id.fab);
        val btnclickme: Button = findViewById<Button>(R.id.btnclickme);
        val txt_num_1: EditText = findViewById<EditText>(R.id.txt_num_1);
        val txt_num_2: EditText = findViewById<EditText>(R.id.txt_num_2);


        //snackbar
        val testing: TextView = findViewById<TextView>(R.id.testing);
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show();
            testing.setText("Hi Darwin");
        }
        //toast
        val toast = Toast.makeText(applicationContext, "This is toast", Toast.LENGTH_SHORT).show()
        //button
        btnclickme.setOnClickListener{ view->
            var num1 : Number; var num2 : Number; var total: Number;
            num1 = txt_num_1.text.toString().toInt();
            num2 = txt_num_2.text.toString().toInt();
            total = num1 + num2;

            testing.setText(total.toString())
        }
    }
}