package com.tutorial.hng9_stage2_task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.hng9_stage2_task.databinding.SkillsViewholderBinding

class SkillsAdapter : ListAdapter<String, SkillsAdapter.ViewHolder>(DiffCallBack) {


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = SkillsViewholderBinding.bind(view)
        fun bind(data: String) {
            binding.msg.text = data

        }
    }


    companion object DiffCallBack : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String) =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: String, newItem: String) =
            oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.skills_viewholder, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: SkillsAdapter.ViewHolder, position: Int) {
        val pos = getItem(position)
        holder.bind(pos)

    }


}
