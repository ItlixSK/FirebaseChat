package com.example.firebasechat

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebasechat.adapter.UserAdapter
import com.example.firebasechat.databinding.ActivityMainBinding
import com.example.firebasechat.model.User
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    var binding: ActivityMainBinding? = null
    var database: FirebaseDatabase? = null
    var users: ArrayList<User>? = null
    var userAdapter: UserAdapter? = null
    var dialog: ProgressDialog? = null
    var user: User? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}