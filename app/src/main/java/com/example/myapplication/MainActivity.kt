package com.example.myapplication

import android.os.Bundle
import android.widget.ImageButton
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

        // Điều chỉnh padding để hỗ trợ hiển thị toàn màn hình
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Liên kết các thành phần trong layout
        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        val btnCheck = findViewById<ImageButton>(R.id.btnCheck)
        val profileImage = findViewById<ImageView>(R.id.profileImage)
        val userName = findViewById<TextView>(R.id.userName)
        val userLocation = findViewById<TextView>(R.id.userLocation)

        // Xử lý sự kiện khi nhấn nút back
        btnBack.setOnClickListener {
            finish() // Đóng Activity khi nhấn nút quay lại
        }

        // Xử lý sự kiện khi nhấn nút check (có thể thay đổi theo nhu cầu)
        btnCheck.setOnClickListener {
            userName.text = "Checked ✅"
            userLocation.text = "Verified User"
        }
    }
}
