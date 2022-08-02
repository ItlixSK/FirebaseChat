package com.example.firebasechat.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.firebasechat.ChatActivity
import com.example.firebasechat.R
import com.example.firebasechat.databinding.ItemCardBinding
import com.example.firebasechat.model.User

class UserAdapter(var context: Context, var userList:ArrayList<User>):RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
       val binding: ItemCardBinding = ItemCardBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.activity_main,parent,false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
         val user = userList[position]
        holder.binding.userName.text = user.name

        Glide.with(context).load(user.profileImage)
            .placeholder(R.drawable.avatar_ic)
            .into(holder.binding.profileImagePerson)

        holder.itemView.setOnClickListener {
            val intent = Intent(context, ChatActivity::class.java)
            intent.putExtra("name",user.name)
            intent.putExtra("image",user.profileImage)
            intent.putExtra("uid",user.uid)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = userList.size

}