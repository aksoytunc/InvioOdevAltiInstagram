package com.tuncaksoy.invioodevaltiinstagram

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tuncaksoy.invioodevaltiinstagram.databinding.HistoryRecyclerRowBinding

class HistoryAdapter(val mContext: Context, val historyPostList: ArrayList<UsersHistory>) :
    RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    inner class HistoryViewHolder(binding: HistoryRecyclerRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var binding: HistoryRecyclerRowBinding

        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val binding = HistoryRecyclerRowBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return HistoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        val userHistory = historyPostList[position]
        holder.binding.userNameText.text = userHistory.userName
        holder.binding.userHistoryImage.setImageResource(
            mContext.resources.getIdentifier(
                userHistory.userImageName,
                "drawable",
                mContext.packageName
            )
        )
    }

    override fun getItemCount(): Int {
       return historyPostList.size
    }
}