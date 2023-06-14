package com.ritikcoder.project21ofandroiddev_listview2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ritikcoder.project21ofandroiddev_listview2.databinding.ActivityMainBinding
import com.ritikcoder.project21ofandroiddev_listview2.databinding.EachItemBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var userArrayList: ArrayList<UserData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Data creation is here.
        val name= arrayOf("RitikCoder", "sundar pichai", "Kajal", "Priyanka", "Hritik", "Kajal Agarwal", "Ajay","Elon musk",
            "Shruti", "Kajal Agarwal")
        val lastMessage= arrayOf("Hey What's up", "I am fine", "Good", "Awesome", "Cool", "msg6", "msg7", "msg8", "msg9",
            "msg10")
        val lastMessageTime= arrayOf("6:25 AM", "7:30 PM", "5:00 PM", "6:30 AM", "7:45 AM", "7:30 PM", "5:00 PM", "6:30 AM",
            "7:45 AM", "7:45 AM")
        val phoneNumber = arrayOf("7500788252", "8675867586", "8986758675","9786978675", "9706879687", "7500788252",
            "8675867586", "8986758675","9786978675", "9706879687")
        val imageId= intArrayOf(R.drawable.img_0, R.drawable.img_1, R.drawable.img_2, R.drawable.img_3, R.drawable.img_4,
            R.drawable.img_5, R.drawable.img_6, R.drawable.img_7, R.drawable.img_8, R.drawable.img_9)

        userArrayList= ArrayList()

        //for-each loot to get each user data.
        for (eachIndex in name.indices){
            val user= UserData(name[eachIndex], lastMessage[eachIndex], lastMessageTime[eachIndex], phoneNumber[eachIndex],
                imageId[eachIndex])

            userArrayList.add(user)
        }


        binding.listView.isClickable= true
        binding.listView.adapter= MyAdapter(this, userArrayList)

        //ListView.setItemClickListener is here.
        binding.listView.setOnItemClickListener { adapterView, view, i, l ->

            //binding1= EachItemBinding.inflate(layoutInflater)
            val userName= name[i]
            val userLastMessage= lastMessage[i]
            val userLastMessageTime= lastMessageTime[i]
            val userImage= imageId[i]
            val userPhoneNumber= phoneNumber[i]

            //UserInformation Activity calling is here.
            val intentToOpenUserInformationActivity= Intent(this, UserInformation::class.java)

            //Data ready to parse into the UserInformation Activity.
            intentToOpenUserInformationActivity.putExtra("name", userName)
            intentToOpenUserInformationActivity.putExtra("lastMessage", userLastMessage)
            intentToOpenUserInformationActivity.putExtra("lastMessageTime", userLastMessageTime)
            intentToOpenUserInformationActivity.putExtra("image", userImage)
            intentToOpenUserInformationActivity.putExtra("phoneNumber", userPhoneNumber)
            startActivity(intentToOpenUserInformationActivity)

        }
    }
}