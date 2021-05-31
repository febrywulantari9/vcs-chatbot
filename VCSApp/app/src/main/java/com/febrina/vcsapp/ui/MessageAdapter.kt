package com.febrina.vcsapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.febrina.vcsapp.R
import com.febrina.vcsapp.data.Message
import com.febrina.vcsapp.utils.Constants.SEND_ID


class MessageAdapter (private val listmessage: MutableList<Message>): 
    RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {


    inner class MessageViewHolder (var ItemView : View) : RecyclerView.ViewHolder (itemView){

        init {
            itemView.setOnClickListener{
                listmessage.removeAt(bindingAdapterPosition)
                notifyItemRemoved(bindingAdapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.message_item, parent, false))
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val currentMessage = listmessage[position]

        when(currentMessage.id){
            SEND_ID ->{
                holder.itemView.tv_message.apply{
                    text =
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return listmessage.size
    }


}