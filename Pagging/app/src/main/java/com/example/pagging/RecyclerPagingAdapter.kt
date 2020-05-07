package com.example.pagging

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class RecyclerPagingAdapter :
    PagedListAdapter<Bean, RecyclerPagingAdapter.BrowseCollectViewHolder>(differCallBack) {

    companion object {
        private val differCallBack = object : DiffUtil.ItemCallback<Bean>() {
            override fun areItemsTheSame(oldItem: Bean, newItem: Bean): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Bean, newItem: Bean): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BrowseCollectViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item, null)
        return BrowseCollectViewHolder(view)
    }

    override fun onBindViewHolder(holder: BrowseCollectViewHolder, position: Int) {
        val item = getItem(position)
        if(item==null){
            holder.name.text="加载中。。。"
        }else{
            holder.name.text = "${item?.name}${item?.age}"
        }
    }


    class BrowseCollectViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val name: TextView = itemView.findViewById(R.id.tv_name)
    }
}

