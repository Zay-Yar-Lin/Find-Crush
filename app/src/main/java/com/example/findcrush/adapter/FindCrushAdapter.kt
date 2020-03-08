package com.example.findcrush.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.findcrush.R
import com.example.findcrush.model.FindCrush
import kotlinx.android.synthetic.main.find_crush_item.view.*

class FindCrushAdapter(var findCrushList:ArrayList<FindCrush>) : RecyclerView.Adapter<FindCrushAdapter.FindCrushViewHolder>() {
    inner class FindCrushViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindFindCrush(findCrush: FindCrush) {
            itemView.firstPic.setImageResource(findCrush.profileImage)
            itemView.txtName.text=findCrush.name
            itemView.txtPoststatus.text=findCrush.postStatus
            itemView.txtPostedTime.text =findCrush.postTime
            itemView.uploadImage.setImageResource(findCrush.postImage)
            itemView.lovecount.text=findCrush.like
            itemView.commentCount.text=findCrush.comment
            itemView.shareCount.text=findCrush.share
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FindCrushViewHolder {
        return FindCrushViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.find_crush_item,parent,false))
    }

    override fun getItemCount(): Int {
        return findCrushList.size
    }

    override fun onBindViewHolder(holder: FindCrushViewHolder, position: Int) {
        holder.bindFindCrush(findCrushList[position])
    }
}