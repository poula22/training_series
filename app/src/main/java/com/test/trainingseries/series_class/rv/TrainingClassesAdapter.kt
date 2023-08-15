package com.test.trainingseries.series_class.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.test.domain.domain.TrainingClassDTO
import com.test.trainingseries.databinding.TrainingSeriesClassItemBinding

class TrainingClassesAdapter : ListAdapter<TrainingClassDTO, TrainingClassesViewHolder>(TrainingClassesDiffUtil())
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrainingClassesViewHolder {

        return TrainingClassesViewHolder.create(parent)
    }


    override fun onBindViewHolder(holder: TrainingClassesViewHolder, position: Int)
    {
        val item=getItem(position)
        holder.bind(item)
    }



}


class TrainingClassesViewHolder(val binding: TrainingSeriesClassItemBinding) : RecyclerView.ViewHolder(binding.root)
{
    companion object{
        fun create(parent: ViewGroup): TrainingClassesViewHolder
        {
            val inflater = LayoutInflater.from(parent.context)
            val binding = TrainingSeriesClassItemBinding.inflate(inflater, parent, false)
            return TrainingClassesViewHolder(binding)
        }
    }

    fun bind(item: TrainingClassDTO)
    {
        binding.imgClassVideo.load(item.url)
        binding.txtTitle.text=item.title
        binding.txtDesc.text=item.classDescription
        binding.txtDuration.text=item.duration
    }
}


class TrainingClassesDiffUtil : DiffUtil.ItemCallback<TrainingClassDTO>()
{
    override fun areItemsTheSame(oldItem: TrainingClassDTO, newItem: TrainingClassDTO): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: TrainingClassDTO, newItem: TrainingClassDTO): Boolean
    {
        return oldItem == newItem
    }



}