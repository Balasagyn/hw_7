package com.example.hw_5.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.hw_5.Car
import com.example.hw_5.databinding.ItemBinding

class CarAdapter(
    private val list: ArrayList<Car>
) : Adapter<CarAdapter.CarViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class CarViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(car: Car) {
            binding.tvName.text = car.name
            Glide.with(binding.ivCar).load(car.img).into(binding.ivCar)
        }

    }
}