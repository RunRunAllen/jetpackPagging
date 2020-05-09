package com.example.pagging

import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder

class PageViewModel : ViewModel() {

//    companion object {
//        private const val PAGE_SIZE = 10
//        private const val REDUCE_SIZE = 1
//        private const val ENABLE_PLACEHOLDERS = false
//    }
//
//    val state: MutableLiveData<Int> by lazy {
//        MutableLiveData<Int>()
//    }
//    var fromType: String? = null
//    private fun initPaging(): PagedList.Config {
//        return PagedList.Config.Builder()
//            .setPageSize(PAGE_SIZE)
//            .setEnablePlaceholders(ENABLE_PLACEHOLDERS)//占位符
//            .setInitialLoadSizeHint(PAGE_SIZE) //首次加载的数据量
//            .setPrefetchDistance(REDUCE_SIZE)//距离底部还有多少条数据时开始预加载
//            .build()
//    }

    val liveData = LivePagedListBuilder<Int, Bean>(MyDataSourceFactory(), 10).build()
}