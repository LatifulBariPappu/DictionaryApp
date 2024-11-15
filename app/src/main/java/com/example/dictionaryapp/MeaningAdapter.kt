package com.example.dictionaryapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dictionaryapp.databinding.MeaningRecyclerRowBinding

class MeaningAdapter(private var meaningList : List<Meaning>) : RecyclerView.Adapter<MeaningAdapter.MeaningViewHolder>()  {

    class MeaningViewHolder( private  val binding: MeaningRecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }


    fun updateNewData(newMeaningList : List<Meaning>){
        meaningList = newMeaningList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeaningViewHolder {
        val binding = MeaningRecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MeaningViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return meaningList.size
    }

    override fun onBindViewHolder(holder: MeaningViewHolder, position: Int) {

    }
}