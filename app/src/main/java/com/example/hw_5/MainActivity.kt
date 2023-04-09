package com.example.hw_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_5.adapter.CarAdapter
import com.example.hw_5.databinding.ActivityMainBinding

public class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val list  = arrayListOf<Car>()
    private lateinit var adapter: CarAdapter

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = CarAdapter(list)
        binding.recycler.adapter = adapter
        initData()

    }

    private fun initData() {
        list.add(Car("BMW", "https://m.media-amazon.com/images/I/51XTCc3BCDL.jpg"))
        list.add(Car("BMW", "https://www.reuters.com/resizer/K40lhegwW7_m_YeQdfQekly6VQo=/1920x0/filters:quality(80)/cloudfront-us-east-2.images.arcpublishing.com/reuters/BWNV7AEOA5KPDOM7GALNVJOEQE.jpg"))
        list.add(Car("BMW", "https://www.bmw-m.com/content/dam/bmw/marketBMW_M/common/home/bmw-m2-coupe-cp.png.asset.1676299054704.png"))
        list.add(Car("Tesla", "https://media.wired.com/photos/5dd82f459ac14a0008116985/3:2/w_1600%2Cc_limit/Transoi_storyone_Screen-Shot-2019-11-22-at-10.38.01-AM.jpg"))
        list.add(Car("Tesla", "https://www.topgear.com/sites/default/files/cars-car/image/2018/09/ab3t4352.jpg"))
        list.add(Car("Bentley", "https://stimg.cardekho.com/images/carexteriorimages/930x620/Bentley/Flying-Spur/7776/1676966305780/front-left-side-47.jpg"))
    }
}

