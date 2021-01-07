package com.example.objectscompanionobjects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var group = Group.DevMobile.position
        var student = Student.name
        var group2 = Group.factory()
    }
}
object Student{
    val name = ""
}
class Group{
    object DevMobile{
        val position = ""
    }
    companion object DevKotlin{
        val price = 0
        fun factory (): Group {
            return Group()
        }
    }
}