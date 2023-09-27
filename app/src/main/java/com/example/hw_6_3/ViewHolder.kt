package com.example.hw_6_3

import androidx.recyclerview.widget.RecyclerView
import com.example.hw_6_3.databinding.ItemBrandsBinding

 class ViewHolder(private var binding: ItemBrandsBinding):RecyclerView.ViewHolder(binding.root) {

     fun bind(item:String){
        binding.itemBrand.text=item
     }
}