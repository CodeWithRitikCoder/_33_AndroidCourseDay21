package com.ritikcoder.project21ofandroiddev_listview2

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter (private val context: Activity, private val arrayList: ArrayList<UserData>) :
    ArrayAdapter<UserData>(context, R.layout.each_item, arrayList) {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater= LayoutInflater.from(context)
        val view= inflater.inflate(R.layout.each_item, null)

        val image= view.findViewById<CircleImageView>(R.id.profile_image)
        val name= view.findViewById<TextView>(R.id.textViewForName)
        val lastMessage= view.findViewById<TextView>(R.id.textViewForLastMessage)
        val lastMessageTime= view.findViewById<TextView>(R.id.textViewForLastMessageTime)

        name.text= arrayList[position].name
        lastMessage.text= arrayList[position].lastMessage
        lastMessageTime.text= arrayList[position].lastMessageTime
        image.setImageResource(arrayList[position].imageId)

        return view
    }

}