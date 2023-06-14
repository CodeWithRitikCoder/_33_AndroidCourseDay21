package com.ritikcoder.project21ofandroiddev_listview2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ritikcoder.project21ofandroiddev_listview2.databinding.ActivityUserInformationBinding

class UserInformation : AppCompatActivity() {

    lateinit var binding: ActivityUserInformationBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityUserInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Getting data from the previous Activity
        val userName= intent.getStringExtra("name")
        val userLastMessage= intent.getStringExtra("lastMessage")
        val userLastMessageTime= intent.getStringExtra("lastMessageTime")
        val userImage= intent.getIntExtra("image", R.drawable.img_0)
        val userPhoneNumber= intent.getStringExtra("phoneNumber")

        //Setting data on the UserInformation Activity.
        binding.imageViewForProfileImage.setImageResource(userImage)
        binding.textViewForShowUserName.text= "Name : $userName"
        binding.textViewForShowLastMessage.text= "Last Message : $userLastMessage"
        binding.textViewForShowLastMessageTime.text= "Last Message Time : $userLastMessageTime"
        binding.textViewForShowPhoneNumber.text= "Phone No : $userPhoneNumber"

    }
}