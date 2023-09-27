package com.example.hw_6_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_6_3.databinding.FragmentNewBinding


class NewFragment : Fragment() {
    private lateinit var binding:FragmentNewBinding
    private lateinit var brandList:ArrayList<String>
    private lateinit var brandAdapter: Adaper


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentNewBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        brandAdapter=Adaper(brandList)
        binding.rvBrands.adapter=brandAdapter
    }

    private fun loadData() {
        brandList=ArrayList()
        brandList.add("Apple")
        brandList.add("Samsung")
        brandList.add("LG")
        brandList.add("Microsoft")
        brandList.add("Blackberry")
        brandList.add("Rolex")
        brandList.add("Patek Philippe")
        brandList.add("TECNO")
        brandList.add("Xaomi")
        brandList.add("ASUS")
        brandList.add("ACER")
        brandList.add("LENOVO")
        brandList.add("HUAWEI")
        brandList.add("DELL")
        brandList.add("DELL")
        brandList.add("HP")
        brandList.add("PIXEL")
        brandList.add("GYMSHARK")
        brandList.add("LOUIS VUITON")
        brandList.add("ZARA")
    }
}