package com.example.pagging

import android.util.Log
import androidx.paging.PageKeyedDataSource

//1.PageKeyedDataSource 按页加载，如请求数据时传入page页码。
class PageKeyDataSource(private var dataRepository: DataRepository?) :
    PageKeyedDataSource<Int, Bean>() {

    override fun loadInitial(
        params: LoadInitialParams<Int?>,
        callback: LoadInitialCallback<Int?, Bean?>
    ) {
        val dataList: List<Bean>? =
            dataRepository?.initData(params.requestedLoadSize)
        Log.i("haha", "=======11111====" + dataList?.size)
        if (dataList != null) {
            callback.onResult(dataList, null, 2)
        }
    }

    override fun loadBefore(
        params: LoadParams<Int>,
        callback: LoadCallback<Int?, Bean?>
    ) {
        val dataList: List<Bean>? =
            dataRepository?.loadPageData(params.key, params.requestedLoadSize)
        if (dataList != null) {
            callback.onResult(dataList, params.key - 1)
        }
    }

    override fun loadAfter(
        params: LoadParams<Int>,
        callback: LoadCallback<Int?, Bean?>
    ) {
        val dataList: List<Bean>? =
            dataRepository?.loadPageData(params.key, params.requestedLoadSize)
        if (dataList != null) {
            callback.onResult(dataList, params.key + 1)
        }
    }
}