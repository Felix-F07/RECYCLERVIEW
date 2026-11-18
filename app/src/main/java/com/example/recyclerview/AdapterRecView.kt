package com.example.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemRecyclerBinding

class AdapterRecView (private val listWayang: ArrayList<DcWayang>) :
    RecyclerView.Adapter<AdapterRecView.ListViewHolder>() {
    class ListViewHolder (val binding : ItemRecyclerBinding) :
            RecyclerView.ViewHolder(binding.root)
}