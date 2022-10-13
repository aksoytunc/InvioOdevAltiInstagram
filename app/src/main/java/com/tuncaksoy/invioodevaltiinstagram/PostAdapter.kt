package com.tuncaksoy.invioodevaltiinstagram

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tuncaksoy.invioodevaltiinstagram.databinding.PostRecyclerRowBinding

class PostAdapter(val mContext: Context, val postList: ArrayList<UsersPost>) :
    RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

    inner class PostViewHolder(binding: PostRecyclerRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var binding: PostRecyclerRowBinding

        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val binding = PostRecyclerRowBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val userPost = postList[position]
        holder.binding.userNameTextPost.text = userPost.userName
        holder.binding.userNameTextPost2.text = userPost.userName
        holder.binding.likeText.text = userPost.postLikeNumber.toString() + " beğenme"
        holder.binding.commentText.text = userPost.postExplanation
        holder.binding.userImage.setImageResource(
            mContext.resources.getIdentifier(
                userPost.userImageName,
                "drawable",
                mContext.packageName
            )
        )
        holder.binding.postImage.setImageResource(
            mContext.resources.getIdentifier(
                userPost.postImageName,
                "drawable",
                mContext.packageName
            )
        )
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}