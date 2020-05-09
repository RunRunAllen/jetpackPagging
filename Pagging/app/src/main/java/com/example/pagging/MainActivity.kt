package com.example.pagging

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.paging.PagedList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = RecyclerPagingAdapter()
        recycle_view.adapter = adapter
        val viewModel = ViewModelProvider(
            this
            , ViewModelProvider.NewInstanceFactory()
        ).get(PageViewModel::class.java)
        viewModel.liveData.observe(this,
            Observer<PagedList<Bean>> { list -> adapter.submitList(list) })

    }
}
