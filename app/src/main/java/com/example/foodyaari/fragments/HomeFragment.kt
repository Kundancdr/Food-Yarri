package com.example.foodyaari.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.foodyaari.R
import com.example.foodyaari.adapter.PopularAdapter
import com.example.foodyaari.databinding.ActivityStartBinding
import com.example.foodyaari.databinding.FragmentHome2Binding
import com.google.android.material.slider.Slider

class HomeFragment:Fragment() {
     private lateinit var binding: FragmentHome2Binding



     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

     }


     override fun onCreateView(
         inflater: LayoutInflater, container: ViewGroup?,
         savedInstanceState: Bundle?
     ): View? {
         // Inflate the layout for this fragment
        binding = FragmentHome2Binding.inflate(inflater,container,false)
         return binding.root


     }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.slider9 ,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.slider2 ,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.slider3 ,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.slider5 ,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.slider7 ,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.slider11,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.slider12,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.slider3 ,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.slider5 ,ScaleTypes.FIT))


        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList, ScaleTypes.FIT)
        imageSlider.setItemClickListener(object :ItemClickListener{
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }
//Adapter for Recycler View
            override fun onItemSelected(position: Int) {
               val itemPosition = imageList[position]
                val itemMessage= "Select Image $position"
                Toast.makeText(requireContext(),itemMessage,Toast.LENGTH_SHORT).show()
            }
        })
        val foodName = listOf("Burger","Sandwich","momo","item")
        val price = listOf("$5","$7","$8","$10")
        val popularfoodImages = listOf(R.drawable.foodimage1,R.drawable.foodimages2,R.drawable.foodimage3,R.drawable.foodimage4)
        val adapter = PopularAdapter(foodName,price,popularfoodImages)
        binding.Popularrecyclerview.layoutManager = LinearLayoutManager(requireContext())
        binding.Popularrecyclerview.adapter = adapter
    }
    companion object{

    }


 }



